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

    /**
     * Creates new form fenetreDeJeu
     */
    public fenetreDeJeu() {
        initComponents();
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
        panneau_Partie = new javax.swing.JPanel();
        btn_demarer = new javax.swing.JButton();
        btn_reglesJeu = new javax.swing.JButton();
        set_joueur1 = new javax.swing.JTextField();
        set_joueur2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panneau_carteDisponible = new javax.swing.JPanel();
        panneau_J2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        message = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_J1.setBackground(new java.awt.Color(255, 204, 0));
        panneau_J1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(panneau_J1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 300, 500));

        panneau_grille.setBackground(new java.awt.Color(0, 0, 0));
        panneau_grille.setToolTipText("");
        panneau_grille.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 600, 600));

        panneau_Partie.setBackground(new java.awt.Color(0, 0, 0));
        panneau_Partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_demarer.setText("Démarer Partie");
        panneau_Partie.add(btn_demarer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        btn_reglesJeu.setText("Règles du jeu");
        panneau_Partie.add(btn_reglesJeu, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        set_joueur1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        set_joueur1.setText("Entrer nom J1");
        set_joueur1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                set_joueur1ActionPerformed(evt);
            }
        });
        panneau_Partie.add(set_joueur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        set_joueur2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        set_joueur2.setText("Entrer nom J2");
        set_joueur2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                set_joueur2ActionPerformed(evt);
            }
        });
        panneau_Partie.add(set_joueur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Joueur 1");
        panneau_Partie.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 52, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Joueur 2");
        panneau_Partie.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 122, -1, -1));

        getContentPane().add(panneau_Partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 300, 290));

        panneau_carteDisponible.setBackground(new java.awt.Color(0, 0, 0));
        panneau_carteDisponible.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(panneau_carteDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 653, 300, 172));

        panneau_J2.setBackground(new java.awt.Color(255, 204, 0));
        panneau_J2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(panneau_J2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 30, 300, 500));

        jScrollPane1.setViewportView(message);
        message.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 550, 300, 290));

        setBounds(0, 0, 1316, 899);
    }// </editor-fold>//GEN-END:initComponents

    private void set_joueur2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_set_joueur2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_set_joueur2ActionPerformed

    private void set_joueur1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_set_joueur1ActionPerformed
       
    }//GEN-LAST:event_set_joueur1ActionPerformed

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
    private javax.swing.JButton btn_demarer;
    private javax.swing.JButton btn_reglesJeu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane message;
    private javax.swing.JPanel panneau_J1;
    private javax.swing.JPanel panneau_J2;
    private javax.swing.JPanel panneau_Partie;
    private javax.swing.JPanel panneau_carteDisponible;
    private javax.swing.JPanel panneau_grille;
    private javax.swing.JTextField set_joueur1;
    private javax.swing.JTextField set_joueur2;
    // End of variables declaration//GEN-END:variables
}
