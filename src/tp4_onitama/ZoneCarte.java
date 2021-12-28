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
        
        int [][] b = {{0,-1},{1,0},{0,1}};
        Carte cboar = new Carte("Boar", b, img_boar);

        int [][] co = {{0,-1},{1,1},{-1,1}};
        Carte ccobra = new Carte("Cobra", co, img_cobra);
        
        int [][] crab = {{0,-2},{1,0},{0,2}};
        Carte ccrab = new Carte("Crab", crab, img_crab);
        
        int [][] cran = {{-1,-1},{1,0},{-1,1}};
        Carte ccrane = new Carte("Boar", cran, img_crane);
        
        int [][] d = {{-1,-1},{1,-2},{1,2},{-1,1}};
        Carte cdragon = new Carte("Dragon", d, img_dragon);
        
        int [][] ee = {{1,-1},{-1,-1},{0,1}};
        Carte ceel = new Carte("Eel", ee, img_eel);
        
        int [][] el = {{0,-1},{1,-1},{0,1},{1,1}};
        Carte celephant = new Carte("Elephant", el, img_elephant);
        
        int [][] f = {{0,-2},{-1,1},{-1,1}};
        Carte cfrog = new Carte("Frog", f, img_frog);
        
        int [][] g = {{0,-1},{1,-1},{0,1},{-1,1}};
        Carte cgoose = new Carte("Goose", g, img_goose);
        
        int [][] h = {{-1,0},{0,-1},{1,0}};
        Carte chorse = new Carte("Horse", h, img_horse);
        
        int [][] ma = {{1,-1},{1,1},{-1,0}};
        Carte cmantis = new Carte("Mantis", ma, img_mantis);

        int [][] mo = {{-1,-1},{-1,1},{1,1},{1,-1}};
        Carte cmonkey = new Carte("Monkey", mo, img_monkey);

        int [][] o = {{1,0},{0,1},{0,1}};
        Carte cox = new Carte("Ox", o, img_ox);

        int [][] ra = {{-1,-1},{1,1},{0,2}};
        Carte crabbit = new Carte("Rabbit", ra, img_rabbit);

        int [][] roo = {{-1,-1},{1,1},{0,-1},{0,1}};
        Carte crooster = new Carte("Rooster", roo, img_rooster);
        
        int [][] tig = {{2,0},{-1,0}};
        Carte ctiger = new Carte("Tiger", tig, img_tiger);
    }
    
    // affichage de la carteAssocie
    @Override
    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        if (CarteAssocie == null) {
            setIcon(img_carte_vide);
        }
        else {
            String img = CarteAssocie.Nom;
            switch (img) {
                case "Boar" :
                    setIcon(img_boar);
                    break;
                case "Cobra" :
                    setIcon(img_cobra);
                    break;
                case "Crab" :
                    setIcon(img_crab);
                    break;
                case "Crane" :
                    setIcon(img_crane);
                    break;
                case "Dragon" :
                    setIcon(img_dragon);
                    break;
                case "Eel" :
                    setIcon(img_eel);
                    break;
                case "Elephant" :
                    setIcon(img_elephant);
                    break;
                case "Frog" :
                    setIcon(img_frog);
                    break;    
                case "Goose" :
                    setIcon(img_goose);
                    break;    
                case "Horse" :
                    setIcon(img_horse);
                    break;    
                case "Mantis" :
                    setIcon(img_mantis);
                    break;    
                case "Monkey" :
                    setIcon(img_monkey);
                    break;   
                case "Ox" :
                    setIcon(img_ox);
                    break; 
                case "Rabbit" :
                    setIcon(img_rabbit);
                    break;
                case "Rooster" :
                    setIcon(img_rooster);
                    break;
                case "Tiger" :
                    setIcon(img_tiger);
                    break;
            }


        }
        
    }
    
}

