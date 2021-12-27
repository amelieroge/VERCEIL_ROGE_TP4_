/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tp4_onitama;

/**
 *
 * @author thvel
 */
public class fenetreDeJeu extends javax.swing.JFrame {

    Joueur ListeJoueur[] = new Joueur[2];
    Joueur joueurCourant;
    Grille grilleJeu = new Grille();
    
    public fenetreDeJeu() {
        initComponents();
        
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j < 5; j++) {
                CaseGraphique caseGraph = new CaseGraphique(grilleJeu.CaseJeu[i][j]);
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

        panneau_J1 = new javax.swing.JPanel();
        panneau_grille = new javax.swing.JPanel();
        panneau_CarteDisponible = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        panneau_partie = new javax.swing.JPanel();
        panneau_J2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_J1.setBackground(new java.awt.Color(255, 204, 0));
        panneau_J1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(panneau_J1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 300, 500));

        panneau_grille.setBackground(new java.awt.Color(0, 0, 0));
        panneau_grille.setToolTipText("");
        panneau_grille.setLayout(new java.awt.GridLayout(5, 5));
        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 600, 600));

        panneau_CarteDisponible.setBackground(new java.awt.Color(0, 0, 0));
        panneau_CarteDisponible.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Démarer Partie");
        panneau_CarteDisponible.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jButton2.setText("Règles du jeu");
        panneau_CarteDisponible.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        jTextField1.setText("jTextField1");
        panneau_CarteDisponible.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 120, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Joueur 1");
        panneau_CarteDisponible.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        getContentPane().add(panneau_CarteDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 300, 290));

        panneau_partie.setBackground(new java.awt.Color(0, 0, 0));
        panneau_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(panneau_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 630, 300, 172));

        panneau_J2.setBackground(new java.awt.Color(255, 204, 0));
        panneau_J2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(panneau_J2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 300, 500));

        jScrollPane1.setViewportView(jTextPane1);
        jTextPane1.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 530, 300, 290));

        setBounds(0, 0, 1316, 868);
    }// </editor-fold>//GEN-END:initComponents

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
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JPanel panneau_CarteDisponible;
    private javax.swing.JPanel panneau_J1;
    private javax.swing.JPanel panneau_J2;
    private javax.swing.JPanel panneau_grille;
    private javax.swing.JPanel panneau_partie;
    // End of variables declaration//GEN-END:variables
}
