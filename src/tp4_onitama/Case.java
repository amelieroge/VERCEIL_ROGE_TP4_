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
    boolean Trone;
    int [] coordone  = new int[2];
    
    public Case(boolean trone, int ligne, int colonne){
        Trone = trone;        
        coordone[0] = ligne;
        coordone[1] = colonne;
    }
    
    // Methodes
    
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
            return "none";
        }
        
        return pionCourant.lireCouleur();
        
    }
    
    public String typePionCase() {
        return pionCourant.typePion();
    }
    
}
