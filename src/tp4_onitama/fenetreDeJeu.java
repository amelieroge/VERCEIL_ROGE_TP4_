/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tp4_onitama;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
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
    Joueur j1;
    Joueur j2;

    // import des images
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
    public ImageIcon img_monkey = new javax.swing.ImageIcon(getClass().getResource("/Images/monkey.jpg"));
    public ImageIcon img_ox = new javax.swing.ImageIcon(getClass().getResource("/Images/ox.jpg"));
    public ImageIcon img_rabbit = new javax.swing.ImageIcon(getClass().getResource("/Images/rabbit.jpg"));
    public ImageIcon img_rooster = new javax.swing.ImageIcon(getClass().getResource("/Images/rooster.jpg"));
    public ImageIcon img_tiger = new javax.swing.ImageIcon(getClass().getResource("/Images/tiger.jpg"));
    public ImageIcon img_vide = new javax.swing.ImageIcon(getClass().getResource("/Images/image_vide.png"));
    
    
    public fenetreDeJeu() {
        initComponents();
        
        // On initialise les boutons des cases de la grille de jeu 
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j < 5; j++) {
                CaseGraphique caseGraph = new CaseGraphique(grilleJeu.CaseJeu[i][j]);
                panneau_grille.add(caseGraph);
            }
        }
      
                
        ZoneCarte a = new ZoneCarte(null);
        patternJ1_0.add(a);
        ZoneCarte z = new ZoneCarte(null);
        patternJ1_2.add(z);
        ZoneCarte e = new ZoneCarte(null);
        patternJ2_0.add(e);
        ZoneCarte r = new ZoneCarte(null);
        patternJ2_1.add(r);
        ZoneCarte t = new ZoneCarte(null);
        patternJoue.add(t);

          // On initialise toute les cartes dans le sens orizontale
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
        patternJ1_1 = new javax.swing.JButton();
        panneau_J1 = new javax.swing.JPanel();
        patternJ1_0 = new javax.swing.JButton();
        patternJ1_2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbl_j1_nom = new javax.swing.JLabel();
        lbl_j1_couleur = new javax.swing.JLabel();
        panneau_grille = new javax.swing.JPanel();
        panneau_carteDisponible = new javax.swing.JPanel();
        patternJoue = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        message = new javax.swing.JTextPane();
        panneau_J2 = new javax.swing.JPanel();
        patternJ2_0 = new javax.swing.JButton();
        patternJ2_1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_j2_nom = new javax.swing.JLabel();
        lbl_j2_couleur = new javax.swing.JLabel();
        panneau_partie = new javax.swing.JPanel();
        btn_demarer = new javax.swing.JButton();
        btn_reglesJeu = new javax.swing.JButton();
        set_joueur1 = new javax.swing.JTextField();
        set_joueur2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbl_joueurCourant = new javax.swing.JLabel();

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

        patternJ1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patternJ1_0ActionPerformed(evt);
            }
        });
        panneau_J1.add(patternJ1_2);

        getContentPane().add(panneau_J1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 300, 344));

        jPanel4.setBackground(new java.awt.Color(180, 180, 200));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Joueur blanc");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Couleur :");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Nom :");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        lbl_j1_nom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_j1_nom.setText("nomJ1");
        jPanel4.add(lbl_j1_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        lbl_j1_couleur.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_j1_couleur.setText("couleurJ1");
        jPanel4.add(lbl_j1_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 105, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 300, 150));

        panneau_grille.setBackground(new java.awt.Color(0, 0, 0));
        panneau_grille.setToolTipText("");
        panneau_grille.setLayout(new java.awt.GridLayout(5, 5));
        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 20, 600, 600));

        panneau_carteDisponible.setBackground(new java.awt.Color(0, 0, 0));
        panneau_carteDisponible.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patternJoue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patternJoueActionPerformed(evt);
            }
        });
        panneau_carteDisponible.add(patternJoue, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 172));

        getContentPane().add(panneau_carteDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 630, 300, 172));

        jScrollPane1.setViewportView(message);
        message.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 300, 250));

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

        getContentPane().add(panneau_J2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 190, 300, 344));

        jPanel3.setBackground(new java.awt.Color(180, 180, 200));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Joueur noir");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Nom");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Couleur");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        lbl_j2_nom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_j2_nom.setText("nomJ2");
        jPanel3.add(lbl_j2_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        lbl_j2_couleur.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_j2_couleur.setText("couleurJ2");
        jPanel3.add(lbl_j2_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, 300, 150));

        panneau_partie.setBackground(new java.awt.Color(0, 0, 0));
        panneau_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_demarer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_demarer.setText("Démarer Partie");
        btn_demarer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_demarerActionPerformed(evt);
            }
        });
        panneau_partie.add(btn_demarer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        btn_reglesJeu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_reglesJeu.setText("Règles du jeu");
        btn_reglesJeu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reglesJeuActionPerformed(evt);
            }
        });
        panneau_partie.add(btn_reglesJeu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        set_joueur1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        set_joueur1.setText("Entrer nom J1");
        set_joueur1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                set_joueur1ActionPerformed(evt);
            }
        });
        panneau_partie.add(set_joueur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        set_joueur2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        set_joueur2.setText("Entrer nom J2");
        set_joueur2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                set_joueur2ActionPerformed(evt);
            }
        });
        panneau_partie.add(set_joueur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Joueur 1");
        panneau_partie.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Joueur 2");
        panneau_partie.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Joueur courant :");
        panneau_partie.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        lbl_joueurCourant.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_joueurCourant.setForeground(new java.awt.Color(240, 240, 240));
        lbl_joueurCourant.setText("joueurCourant");
        panneau_partie.add(lbl_joueurCourant, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        getContentPane().add(panneau_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 560, 300, 260));

        setBounds(0, 0, 1316, 868);
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
        patternJoue.setEnabled(false);
    }//GEN-LAST:event_btn_demarerActionPerformed

    private void patternJ1_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patternJ1_0ActionPerformed
        
    }//GEN-LAST:event_patternJ1_0ActionPerformed

    private void patternJoueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patternJoueActionPerformed
        patternJoue.setEnabled(false);
    }//GEN-LAST:event_patternJoueActionPerformed

    private void patternJ2_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patternJ2_0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patternJ2_0ActionPerformed

    private void patternJ2_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patternJ2_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patternJ2_1ActionPerformed

    private void btn_reglesJeuActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
    }  

    
    
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
        lbl_j1_couleur.setText(ListeJoueur[0].couleur);
        lbl_j2_nom.setText(ListeJoueur[1].nom);
        lbl_j2_couleur.setText(ListeJoueur[1].couleur);
       
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
        int n = 15;
        for (int i = 0 ; i < 5 ; i++){
            double q = Math.random() * n;
            int w = (int) q;
            if (listeCartes[w] == null){
                n = n-1;
            }
            else {
                cartesDisponibles[i] = listeCartes[w];
                listeCartes[w] = null;
                
            }
        }
        
        // on distribue les 5 cartes aux joueurs
        carteRestante = cartesDisponibles[0];
        j1.tirerUneCarte(cartesDisponibles[1]);
        j1.tirerUneCarte(cartesDisponibles[2]);
        j2.tirerUneCarte(cartesDisponibles[3]);
        j2.tirerUneCarte(cartesDisponibles[4]);
      
        // on initialise les cartes sur leurs zones de départ
        
        
        ZoneCarte a = new ZoneCarte(j1.patterns[0]);
        patternJ1_0.add(a);
        
        if (j1.patterns[0] == null) {
            System.out.println("Pas de carte");
        }   
        else if (j1.patterns[0].Image == null) {
            System.out.println("Pas d'image"); 
        }  
        else {
            System.out.println("Image et carte !!!!");
            System.out.println(j1.patterns[0].Nom+"");
        }
        /*
        ZoneCarte z = new ZoneCarte(j1.patterns[1]);
        patternJ1_2.add(z);
        ZoneCarte e = new ZoneCarte(j2.patterns[0]);
        patternJ2_0.add(e);
        ZoneCarte p = new ZoneCarte(j2.patterns[1]);
        patternJ2_1.add(p);
        ZoneCarte t = new ZoneCarte(carteRestante);
        patternJoue.add(t);
        */

        // on rafraichie l'affichage
        panneau_J1.repaint();
        panneau_J2.repaint();
        panneau_carteDisponible.repaint();
        panneau_grille.repaint();
    }       
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_demarer;
    private javax.swing.JButton btn_reglesJeu;
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
    private javax.swing.JButton patternJ1_2;
    private javax.swing.JButton patternJ2_0;
    private javax.swing.JButton patternJ2_1;
    private javax.swing.JButton patternJoue;
    private javax.swing.JTextField set_joueur1;
    private javax.swing.JTextField set_joueur2;
    // End of variables declaration//GEN-END:variables
}
