
package tp4_onitama;

import javax.swing.ImageIcon;

public class TP4_Onitama {

    public static void main(String[] args) {

        Pion piontest = new Pion("rouge", true) ;
        Case casetest = new Case(false);
    
        System.out.println("le pion est un " + piontest.typePion() + " de couleur " + piontest.lireCouleur());
        
        casetest.PoserPion(piontest);
        casetest.PoserPion(piontest);
        casetest.EnleverPion(piontest);
        casetest.EnleverPion(piontest);
        casetest.PoserPion(piontest);
        System.out.println(casetest.LirecouleurJetonCase());
        
        System.out.println("\n");
        
        
    }
        
        int [][] PatternDuDragon = {{1,-1}, { 0,1}};

        //Carte Cartetest = new Carte("Carte du Dragon", PatternDuDragon, img_dragon);

    
        //if (Cartetest.DeplacementCarte(3,3,4,2)) {
        //System.out.println("Deplacement possible");

    
}
    

