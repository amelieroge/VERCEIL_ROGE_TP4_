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
    ImageIcon [] Images = new ImageIcon[3];
    ImageIcon image;


    // Constructeur qui permet de rassembler toutes les images composant une carte
    public Carte (String unNom, int[][] unPattern, ImageIcon img , ImageIcon imgGauche , ImageIcon imgDroite ) { 
        Nom = unNom;   
        Pattern = unPattern;  
        Images[0] = img;
        Images[1] = imgGauche;
        Images[2] = imgDroite;
    }
    
    // Teste si le déplacement est possible par rapport au pattern de la carte
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
    
    // Méthodes permettant d'ajuster les patterns selon l'orientation  de la carte
    public int [][] rotaJGauche (){ // -> correspond au joueur blanc (le joueur de gauche)
        for (int i = 0 ; i < Pattern.length ; i++){
            
        int ligne = Pattern[i][0];
        int colonne = Pattern[i][1];
                
        Pattern[i][1] = ligne;
        Pattern[i][0] = colonne*-1;
        }
        return Pattern;
    }
   
    public int [][] rotaJDroite (){ // -> correspond au joueur noir (le joueur de droite)
        for (int i = 0 ; i < Pattern.length ; i++){
            
        int ligne = Pattern[i][0];
        int colonne = Pattern[i][1];
                
        Pattern[i][1] = ligne*-1;
        Pattern[i][0] = colonne;
        }
        return Pattern;
    }
    
}
