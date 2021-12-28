package tp4_onitama;

import java.util.Random;
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
    
    // import des images
    // on en importe 3 par carte, vu que l'on a 3 orientations différentes
    // "gauche" signifie que c'est la carte qui sera disposée du côté gauche du plateau, idem pour "droite"
    public ImageIcon img_boar = new javax.swing.ImageIcon(getClass().getResource("/Images/boar.jpg"));
    public ImageIcon img_boar_gauche = new javax.swing.ImageIcon(getClass().getResource("/Images/boarG.jpg"));
    public ImageIcon img_boar_droite = new javax.swing.ImageIcon(getClass().getResource("/Images/boarD.jpg"));
    
    public ImageIcon img_cobra = new javax.swing.ImageIcon(getClass().getResource("/Images/cobra.jpg"));
    public ImageIcon img_cobra_gauche = new javax.swing.ImageIcon(getClass().getResource("/Images/cobraG.jpg"));
    public ImageIcon img_cobra_droite = new javax.swing.ImageIcon(getClass().getResource("/Images/cobraD.jpg"));
    
    public ImageIcon img_crab = new javax.swing.ImageIcon(getClass().getResource("/Images/crab.jpg"));
    public ImageIcon img_crab_gauche = new javax.swing.ImageIcon(getClass().getResource("/Images/crabG.jpg"));
    public ImageIcon img_crab_droite = new javax.swing.ImageIcon(getClass().getResource("/Images/crabD.jpg"));
    
    public ImageIcon img_crane = new javax.swing.ImageIcon(getClass().getResource("/Images/crane.jpg"));
    public ImageIcon img_crane_gauche = new javax.swing.ImageIcon(getClass().getResource("/Images/craneG.jpg"));
    public ImageIcon img_crane_droite = new javax.swing.ImageIcon(getClass().getResource("/Images/craneD.jpg"));
    
    public ImageIcon img_dragon = new javax.swing.ImageIcon(getClass().getResource("/Images/dragon.jpg"));
    public ImageIcon img_dragon_gauche = new javax.swing.ImageIcon(getClass().getResource("/Images/dragonG.jpg"));
    public ImageIcon img_dragon_droite = new javax.swing.ImageIcon(getClass().getResource("/Images/dragonD.jpg"));
    
    public ImageIcon img_eel = new javax.swing.ImageIcon(getClass().getResource("/Images/eel.jpg"));
    public ImageIcon img_eel_gauche = new javax.swing.ImageIcon(getClass().getResource("/Images/eelG.jpg"));
    public ImageIcon img_eel_droite = new javax.swing.ImageIcon(getClass().getResource("/Images/eelD.jpg"));
    
    public ImageIcon img_elephant = new javax.swing.ImageIcon(getClass().getResource("/Images/elephant.jpg"));
    public ImageIcon img_elephant_gauche = new javax.swing.ImageIcon(getClass().getResource("/Images/elephantG.jpg"));
    public ImageIcon img_elephant_droite = new javax.swing.ImageIcon(getClass().getResource("/Images/elephantD.jpg"));
    
    public ImageIcon img_frog = new javax.swing.ImageIcon(getClass().getResource("/Images/frog.jpg"));
    public ImageIcon img_frog_gauche = new javax.swing.ImageIcon(getClass().getResource("/Images/frogG.jpg"));
    public ImageIcon img_frog_droite = new javax.swing.ImageIcon(getClass().getResource("/Images/frogD.jpg"));
    
    public ImageIcon img_goose = new javax.swing.ImageIcon(getClass().getResource("/Images/goose.jpg"));
    public ImageIcon img_goose_gauche = new javax.swing.ImageIcon(getClass().getResource("/Images/gooseG.jpg"));
    public ImageIcon img_goose_droite = new javax.swing.ImageIcon(getClass().getResource("/Images/gooseD.jpg"));
    
    public ImageIcon img_horse = new javax.swing.ImageIcon(getClass().getResource("/Images/horse.jpg"));
    public ImageIcon img_horse_gauche = new javax.swing.ImageIcon(getClass().getResource("/Images/horseG.jpg"));
    public ImageIcon img_horse_droite = new javax.swing.ImageIcon(getClass().getResource("/Images/horseD.jpg"));
    
    public ImageIcon img_mantis = new javax.swing.ImageIcon(getClass().getResource("/Images/mantis.jpg"));
    public ImageIcon img_mantis_gauche = new javax.swing.ImageIcon(getClass().getResource("/Images/mantisG.jpg"));
    public ImageIcon img_mantis_droite = new javax.swing.ImageIcon(getClass().getResource("/Images/mantisD.jpg"));
    
    public ImageIcon img_monkey = new javax.swing.ImageIcon(getClass().getResource("/Images/monkey.jpg"));
    public ImageIcon img_monkey_gauche = new javax.swing.ImageIcon(getClass().getResource("/Images/monkeyG.jpg"));
    public ImageIcon img_monkey_droite = new javax.swing.ImageIcon(getClass().getResource("/Images/monkeyD.jpg"));
    
    public ImageIcon img_ox = new javax.swing.ImageIcon(getClass().getResource("/Images/ox.jpg"));
    public ImageIcon img_ox_gauche = new javax.swing.ImageIcon(getClass().getResource("/Images/oxG.jpg"));
    public ImageIcon img_ox_droite = new javax.swing.ImageIcon(getClass().getResource("/Images/oxD.jpg"));
    
    public ImageIcon img_rabbit = new javax.swing.ImageIcon(getClass().getResource("/Images/rabbit.jpg"));
    public ImageIcon img_rabbit_gauche = new javax.swing.ImageIcon(getClass().getResource("/Images/rabbitG.jpg"));
    public ImageIcon img_rabbit_droite = new javax.swing.ImageIcon(getClass().getResource("/Images/rabbitD.jpg"));
    
    public ImageIcon img_rooster = new javax.swing.ImageIcon(getClass().getResource("/Images/rooster.jpg"));
    public ImageIcon img_rooster_gauche = new javax.swing.ImageIcon(getClass().getResource("/Images/roosterG.jpg"));
    public ImageIcon img_rooster_droite = new javax.swing.ImageIcon(getClass().getResource("/Images/roosterD.jpg"));
    
    public ImageIcon img_tiger = new javax.swing.ImageIcon(getClass().getResource("/Images/tiger.jpg"));
    public ImageIcon img_tiger_gauche = new javax.swing.ImageIcon(getClass().getResource("/Images/tigerG.jpg"));
    public ImageIcon img_tiger_droite = new javax.swing.ImageIcon(getClass().getResource("/Images/tigerD.jpg"));
    
    public ImageIcon img_vide = new javax.swing.ImageIcon(getClass().getResource("/Images/image_vide.png"));
    
    public ImageIcon case_vide = new javax.swing.ImageIcon(getClass().getResource("/Images/case_vide1.png"));
    public ImageIcon pion_blanc = new javax.swing.ImageIcon(getClass().getResource("/Images/pion_blanc1.png"));
    public ImageIcon pion_noir = new javax.swing.ImageIcon(getClass().getResource("/Images/pion_noir1.png"));
    public ImageIcon roi_blanc = new javax.swing.ImageIcon(getClass().getResource("/Images/roi_blanc1.png"));
    public ImageIcon roi_noir = new javax.swing.ImageIcon(getClass().getResource("/Images/roi_noir1.png"));
    public ImageIcon trone_vide = new javax.swing.ImageIcon(getClass().getResource("/Images/trone1.png"));
    
    public Partie(){ 
        
          // On initialise toute les cartes 
         int [][] b = {{0,-1},{1,0},{0,1}};
        Carte cboar = new Carte("Boar", b, img_boar, img_boar_gauche, img_boar_droite);
        listeCartes[0] = cboar;

        int [][] co = {{0,-1},{1,1},{-1,1}};
        Carte ccobra = new Carte("Cobra", co, img_cobra, img_cobra_gauche, img_cobra_droite);
        listeCartes[1] = ccobra;
        
        int [][] crab = {{0,-2},{1,0},{0,2}};
        Carte ccrab = new Carte("Crab", crab, img_crab, img_crab_gauche, img_crab_droite);
        listeCartes[2] = ccrab;
        
        int [][] cran = {{-1,-1},{1,0},{-1,1}};
        Carte ccrane = new Carte("Boar", cran, img_crane, img_crane_gauche, img_crane_droite);
        listeCartes[3] = ccrane;
        
        int [][] d = {{-1,-1},{1,-2},{1,2},{-1,1}};
        Carte cdragon = new Carte("Dragon", d, img_dragon, img_dragon_gauche, img_dragon_droite);
        listeCartes[4] = cdragon;
        
        int [][] ee = {{1,-1},{-1,-1},{0,1}};
        Carte ceel = new Carte("Eel", ee, img_eel, img_eel_gauche, img_eel_droite);
        listeCartes[5] = ceel;
        
        int [][] el = {{0,-1},{1,-1},{0,1},{1,1}};
        Carte celephant = new Carte("Elephant", el, img_elephant, img_elephant_gauche, img_elephant_droite);
        listeCartes[6] = celephant;
        
        int [][] f = {{0,-2},{-1,1},{-1,1}};
        Carte cfrog = new Carte("Frog", f, img_frog, img_frog_gauche, img_frog_droite);
        listeCartes[7] = cfrog;
        
        int [][] g = {{0,-1},{1,-1},{0,1},{-1,1}};
        Carte cgoose = new Carte("Goose", g, img_goose, img_goose_gauche, img_goose_droite);
        listeCartes[8] = cgoose;
        
        int [][] h = {{-1,0},{0,-1},{1,0}};
        Carte chorse = new Carte("Horse", h, img_horse, img_horse_gauche, img_horse_droite);
        listeCartes[9] = chorse;
        
        int [][] ma = {{1,-1},{1,1},{-1,0}};
        Carte cmantis = new Carte("Mantis", ma, img_mantis, img_mantis_gauche, img_mantis_droite);
        listeCartes[10] = cmantis;

        int [][] mo = {{-1,-1},{-1,1},{1,1},{1,-1}};
        Carte cmonkey = new Carte("Monkey", mo, img_monkey, img_monkey_gauche, img_monkey_droite);
        listeCartes[11] = cmonkey;

        int [][] o = {{1,0},{0,1},{0,1}};
        Carte cox = new Carte("Ox", o, img_ox, img_ox_gauche, img_ox_droite);
        listeCartes[12] = cox;

        int [][] ra = {{-1,-1},{1,1},{0,2}};
        Carte crabbit = new Carte("Rabbit", ra, img_rabbit, img_rabbit_gauche, img_rabbit_droite);
        listeCartes[13] = crabbit;

        int [][] roo = {{-1,-1},{1,1},{0,-1},{0,1}};
        Carte crooster = new Carte("Rooster", roo, img_rooster, img_rooster_gauche, img_rooster_droite);
        listeCartes[14] = crooster;
        
        int [][] tig = {{2,0},{-1,0}};
        Carte ctiger = new Carte("Tiger", tig, img_tiger, img_tiger_gauche, img_tiger_droite);
        listeCartes[15] = ctiger;
    }
     
    public void initialiserPartie(){
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Joueur 1 :");
        String j1 = sc.next();
        System.out.println("Joueur 2 :");
        String j2 = sc.next();
        
        Joueur J1 = new Joueur(j1);
        Joueur J2 = new Joueur(j2);
        
        Random r = new Random();
        int R = r.nextInt(2); // on créé ici un entier aléatoire entre 0 et 1
        if (R == 0) {
            listeJoueurs[0] = J1;
            listeJoueurs[1] = J2;
        } else {
            listeJoueurs[1] = J1;
            listeJoueurs[0] = J2; // on affecte les joueurs à des places aléatoires dans la liste
        }
        
        listeJoueurs[0].affecterCouleur("Blanc");
        listeJoueurs[1].affecterCouleur("Noir");
        
        // on met ici 5 cartes à jouer aléatoires dans les cartes à disposition des joueurs
        int n = 15;
        for (int i = 0 ; i < 5 ; i++){
            double q = Math.random() * n;
            int w = (int) q;
            if (listeCartes[w] != null){
                cartesDisponibles[i] = listeCartes[w];
                listeCartes[w] = null;
                n = n-1;
                i = i-1;
            }
        }
        
        grilleJeu.CaseJeu[0][0].PoserPion(new Pion("Blanc", false));
        grilleJeu.CaseJeu[1][0].PoserPion(new Pion("Blanc", false));
        grilleJeu.CaseJeu[2][0].PoserPion(new Pion("Blanc", true));
        grilleJeu.CaseJeu[3][0].PoserPion(new Pion("Blanc", false));
        grilleJeu.CaseJeu[4][0].PoserPion(new Pion("Blanc", false));
        
        grilleJeu.CaseJeu[0][4].PoserPion(new Pion("Noir", false));
        grilleJeu.CaseJeu[1][4].PoserPion(new Pion("Noir", false));
        grilleJeu.CaseJeu[2][4].PoserPion(new Pion("Noir", true));
        grilleJeu.CaseJeu[3][4].PoserPion(new Pion("Noir", false));
        grilleJeu.CaseJeu[4][4].PoserPion(new Pion("Noir", false));
        
        if (J1.couleur == "Blanc")
            joueurCourant = J1;
        else joueurCourant = J2;
        
        System.out.println(joueurCourant.nom);
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
                // test si la case du throne adverse est atteinte par le roi du joueur courant
                if (gagnantcase(liArrive,coArrive) && grilleJeu.typePionGrille(liDepart, coDepart) == "Roi" ){
                    return true;
                }
                else {
                Pion Pionrecupere = grilleJeu.enleverPion(liDepart, coDepart);
                grilleJeu.placerPion(Pionrecupere, liArrive, coArrive);
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
                    // test si la case du throne adverse est atteinte par le roi du joueur courant
                    if (gagnantcase(liArrive,coArrive) && grilleJeu.typePionGrille(liDepart, coDepart) == "Roi" ){
                        return true;
                    }
                    // test si le roi adverse est détruit
                    else if (grilleJeu.typePionGrille(liArrive, coArrive) == "Roi") {
                        return true;
                    }
                    else {
                        grilleJeu.enleverPion(liArrive, coArrive);
                        Pion Pionrecupere = grilleJeu.enleverPion(liDepart, coDepart);
                        grilleJeu.placerPion(Pionrecupere, liArrive, coArrive);
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

