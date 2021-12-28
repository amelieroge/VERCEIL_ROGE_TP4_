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
    
    // Méthode permettant d'ajuster les pattenrns celon l'orientation  de la carte
    public int [][] rotatGauche (){
        for (int i = 0 ; i < Pattern.length ; i++){
            
        int ligne = Pattern[i][0];
        int colonne = Pattern[i][1];
                
        Pattern[i][1] = ligne;
        Pattern[i][0] = colonne*-1;
        }
        return Pattern;
    }
   
    public int [][] rotatDroite (){
        for (int i = 0 ; i < Pattern.length ; i++){
            
        int ligne = Pattern[i][0];
        int colonne = Pattern[i][1];
                
        Pattern[i][1] = ligne*-1;
        Pattern[i][0] = colonne;
        }
        return Pattern;
    }
    
}
