/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4_onitama;

import javax.swing.ImageIcon;

/**
 *
 * @author thvel
 */
public class Carte {
    
    String Nom;
    int [][] Pattern;
    ImageIcon Image;
    
    // On donne des noms et des chemins aux cartes dans Images
    ImageIcon img_boar = new javax.swing.ImageIcon(getClass().getResource("/Images/boar.jpg"));
    ImageIcon img_cobra = new javax.swing.ImageIcon(getClass().getResource("/Images/cobra.jpg"));
    ImageIcon img_crab = new javax.swing.ImageIcon(getClass().getResource("/Images/crab.jpg"));
    ImageIcon img_crane = new javax.swing.ImageIcon(getClass().getResource("/Images/crane.jpg"));
    ImageIcon img_dragon = new javax.swing.ImageIcon(getClass().getResource("/Images/dragon.jpg"));
    ImageIcon img_eel = new javax.swing.ImageIcon(getClass().getResource("/Images/eel.jpg"));
    ImageIcon img_elephant = new javax.swing.ImageIcon(getClass().getResource("/Images/elephant.jpg"));
    ImageIcon img_frog = new javax.swing.ImageIcon(getClass().getResource("/Images/frog.jpg"));
    ImageIcon img_goose = new javax.swing.ImageIcon(getClass().getResource("/Images/goose.jpg"));
    ImageIcon img_horse = new javax.swing.ImageIcon(getClass().getResource("/Images/horse.jpg"));
    ImageIcon img_mantis = new javax.swing.ImageIcon(getClass().getResource("/Images/mantis.jpg"));
    ImageIcon img_monkey = new javax.swing.ImageIcon(getClass().getResource("/Images/mokey.jpg"));
    ImageIcon img_ox = new javax.swing.ImageIcon(getClass().getResource("/Images/ox.jpg"));
    ImageIcon img_rabbit = new javax.swing.ImageIcon(getClass().getResource("/Images/rabbit.jpg"));
    ImageIcon img_rooster = new javax.swing.ImageIcon(getClass().getResource("/Images/rooster.jpg"));
    ImageIcon img_tiger = new javax.swing.ImageIcon(getClass().getResource("/Image/tiger.jpg"));
    
    
    // Methode Deplacementautorisé
    public Carte (String unNom, int[][] unPattern, ImageIcon uneImage ) { 
        Nom = unNom;   
        Pattern = unPattern;  
        Image = uneImage;
    }
    
    // Test si le deplacement est possible par rapport au pattern de la carte
    public boolean DeplacementCarte (int liDepart, int coDepart, int liArrive, int coArrive ) {
        
        for (int i = 0; i < Pattern.length; i++) {
            System.out.println(liDepart + Pattern[i][0]);
            System.out.println(coDepart + Pattern[i][1]);
            if ((liDepart + Pattern[i][0] == liArrive) && (coDepart + Pattern[i][1] == coArrive) ) {
                return true;
            }
        }
    System.out.println("Le deplacement ne correspond pas au pattern");
    return false;
    }
}