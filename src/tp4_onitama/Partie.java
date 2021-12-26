package tp4_onitama;

import java.util.Scanner;
import javax.swing.ImageIcon;

/*
Joueur [2] listeJoueurs 
Joueur joueurCourant
Grille GrilleJeu
Carte prochainDeplacement
boolean deplacementAutorise(Carte)
boolean etreGagnantPourJoueur(Joueur)
void initialiserPartie()
void attribuerCouleursAuxJoueurs()
*/

public class Partie {
    Joueur [] listeJoueurs = new Joueur[2];
    Joueur joueurCourant;
    Grille grilleJeu = new Grille();
    Carte [] listeCartes = new Carte[16];
    Carte [] cartesDisponibles = new Carte[5];
    
    // On donne des noms et des chemins aux cartes dans Images
    public ImageIcon img_boar = new javax.swing.ImageIcon(getClass().getResource("/Images/boar.jpg"));
    public ImageIcon img_cobra = new javax.swing.ImageIcon(getClass().getResource("/Images/cobra.jpg"));
    public ImageIcon img_crab = new javax.swing.ImageIcon(getClass().getResource("/Images/crab.jpg"));
    public ImageIcon img_crane = new javax.swing.ImageIcon(getClass().getResource("/Images/crane.jpg"));
    public ImageIcon img_dragon = new javax.swing.ImageIcon(getClass().getResource("/Images/dragon.jpg"));
    public ImageIcon img_eel = new javax.swing.ImageIcon(getClass().getResource("/Images/eel.jpg"));
    public ImageIcon img_elephant = new javax.swing.ImageIcon(getClass().getResource("/Images/elephant.jpg"));
    public ImageIcon img_frog = new javax.swing.ImageIcon(getClass().getResource("/Images/frog.jpg"));
    public ImageIcon img_goose = new javax.swing.ImageIcon(getClass().getResource("/Images/goose.jpg"));
    public ImageIcon img_horse = new javax.swing.ImageIcon(getClass().getResource("/Images/horse.jpg"));
    public ImageIcon img_mantis = new javax.swing.ImageIcon(getClass().getResource("/Images/mantis.jpg"));
    public ImageIcon img_monkey = new javax.swing.ImageIcon(getClass().getResource("/Images/mokey.jpg"));
    public ImageIcon img_ox = new javax.swing.ImageIcon(getClass().getResource("/Images/ox.jpg"));
    public ImageIcon img_rabbit = new javax.swing.ImageIcon(getClass().getResource("/Images/rabbit.jpg"));
    public ImageIcon img_rooster = new javax.swing.ImageIcon(getClass().getResource("/Images/rooster.jpg"));
    public ImageIcon img_tiger = new javax.swing.ImageIcon(getClass().getResource("/Images/tiger.jpg"));
    
    public Partie(){    
        
        // On initialise toute les cartes 
        int [][] b = {{0,-1},{1,0},{0,1}};
        Carte cboar = new Carte("Boar", b, img_boar);
        listeCartes[0] = cboar;

        int [][] co = {{0,-1},{1,1},{-1,1}};
        Carte ccobra = new Carte("Cobra", co, img_cobra);
        listeCartes[1] = ccobra;
        
        int [][] crab = {{0,-2},{1,0},{0,2}};
        Carte ccrab = new Carte("Crab", crab, img_crab);
        listeCartes[2] = ccrab;
        
        int [][] cran = {{-1,-1},{1,0},{-1,1}};
        Carte ccrane = new Carte("Boar", cran, img_crane);
        listeCartes[3] = ccrane;
        
        int [][] d = {{-1,-1},{1,-2},{1,2},{-1,1}};
        Carte cdragon = new Carte("Dragon", d, img_dragon);
        listeCartes[4] = cdragon;
        
        int [][] ee = {{1,-1},{-1,-1},{0,1}};
        Carte ceel = new Carte("Eel", ee, img_eel);
        listeCartes[5] = ceel;
        
        int [][] el = {{0,-1},{1,-1},{0,1},{1,1}};
        Carte celephant = new Carte("Elephant", el, img_elephant);
        listeCartes[6] = celephant;
        
        int [][] f = {{0,-2},{-1,1},{-1,1}};
        Carte cfrog = new Carte("Frog", f, img_frog);
        listeCartes[7] = cfrog;
        
        int [][] g = {{0,-1},{1,-1},{0,1},{-1,1}};
        Carte cgoose = new Carte("Goose", g, img_goose);
        listeCartes[8] = cgoose;
        
        int [][] h = {{-1,0},{0,-1},{1,0}};
        Carte chorse = new Carte("Horse", h, img_horse);
        listeCartes[9] = chorse;
        
        int [][] ma = {{1,-1},{1,1},{-1,0}};
        Carte cmantis = new Carte("Mantis", ma, img_mantis);
        listeCartes[10] = cmantis;

        int [][] mo = {{-1,-1},{-1,1},{1,1},{1,-1}};
        Carte cmonkey = new Carte("Monkey", mo, img_monkey);
        listeCartes[11] = cmonkey;

        int [][] o = {{1,0},{0,1},{0,1}};
        Carte cox = new Carte("Ox", o, img_ox);
        listeCartes[12] = cox;

        int [][] ra = {{-1,-1},{1,1},{0,2}};
        Carte crabbit = new Carte("Rabbit", ra, img_rabbit);
        listeCartes[13] = crabbit;

        int [][] roo = {{-1,-1},{1,1},{0,-1},{0,1}};
        Carte crooster = new Carte("Rooster", roo, img_rooster);
        listeCartes[14] = crooster;
        
        int [][] tig = {{2,0},{-1,0}};
        Carte ctiger = new Carte("Tiger", tig, img_tiger);
        listeCartes[15] = ctiger;
    }
     
    public void initialiserPartie(){
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Joueur 1 :");
        String j1 = sc.next();
        System.out.println("Joueur 2 :");
        String j2 = sc.next();
        
        listeJoueurs[0] = new Joueur(j1);
        listeJoueurs[1] = new Joueur(j2);
        
        int n = 15;
        for (int i = 0 ; i < 5 ; i++){
            double q = Math.random() * n;
            int r = (int) q;
            if (listeCartes[r] != null){
                cartesDisponibles[i] = listeCartes[r];
                listeCartes[r] = null;
                n = n-1;
            } else {
                double a = Math.random() * n;
                int b = (int) a;
                if (listeCartes[b] != null){
                    cartesDisponibles[i] = listeCartes[b];
                    listeCartes[b] = null;
                    n = n-1;
                }
            }
        }
    }       
            
    public boolean DeplacementAutorise(Carte uneCarte, int liDepart, int coDepart, int liArrive, int coArrive ) {

        if (uneCarte.DeplacementCarte(liDepart,coDepart,liArrive,coArrive)) {
            return true;
        }        
        else {
            return false;
        }
    }
        
    public boolean BougerPion(Pion unPion, Carte uneCarte, int liDepart, int coDepart, int liArrive, int coArrive ) {
        
        if (DeplacementAutorise(uneCarte,liDepart,coDepart,liArrive,coArrive)) {
            
            if (grilleJeu.caseOccupee(liArrive,coArrive) == false) {
                grilleJeu.enleverPion(liDepart, coDepart);
                grilleJeu.placerPion(unPion, liArrive, coArrive);
                return true;
            } 
            
            else {
                if (grilleJeu.lireCouleurPion(liArrive,coArrive) == joueurCourant.couleur) {
                    System.out.println("Il y a déja un pion de votre couleur sur cette case");
                    return false;
                }
                else {
                    grilleJeu.enleverPion(liArrive, coArrive);
                    grilleJeu.enleverPion(liDepart, coDepart);
                    grilleJeu.placerPion(unPion, liArrive, coArrive);
                    return true;
                }
            }
        }
        
        else {
            return false;
        }
    
    }
        
}

