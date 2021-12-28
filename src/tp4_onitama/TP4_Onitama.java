
package tp4_onitama;

import javax.swing.ImageIcon;

public class TP4_Onitama {

    public static void main(String[] args) {

        /*Pion piontest = new Pion("rouge", true) ;
        Case casetest = new Case(false);
    
        System.out.println("le pion est un " + piontest.typePion() + " de couleur " + piontest.lireCouleur());
        
        casetest.PoserPion(piontest);
        casetest.PoserPion(piontest);
        casetest.EnleverPion(piontest);
        casetest.EnleverPion(piontest);
        casetest.PoserPion(piontest);
        System.out.println(casetest.LirecouleurJetonCase());
        
        System.out.println("\n");*/
        
        int [][] b = {{0,-1},{1,0},{0,1}};
        Carte cboar = new Carte("Boar", b);
        
        
        System.out.println(cboar.rotatGauche().hashCode());
    }
}
    

