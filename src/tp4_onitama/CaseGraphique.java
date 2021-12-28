/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4_onitama;

import javax.swing.JButton;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author thvel
 */
public class CaseGraphique extends JButton {
    Case CaseAssocie;
    
    ImageIcon img_case_vide = new javax.swing.ImageIcon(getClass().getResource("/Images/case_vide1.png"));
    ImageIcon img_pion_blanc = new javax.swing.ImageIcon(getClass().getResource("/Images/pion_blanc1.png"));
    ImageIcon img_pion_noir = new javax.swing.ImageIcon(getClass().getResource("/Images/pion_noir1.png"));
    ImageIcon img_roi_blanc = new javax.swing.ImageIcon(getClass().getResource("/Images/roi_blanc1.png"));
    ImageIcon img_roi_noir = new javax.swing.ImageIcon(getClass().getResource("/Images/roi_noir1.png"));
    ImageIcon img_trone = new javax.swing.ImageIcon(getClass().getResource("/Images/trone1.png"));
    ImageIcon img_trone_pion_blanc = new javax.swing.ImageIcon(getClass().getResource("/Images/pion_blanc_trone.png"));
    ImageIcon img_trone_pion_noir = new javax.swing.ImageIcon(getClass().getResource("/Images/pion_noir_trone.png"));
    ImageIcon img_trone_roi_blanc = new javax.swing.ImageIcon(getClass().getResource("/Images/roi_blanc_trone.png"));
    ImageIcon img_trone_roi_noir = new javax.swing.ImageIcon(getClass().getResource("/Images/roi_noir_trone.png"));

    // constructeur
    public CaseGraphique(Case uneCase) {
        CaseAssocie = uneCase;
    }
    
    // affichage l'image de la CaseAssocie en fonction de ce qu'il y a sur la case (case vide, couleur et type de pion)
    @Override
    public void paintComponent(Graphics G) {
        super.paintComponent(G);

            
        String couleur_pion = CaseAssocie.LirecouleurJetonCase();
        boolean trone  = CaseAssocie.Trone;
        switch (couleur_pion) {
            case "none":
                if (trone){
                    setIcon(img_trone);
                } 
                else { 
                setIcon(img_case_vide);
                }
                break;
            case "Noir":
                if (CaseAssocie.pionCourant.EtreRoi){
                        if (trone){
                            setIcon(img_trone_roi_noir);
                        }    
                        else {
                            setIcon(img_roi_noir);  
                        }
                }
                else {
                    if (trone) {
                        setIcon(img_trone_pion_noir);
                    }
                    else {
                        setIcon(img_pion_noir);  
                    }
                }
                break;
            case "Blanc":
                if (CaseAssocie.pionCourant.EtreRoi){
                    if (trone) {
                        setIcon(img_trone_roi_blanc);
                    }
                    else {
                        setIcon(img_roi_blanc);
                    }
                }
                else {
                    if (trone) {
                        setIcon(img_trone_pion_blanc);
                    }
                    else {
                        setIcon(img_pion_blanc);  
                    }
                }
                break;

        }
    }

    
}
