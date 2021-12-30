/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tp4_onitama;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.geom.AffineTransform;
import java.util.Random;
import javax.swing.ImageIcon;
        
/**
 *
 * @author thvel
 */
public class fenetreDeJeu extends javax.swing.JFrame {

    Joueur [] ListeJoueur = new Joueur[2];
    Joueur joueurCourant;
    Grille grilleJeu = new Grille();
    Carte [] listeCartes = new Carte[16];
    Carte [] cartesDisponibles = new Carte[5];
    Carte carteRestante;
    Carte carteSelectionne;
    Joueur j1;
    Joueur j2;

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
    
    // initialisation des zones de cartes
    
    ZoneCarte Zonej1_0 = new ZoneCarte (img_vide);
    ZoneCarte Zonej1_1 = new ZoneCarte (img_vide);
    ZoneCarte Zonej2_0 = new ZoneCarte (img_vide);
    ZoneCarte Zonej2_1 = new ZoneCarte (img_vide);
    ZoneCarte ZoneMilieu = new ZoneCarte (img_vide);
    
    
    public fenetreDeJeu() {
        initComponents();
    
        // On bloque les boutons sauf celui des règles de jeux et celui de débuter partie
        
        patternMilieu.setEnabled(true);
        patternJ1_0.setEnabled(true);
        patternJ1_1.setEnabled(true);
        patternJ2_0.setEnabled(true);
        patternJ2_1.setEnabled(true);
        
          // On initialise toute les cartes dans le sens orizontale
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

        /*Le joueur choisit sa carte
        Le joueur choisit son mouvement
        le pion bouge
        la carte choisit est échangé avec la carte du milieu (pattern joue)
        le joueur récupère la carte du milieu avec adaptation des coordonnées*/

        
  
        // On initialise les boutons des cases de la grille de jeu 
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j < 5; j++) {
                CaseGraphique caseGraph = new CaseGraphique(grilleJeu.CaseJeu[i][j]);
                //panneau_grille.add(caseGraph);
                caseGraph.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        Case ca = caseGraph.CaseAssocie;
                        if (ca.PresencePion() != false && ca.LirecouleurJetonCase() == joueurCourant.couleur){
                            grilleJeu.cliqueSurCase(ca.coordone);
                        }
                        else if (grilleJeu.CoordCaseClique[0] != 5){
                            if (BougerPion(grilleJeu.CoordCaseClique[0], grilleJeu.CoordCaseClique[1], ca.coordone[0], ca.coordone[1])){
                                // WIIINNN
                                for (int i = 4; i >= 0; i--) {
                                    for (int j = 0; j < 5; j++) {
                                        caseGraph.setEnabled(false);
                                    }   
                                }
                            }
                            // on change de joueur et on réinitialise
                            joueurSuivant();
                            grilleJeu.CoordCaseClique[0] = 5;
                            grilleJeu.CoordCaseClique[1] = 5;    
                            lbl_joueurCourant.setText(joueurCourant.nom);
                            
                            int n;
                            if (joueurCourant == ListeJoueur[0]){
                                n = 0;
                            }
                            else n = 1;
                            
                            echangerCarte(joueurCourant, carteSelectionne, n);
                        }
                        panneau_grille.repaint();
                    }
                });
                panneau_grille.add(caseGraph);
                
            }
        }
    }   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        lbl_j1_couleur = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_j2_couleur = new javax.swing.JLabel();
        button1 = new java.awt.Button();
        panneau_J1 = new javax.swing.JPanel();
        patternJ1_0 = new javax.swing.JButton();
        patternJ1_1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbl_j1_nom = new javax.swing.JLabel();
        panneau_grille = new javax.swing.JPanel();
        panneau_carteDisponible = new javax.swing.JPanel();
        patternMilieu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        message = new javax.swing.JTextPane();
        panneau_J2 = new javax.swing.JPanel();
        patternJ2_0 = new javax.swing.JButton();
        patternJ2_1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_j2_nom = new javax.swing.JLabel();
        panneau_partie = new javax.swing.JPanel();
        btn_demarer = new javax.swing.JButton();
        set_joueur1 = new javax.swing.JTextField();
        set_joueur2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbl_joueurCourant = new javax.swing.JLabel();
        btn_reglesJeu = new javax.swing.JToggleButton();

        jLabel3.setText("jLabel3");

        jButton2.setText("jButton2");

        jButton1.setText("jButton1");

        jButton4.setText("jButton4");

        jButton3.setText("jButton3");

        jButton7.setText("jButton7");

        jButton5.setText("jButton5");

        jButton6.setText("jButton6");

        jButton9.setText("jButton9");

        jButton8.setText("jButton8");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Couleur :");

        lbl_j1_couleur.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_j1_couleur.setText("couleurJ1");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Couleur");

        lbl_j2_couleur.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_j2_couleur.setText("couleurJ2");

        button1.setLabel("button1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_J1.setBackground(new java.awt.Color(255, 204, 0));
        panneau_J1.setLayout(new java.awt.GridLayout(1, 2));

        patternJ1_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patternJ1_0ActionPerformed(evt);
            }
        });
        panneau_J1.add(patternJ1_0);

        patternJ1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patternJ1_1ActionPerformed(evt);
            }
        });
        panneau_J1.add(patternJ1_1);

        getContentPane().add(panneau_J1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 344, 300));

        jPanel4.setBackground(new java.awt.Color(180, 180, 200));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Joueur blanc");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Nom :");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        lbl_j1_nom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_j1_nom.setText("nomJ1");
        jPanel4.add(lbl_j1_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 344, 150));

        panneau_grille.setBackground(new java.awt.Color(0, 0, 0));
        panneau_grille.setToolTipText("");
        panneau_grille.setLayout(new java.awt.GridLayout(5, 5));
        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 600, 600));

        panneau_carteDisponible.setBackground(new java.awt.Color(0, 0, 0));
        panneau_carteDisponible.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patternMilieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patternMilieuActionPerformed(evt);
            }
        });
        panneau_carteDisponible.add(patternMilieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 172));

        getContentPane().add(panneau_carteDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 630, 300, 172));

        jScrollPane1.setViewportView(message);
        message.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 340, 310));

        panneau_J2.setBackground(new java.awt.Color(255, 204, 0));
        panneau_J2.setLayout(new java.awt.GridLayout(1, 2));

        patternJ2_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patternJ2_0ActionPerformed(evt);
            }
        });
        panneau_J2.add(patternJ2_0);

        patternJ2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patternJ2_1ActionPerformed(evt);
            }
        });
        panneau_J2.add(patternJ2_1);

        getContentPane().add(panneau_J2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 190, 344, 300));

        jPanel3.setBackground(new java.awt.Color(180, 180, 200));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Joueur noir");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Nom");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        lbl_j2_nom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_j2_nom.setText("nomJ2");
        jPanel3.add(lbl_j2_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 20, 344, 150));

        panneau_partie.setBackground(new java.awt.Color(0, 0, 0));
        panneau_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_demarer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_demarer.setText("Démarer Partie");
        btn_demarer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_demarerActionPerformed(evt);
            }
        });
        panneau_partie.add(btn_demarer, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        set_joueur1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        set_joueur1.setText("Entrer nom J1");
        set_joueur1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                set_joueur1ActionPerformed(evt);
            }
        });
        panneau_partie.add(set_joueur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        set_joueur2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        set_joueur2.setText("Entrer nom J2");
        set_joueur2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                set_joueur2ActionPerformed(evt);
            }
        });
        panneau_partie.add(set_joueur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Joueur 1");
        panneau_partie.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Joueur 2");
        panneau_partie.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Joueur courant :");
        panneau_partie.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        lbl_joueurCourant.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_joueurCourant.setForeground(new java.awt.Color(240, 240, 240));
        lbl_joueurCourant.setText("joueurCourant");
        panneau_partie.add(lbl_joueurCourant, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        btn_reglesJeu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_reglesJeu.setText("Règles du jeu");
        btn_reglesJeu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reglesJeuActionPerformed(evt);
            }
        });
        panneau_partie.add(btn_reglesJeu, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        getContentPane().add(panneau_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 510, 340, 300));

        setBounds(0, 0, 1380, 868);
    }// </editor-fold>//GEN-END:initComponents

    private void set_joueur2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_set_joueur2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_set_joueur2ActionPerformed

    private void set_joueur1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_set_joueur1ActionPerformed
       
    }//GEN-LAST:event_set_joueur1ActionPerformed

    private void btn_demarerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_demarerActionPerformed
        initialiserPartie();
        panneau_grille.repaint();
        btn_demarer.setEnabled(false);
        patternMilieu.setEnabled(false);
    }//GEN-LAST:event_btn_demarerActionPerformed

    private void patternMilieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patternMilieuActionPerformed
        echangerCarte (j1, j1.patterns[0], 0);
    }//GEN-LAST:event_patternMilieuActionPerformed

    private void patternJ2_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patternJ2_0ActionPerformed
        if (joueurCourant == ListeJoueur[1]){
            carteSelectionne = ListeJoueur[1].patterns[0];
            message.setText("Le pattern choisi est " + carteSelectionne.Nom);}
        else message.setText("Ce n'est pas à toi de jouer");
    }//GEN-LAST:event_patternJ2_0ActionPerformed

    private void patternJ2_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patternJ2_1ActionPerformed
        if (joueurCourant == ListeJoueur[1]){
            carteSelectionne = ListeJoueur[1].patterns[1];
            message.setText("Le pattern choisi est " + carteSelectionne.Nom);}
        else message.setText("Ce n'est pas à toi de jouer");
    }//GEN-LAST:event_patternJ2_1ActionPerformed

    private void btn_reglesJeuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reglesJeuActionPerformed
        RegleJeu a = new RegleJeu();
        a.setVisible(true);
    }//GEN-LAST:event_btn_reglesJeuActionPerformed

    private void patternJ1_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patternJ1_0ActionPerformed
        if (joueurCourant == ListeJoueur[0]){
            carteSelectionne = ListeJoueur[0].patterns[0];
            message.setText("Le pattern choisi est " + carteSelectionne.Nom);}
        else message.setText("Ce n'est pas à toi de jouer");
    }//GEN-LAST:event_patternJ1_0ActionPerformed

    private void patternJ1_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patternJ1_1ActionPerformed
        if (joueurCourant == j1){
            carteSelectionne = j1.patterns[1];
            message.setText("Le pattern choisi est " + carteSelectionne.Nom);}
        else message.setText("Ce n'est pas à toi de jouer");
    }//GEN-LAST:event_patternJ1_1ActionPerformed
 
    
   /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fenetreDeJeu().setVisible(true);
            }
        });
    }

    public void joueurSuivant(){
        if (joueurCourant == j1){
            joueurCourant = j2;
        }
        else {
           joueurCourant = j1;
        }
    }
    
    // cette fonction permet d'échanger 2 carte en adaptant leurs affichages, et leurs patterns
    public void echangerCarte (Joueur unjoueur, Carte carteJoueur, int numéroCarte) {
        if (unjoueur == j1) {
            Carte newCarteJoueur = carteRestante;
            Carte newCarteMilieu = carteJoueur;
            
            // on adapte les pattern
            newCarteJoueur.Pattern = carteJoueur.rotaJGauche();
            newCarteMilieu.Pattern = carteRestante.rotaJDroite();
            
            // on échange
            unjoueur.patterns[numéroCarte] = newCarteJoueur;
            carteRestante = newCarteMilieu;
            
            // on adapte les affichages
            if (numéroCarte == 0) {
                Zonej1_0.ImageAssocie = newCarteJoueur.Images[1];
                patternJ1_0.add(Zonej1_0);
            }
            if (numéroCarte == 1) {
                Zonej1_1.ImageAssocie = newCarteJoueur.Images[1];
                patternJ1_1.add(Zonej1_1);
            }
            ZoneMilieu.ImageAssocie = newCarteMilieu.Images[0];
            patternMilieu.add(ZoneMilieu);    
        }
        
        if (unjoueur == j2) {
            Carte newCarteJoueur = carteRestante;
            Carte newCarteMilieu = carteJoueur;
            
            newCarteJoueur.Pattern = carteJoueur.rotaJDroite();
            newCarteMilieu.Pattern = carteRestante.rotaJGauche();
            
            unjoueur.patterns[numéroCarte] = newCarteJoueur;
            carteRestante = newCarteMilieu;
            
            if (numéroCarte == 0) {
                Zonej2_0.ImageAssocie = newCarteJoueur.Images[2];
                patternJ2_0.add(Zonej2_0);
            }
            if (numéroCarte == 1) {
                Zonej2_1.ImageAssocie = newCarteJoueur.Images[2];
                patternJ2_1.add(Zonej2_1);
            }
            ZoneMilieu.ImageAssocie = newCarteMilieu.Images[0];
            patternMilieu.add(ZoneMilieu);
        }
        // on rafraichie
        panneau_J1.repaint();
        panneau_J2.repaint();
        panneau_carteDisponible.repaint();   
    }
    
    public void initialiserPartie(){
        
        // Scan des noms entrés dans les champs du panel partie
        String nomJoueur1 = set_joueur1.getText();
        j1 = new Joueur(nomJoueur1);
        String nomJoueur2 = set_joueur2.getText();
        j2 = new Joueur(nomJoueur2);
       
        // on définie quel sera le premier joueur
        Random r = new Random();
        int R = r.nextInt(2);
        if (R == 0) {
            ListeJoueur[0] = j1;
            ListeJoueur[1] = j2;
        } else {
            ListeJoueur[1] = j1;
            ListeJoueur[0] = j2;
        }
        
        // on affecte la couleur correspondante
        ListeJoueur[0].affecterCouleur("Blanc");
        ListeJoueur[1].affecterCouleur("Noir");
        
        // on met à jours l'affichage
        lbl_j1_nom.setText(ListeJoueur[0].nom);
        lbl_j2_nom.setText(ListeJoueur[1].nom);
       
        // on initialises les 10 pions
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
        
        // on initialise le premier joueur
        joueurCourant = ListeJoueur[0];
        lbl_joueurCourant.setText(joueurCourant.nom);
       
        
        // on met ici 5 cartes à jouer aléatoires dans les cartes à disposition des joueurs

        for (int i = 0 ; i < 5 ; i++){
            double q = Math.random() * 15;
            int w = (int) q;
            if (listeCartes[w] == null){
                i--;
                
            }
            else {
                cartesDisponibles[i] = listeCartes[w];
                listeCartes[w] = null;
                
            }
        }
        
        // on répartit les cartes disponibles entre les deux joueurs et sur le bord du plateau
        carteRestante = cartesDisponibles[0];
        j1.tirerUneCarte(cartesDisponibles[1]);
        j1.tirerUneCarte(cartesDisponibles[2]);
        j2.tirerUneCarte(cartesDisponibles[3]);
        j2.tirerUneCarte(cartesDisponibles[4]);
      
         // on initialise les cartes sur leurs zones de départ
        int [][] a = j1.patterns[0].rotaJGauche();
        Carte pattern0TourneJGauche = new Carte(j1.patterns[0].Nom, a, j1.patterns[0].Images[0], j1.patterns[0].Images[1], j1.patterns[0].Images[2]); 
        Zonej1_0.ImageAssocie = j1.patterns[0].Images[1];
        patternJ1_0.add(Zonej1_0);
        
        int [][] b = j1.patterns[1].rotaJGauche();
        Carte pattern1TourneJGauche = new Carte(j1.patterns[1].Nom, b, j1.patterns[1].Images[0], j1.patterns[1].Images[1], j1.patterns[1].Images[2]);
        Zonej1_1.ImageAssocie = j1.patterns[1].Images[1];
        patternJ1_1.add(Zonej1_1);
        
        int [][] c = j2.patterns[0].rotaJDroite();
        Carte pattern0TourneJDroite = new Carte(j2.patterns[0].Nom, c, j2.patterns[0].Images[0], j2.patterns[0].Images[1], j2.patterns[0].Images[2]);
        Zonej2_0.ImageAssocie = j2.patterns[0].Images[2];
        patternJ2_0.add(Zonej2_0);
        
        int [][] d = j2.patterns[1].rotaJDroite();
        Carte pattern1TourneJDroite = new Carte(j2.patterns[1].Nom, d, j2.patterns[1].Images[0], j2.patterns[1].Images[1], j2.patterns[1].Images[2]);
        Zonej2_1.ImageAssocie = j2.patterns[1].Images[2];
        patternJ2_1.add(Zonej2_1);
        
        ZoneMilieu.ImageAssocie = carteRestante.Images[0];
        patternMilieu.add(ZoneMilieu);
                                        
        // on rafraichie l'affichage
        panneau_J1.repaint();
        panneau_J2.repaint();
        panneau_carteDisponible.repaint();
        panneau_grille.repaint();
    }   
  
    public boolean DeplacementAutorise(int liDepart, int coDepart, int liArrive, int coArrive ) {

        if (carteSelectionne.DeplacementCarte(liDepart,coDepart,liArrive,coArrive)) {
            return true;
        }        
        else {
            return false;
        }
    }
    
    // renvoie true si le joueur à atteint la case du trone adverse 
    public boolean gagnantcase(int ligne, int colonne){
        if (joueurCourant == ListeJoueur[0] && ligne == 2 && colonne == 4) {
            return true;
        }  
        else if (joueurCourant == ListeJoueur[1] && ligne == 2 && colonne == 0) {
            return true;
        }               
        else {
            return false;
        }    
    }

    // Renvoie true si la partie est gagné par le joueur courant
    public boolean BougerPion(int liDepart, int coDepart, int liArrive, int coArrive ) {
        
        //test si le déplacement est autorisé
        if (DeplacementAutorise(liDepart,coDepart,liArrive,coArrive)) {
            
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
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_demarer;
    private javax.swing.JToggleButton btn_reglesJeu;
    private java.awt.Button button1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_j1_couleur;
    private javax.swing.JLabel lbl_j1_nom;
    private javax.swing.JLabel lbl_j2_couleur;
    private javax.swing.JLabel lbl_j2_nom;
    private javax.swing.JLabel lbl_joueurCourant;
    private javax.swing.JTextPane message;
    private javax.swing.JPanel panneau_J1;
    private javax.swing.JPanel panneau_J2;
    private javax.swing.JPanel panneau_carteDisponible;
    private javax.swing.JPanel panneau_grille;
    private javax.swing.JPanel panneau_partie;
    private javax.swing.JButton patternJ1_0;
    private javax.swing.JButton patternJ1_1;
    private javax.swing.JButton patternJ2_0;
    private javax.swing.JButton patternJ2_1;
    private javax.swing.JButton patternMilieu;
    private javax.swing.JTextField set_joueur1;
    private javax.swing.JTextField set_joueur2;
    // End of variables declaration//GEN-END:variables
}
