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

// Class des Zonne de carte dans lesquelles seront affiché la ImageAssocie
public class ZoneCarte extends JButton {
    ImageIcon ImageAssocie;
    
    ImageIcon img_carte_vide = new javax.swing.ImageIcon(getClass().getResource("/Images/image_vide.png"));

    // Constructeur
    public ZoneCarte(ImageIcon image){
        ImageAssocie = image;

    }
    
    // affichage de la ImageAssocie
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

