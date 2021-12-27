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
public class ZoneCarte extends JButton {
    Carte CarteAssocie;
    
    public ZoneCarte(Carte uneCarte){
        CarteAssocie = uneCarte;
    }
    
    @Override
    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        setIcon(CarteAssocie.Image);
    }
    
}

