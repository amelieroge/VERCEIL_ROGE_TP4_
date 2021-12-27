/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4_onitama;

/*
String nom	
String couleur
Pion [5] pions
Carte [2] patterns
Carte jeterUneCarte() (retourne la carte utilisée)
affecterCouleur(String)
 */

public class Joueur {
    String nom;
    String couleur;
    Pion [] pions = new Pion[5];
    Carte [] patterns = new Carte[2]; 
    Carte carteUtilisee;
    
    public Joueur(String Nom){
        nom = Nom;
    }
    
    public void affecterCouleur(String Couleur){
        couleur = Couleur;
    }
    
    public boolean tirerUneCarte(Carte carte){
        if (patterns[0] != null && patterns[1] != null) {
            System.out.println("Erreur, vous avez déjà 2 cartes");
            return false;
        }
        if (patterns[0] == null){
            patterns [0] = carte;
            return true;
        }
        if (patterns[1] == null){
            patterns [1] = carte;
            return true;
        }
        return false;
    }
    
    // permet au joueur de jeter une carte
    public Carte jeterUneCarte(int carte){
        if ((carte != 1)||(carte != 2)){
            System.out.println("Erreur, choisis une carte valable");
        }
        Carte retour = patterns[carte];
        patterns[carte] = null;
        return retour;
    }
}


