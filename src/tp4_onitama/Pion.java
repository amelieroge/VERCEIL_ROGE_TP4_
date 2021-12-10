/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4_onitama;

/**
 *
 * @author thvel
 */
public class Pion {
    String couleur;
    boolean EtreRoi;
    
    // Constructeur
    public Pion(String uneCouleur, boolean roi) {
        couleur = uneCouleur;
        EtreRoi = roi;
    }
    
    // Méthodes 
    
    
    public String lireCouleur() {
        return(couleur);
    }
    
    // permet de determiner de quel Type est le pion
    public String typePion() {
        if (EtreRoi == true) {
            return "Roi";
        }
        else {
            return "Pion";
            
        }
    }
}

