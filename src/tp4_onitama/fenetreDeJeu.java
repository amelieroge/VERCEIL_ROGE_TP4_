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

        panneau_grille = new javax.swing.JPanel();
        panneau_CarteDisponible = new javax.swing.JPanel();
        panneau_partie = new javax.swing.JPanel();
        panneau_J1 = new javax.swing.JPanel();
        panneau_J2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_grille.setBackground(new java.awt.Color(0, 0, 0));
        panneau_grille.setToolTipText("");
        panneau_grille.setLayout(new java.awt.GridLayout(5, 5));
        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        panneau_CarteDisponible.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panneau_CarteDisponibleLayout = new javax.swing.GroupLayout(panneau_CarteDisponible);
        panneau_CarteDisponible.setLayout(panneau_CarteDisponibleLayout);
        panneau_CarteDisponibleLayout.setHorizontalGroup(
            panneau_CarteDisponibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        panneau_CarteDisponibleLayout.setVerticalGroup(
            panneau_CarteDisponibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 172, Short.MAX_VALUE)
        );

        getContentPane().add(panneau_CarteDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 300, 172));

        panneau_partie.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panneau_partieLayout = new javax.swing.GroupLayout(panneau_partie);
        panneau_partie.setLayout(panneau_partieLayout);
        panneau_partieLayout.setHorizontalGroup(
            panneau_partieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        panneau_partieLayout.setVerticalGroup(
            panneau_partieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        getContentPane().add(panneau_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 400, 190));

        panneau_J1.setBackground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout panneau_J1Layout = new javax.swing.GroupLayout(panneau_J1);
        panneau_J1.setLayout(panneau_J1Layout);
        panneau_J1Layout.setHorizontalGroup(
            panneau_J1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        panneau_J1Layout.setVerticalGroup(
            panneau_J1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        getContentPane().add(panneau_J1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 600, 220));

        panneau_J2.setBackground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout panneau_J2Layout = new javax.swing.GroupLayout(panneau_J2);
        panneau_J2.setLayout(panneau_J2Layout);
        panneau_J2Layout.setHorizontalGroup(
            panneau_J2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        panneau_J2Layout.setVerticalGroup(
            panneau_J2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 172, Short.MAX_VALUE)
        );

        getContentPane().add(panneau_J2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 460, 600, 172));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 610, 290, 240));

        setBounds(0, 0, 1316, 939);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel panneau_CarteDisponible;
    private javax.swing.JPanel panneau_J1;
    private javax.swing.JPanel panneau_J2;
    private javax.swing.JPanel panneau_grille;
    private javax.swing.JPanel panneau_partie;
    // End of variables declaration//GEN-END:variables
}
