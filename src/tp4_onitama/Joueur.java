/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4_onitama;

public class Joueur {
    String nom;
    String couleur;
    Pion [] pions = new Pion[5];
    Carte [] patterns = new Carte[2]; 
    Carte carteUtilisee;
    
    // constructeur
    public Joueur(String Nom){
        nom = Nom;
    }
    
    // initialise les couleurs des joueurs
    public void affecterCouleur(String Couleur){
        couleur = Couleur;
    }
    
    // renvoie true si la carte est affectée correctement au joueur, false sinon
    public boolean tirerUneCarte(Carte carte){
        
        if (patterns[0] == null){
            patterns [0] = carte;
            return true;            // met la carte prise en argument dans la bonne place de la liste de cartes du joueur
        }
        else if (patterns[1] == null){
            patterns [1] = carte;
            return true;
        }
        return false;
    }
    
    // permet au joueur de supprimer une carte de sa liste de cartes
    public Carte jeterUneCarte(int carte){
        Carte retour = patterns[carte];
        patterns[carte] = null;
        return retour;
    }
    
}
