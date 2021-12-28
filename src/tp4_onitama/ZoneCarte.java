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

// Class des Zonne de carte dans lesquelles seront affiché la CarteAssocie
public class ZoneCarte extends JButton {
    Carte CarteAssocie;
    

    ImageIcon img_carte_vide = new javax.swing.ImageIcon(getClass().getResource("/Images/image_vide.png"));
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

    // Constructeur
    public ZoneCarte(Carte uneCarte){
        CarteAssocie = uneCarte;
    }
    
    // affichage de la carteAssocie
    @Override
    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        if (CarteAssocie == null) {
            setIcon(img_carte_vide);
        }
        else {
            String img = CarteAssocie.Image.toString();
            switch (img) {
                case "img_boar" :
                    setIcon(img_boar);
                    break;
                case "img_cobra" :
                    setIcon(img_cobra);
                    break;
                case "img_crab" :
                    setIcon(img_crab);
                    break;
                case "img_crane" :
                    setIcon(img_crane);
                    break;
                case "img_dragon" :
                    setIcon(img_dragon);
                    break;
                case "img_eel" :
                    setIcon(img_eel);
                    break;
                case "img_elephant" :
                    setIcon(img_elephant);
                    break;
                case "img_frog" :
                    setIcon(img_frog);
                    break;    
                case "img_goose" :
                    setIcon(img_goose);
                    break;    
                case "img_horse" :
                    setIcon(img_horse);
                    break;    
                case "img_mantis" :
                    setIcon(img_mantis);
                    break;    
                case "img_monkey" :
                    setIcon(img_monkey);
                    break;   
                case "img_ox" :
                    setIcon(img_ox);
                    break; 
                case "img_rabbit" :
                    setIcon(img_rabbit);
                    break;
                case "img_rooster" :
                    setIcon(img_rooster);
                    break;
                case "img_tiger" :
                    setIcon(img_tiger);
                    break;
            }


        }
        
    }
    
}

