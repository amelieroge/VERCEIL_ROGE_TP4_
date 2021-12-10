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
    
    public Pion(String uneCouleur) {
        couleur = uneCouleur;
    }
    
    public String lireCouleur() {
        return(couleur);
    }
    
    public String typePion() {
        if (EtreRoi == true) {
            return "Roi";
        }
        else {
            return "Pion";
        }
            
    }
    
}

