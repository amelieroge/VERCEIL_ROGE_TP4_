/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4_onitama;

/**
 *
 * @author thvel
 */
public class Case {
    
    Pion pionCourant;
    
    // Methode 
    
    // renvoie false si la case est vide
    public boolean PresencePion() {
        if (pionCourant == null) {
            return false;
        }
        return true;
    }
    
    public boolean PoserPion(Pion unPion) {
        if (pionCourant == null) {
            pionCourant = unPion;
            return true;
        }
        
        System.out.println("On ne peut pas poser un pion sur un pion");
        return false;
    }
    
    public boolean EnleverPion(Pion unPion) {
        if (pionCourant != null) {
            pionCourant = null;
            return true;
        }
        System.out.println("Il n'y pas de pion à enlever sur cette case");
        return false;
    } 
     
     
    public String LirecouleurJetonCase () {
        
        if (pionCourant == null) {
            System.out.println("On ne peut pas lire la couleur d'une case vide");
            return null;
        }
        
        return pionCourant.lireCouleur();
        
    }
    
    
    
    
}
