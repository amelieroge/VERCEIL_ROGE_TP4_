package tp4_onitama;

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
    
    public Partie(){
        
        // On donne des noms et des chemins aux cartes dans Images
        ImageIcon img_boar = new javax.swing.ImageIcon(getClass().getResource("/Images/boar.jpg"));
        ImageIcon img_cobra = new javax.swing.ImageIcon(getClass().getResource("/Images/cobra.jpg"));
        ImageIcon img_crab = new javax.swing.ImageIcon(getClass().getResource("/Images/crab.jpg"));
        ImageIcon img_crane = new javax.swing.ImageIcon(getClass().getResource("/Images/crane.jpg"));
        ImageIcon img_dragon = new javax.swing.ImageIcon(getClass().getResource("/Images/dragon.jpg"));
        ImageIcon img_eel = new javax.swing.ImageIcon(getClass().getResource("/Images/eel.jpg"));
        ImageIcon img_elephant = new javax.swing.ImageIcon(getClass().getResource("/Images/elephant.jpg"));
        ImageIcon img_frog = new javax.swing.ImageIcon(getClass().getResource("/Images/frog.jpg"));
        ImageIcon img_goose = new javax.swing.ImageIcon(getClass().getResource("/Images/goose.jpg"));
        ImageIcon img_horse = new javax.swing.ImageIcon(getClass().getResource("/Images/horse.jpg"));
        ImageIcon img_mantis = new javax.swing.ImageIcon(getClass().getResource("/Images/mantis.jpg"));
        ImageIcon img_monkey = new javax.swing.ImageIcon(getClass().getResource("/Images/mokey.jpg"));
        ImageIcon img_ox = new javax.swing.ImageIcon(getClass().getResource("/Images/ox.jpg"));
        ImageIcon img_rabbit = new javax.swing.ImageIcon(getClass().getResource("/Images/rabbit.jpg"));
        ImageIcon img_rooster = new javax.swing.ImageIcon(getClass().getResource("/Images/rooster.jpg"));
        ImageIcon img_tiger = new javax.swing.ImageIcon(getClass().getResource("/Image/tiger.jpg"));    
        
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
        
    public boolean DeplacementAutorise(Carte uneCarte, int liDepart, int coDepart, int liArrive, int coArrive ) {

        if (uneCarte.DeplacementCarte(liDepart,coDepart,liArrive,coArrive)) {
            return true;
        }        
        else {
            return false;
        }

    }
    
    // renvoie true si le joueur à atteint la case du trone adverse 
    public boolean gagnantcase(int ligne, int colonne){
        if (joueurCourant == listeJoueurs[0] && ligne == 2 && colonne == 4) {
            return true;
        }  
        else if (joueurCourant == listeJoueurs[1] && ligne == 2 && colonne == 0) {
            return true;
        }               
        else {
            return false;
        }    
    }

    // Renvoie true si la partie est gagné par le joueur courant
    public boolean BougerPion(Pion unPion, Carte uneCarte, int liDepart, int coDepart, int liArrive, int coArrive ) {
        
        //test si le déplacement est autorisé
        if (DeplacementAutorise(uneCarte,liDepart,coDepart,liArrive,coArrive)) {
            
            // test si la case est occupé
            if (grilleJeu.caseOccupee(liArrive,coArrive) == false) {
                // test si la case du throne adverse est atteinte par le joueur courant
                if (gagnantcase(liArrive,coArrive)){
                    return true;
                }
                else {
                grilleJeu.enleverPion(liDepart, coDepart);
                grilleJeu.placerPion(unPion, liArrive, coArrive);
                return false;
                }
                
            }
            
            else {
                // test de la couleur du jeton
                if (grilleJeu.lireCouleurPion(liArrive,coArrive) == joueurCourant.couleur) {
                    System.out.println("Il y a déja un pion de votre couleur sur cette case");
                    return false;
                }
                else {
                    // test si la case du throne adverse est atteinte par le joueur courant
                    if (gagnantcase(liArrive,coArrive)){
                        return true;
                    }
                    // test sile roi adverse est détruit
                    else if (grilleJeu.typePionGrille(liArrive, coArrive) == "Roi") {
                        return true;
                    }
                    else {
                        grilleJeu.enleverPion(liArrive, coArrive);
                        grilleJeu.enleverPion(liDepart, coDepart);
                        grilleJeu.placerPion(unPion, liArrive, coArrive);
                        return false;
                    }
                }
            }
        }
        
        else {  
            return false;
        }
    
    }
        
}

