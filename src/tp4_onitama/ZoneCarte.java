/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4_onitama;

import javax.swing.JButton;
import java.awt.Graphics;

/**
 *
 * @author thvel
 */

// Class des Zonne de carte dans lesquelles seront affiché la CarteAssocie
public class ZoneCarte extends JButton {
    Carte CarteAssocie;
    
    // Constructeur
    public ZoneCarte(Carte uneCarte){
        CarteAssocie = uneCarte;
    }
    
    // affichage de la carteAssocie
    @Override
    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        setIcon(CarteAssocie.Image);
    }
    
}

