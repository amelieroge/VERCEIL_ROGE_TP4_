
package tp4_onitama;

public class TP4_Onitama {

    public static void main(String[] args) {

        Pion piontest = new Pion("rouge", true) ;
        Case casetest = new Case();
    
        System.out.println("le pion est un " + piontest.typePion() + " de couleur " + piontest.lireCouleur());
        
        casetest.PoserPion(piontest);
        casetest.PoserPion(piontest);
        casetest.EnleverPion(piontest);
        casetest.EnleverPion(piontest);
        casetest.PoserPion(piontest);
        System.out.println(casetest.LirecouleurJetonCase());
        
        System.out.println("\n");
        
        
    }
        
}
    

