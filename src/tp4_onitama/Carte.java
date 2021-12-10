/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4_onitama;

/**
 *
 * @author thvel
 */
public class Carte {
    
    String Nom;
    int [][] Pattern;
    
    // Methode Deplacementautorisé
    public Carte (String unNom, int[][] unPattern ) { 
        Nom = unNom;   
        Pattern = unPattern;
    }
    
    // Test si le deplacement est possible par rapport au pattern de la carte
    public boolean DeplacementAutorise (int liDepart, int coDepart, int liArrive, int coArrive ) {
        
        for (int i = 0; i < Pattern.length; i++) {
            if ((liDepart + Pattern[i][1] == liArrive) && (coDepart + Pattern[i][1] == coArrive) ) {
                return true;
            }
        }
    return false;
    }

}