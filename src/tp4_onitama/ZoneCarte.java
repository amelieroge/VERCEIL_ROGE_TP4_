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

// Classe des zone de carte dans lesquelles seront affichés les ImageAssocie correspondantes
public class ZoneCarte extends JButton {
    ImageIcon ImageAssocie;
    
    // on définit une image vide pour l'initialisation de la partie
    ImageIcon img_carte_vide = new javax.swing.ImageIcon(getClass().getResource("/Images/image_vide.png"));

    // Constructeur
    public ZoneCarte(ImageIcon image){
        ImageAssocie = image;

    }
    
    // affichage de la ImageAssocie (affiche l'image vide s'il n'y a pas de carte dans la case
    @Override
    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        if (ImageAssocie == null) {
            setIcon(img_carte_vide);
        }
        else {
            setIcon(ImageAssocie);
        }
        
    }
    
}

