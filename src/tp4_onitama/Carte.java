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