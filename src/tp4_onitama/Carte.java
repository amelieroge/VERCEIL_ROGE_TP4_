/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4_onitama;

import java.awt.geom.AffineTransform;
import javax.swing.ImageIcon;

/**
 *
 * @author thvel
 */
public class Carte {
    
    String Nom;
    int [][] Pattern;
    ImageIcon Image;

    
    
    // Methode Deplacementautorisé

    public Carte (String unNom, int[][] unPattern, ImageIcon uneImage ) { 
        Nom = unNom;   
        Pattern = unPattern;  
        Image = uneImage;
    }
    
    public Carte (String nom, int [][] pattern){
        Nom = nom;
        Pattern = pattern;
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
    System.out.println("Le déplacement ne correspond pas au pattern");
    return false;
    }
    
    public boolean rotatDroite (){
        for (int i = 0 ; i < Pattern.length ; i++){
            for (int j = 0 ; j < Pattern.length ; j++){
                Pattern[i][j] = Pattern[-j][i];
                return true;
            }
        }
        return false;
    }
    
    public int[][] rotatGauche (){
        for (int i = 0 ; i <= Pattern.length-1 ; i++){
            for (int j = 0 ; j < Pattern.length-1 ; j++){
                Pattern[i][j] = Pattern[j][-i];
            }
        }
        return Pattern;
    }
    
    /*public boolean rotatDroite1 (){
        AffineTransform transformer = new AffineTransform();
        transformer.rotate(0.5, this.Image.getWidth() / 2, this.Image.getHeight() / 2);
        return false;
    }*/
    
}