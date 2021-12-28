/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4_onitama;

/* fait         Case [5][5] CaseJeu 
fait            boolean CaseOccupee(int,int)
fait            String lireCouleurDuPion
fait            placerPion(Pion, int, int)
fait            enleverPion (Pion, int int)
*/

public class Grille {
   Case [][] CaseJeu;
   
   public Grille(){
       CaseJeu = new Case[5][5];
       for (int i = 0 ; i < 5 ; i++){
           for (int j = 0 ; j < 5 ; j++){
               if (i == 2 && j == 0){
                   Case troneBlanc = new Case(true);
                   CaseJeu[i][j] = troneBlanc;
               }
               else if (i == 2 && j == 4){
                   Case troneNoir = new Case(true);
                   CaseJeu[i][j] = troneNoir;
               }
               else {
                   CaseJeu[i][j] = new Case(false);
               }
           }
       }
   }
   
   public boolean caseOccupee(int ligne, int colonne){
       if (CaseJeu[ligne][colonne].PresencePion()){
           return true;
       }
       return false;
   }
   
   public String lireCouleurPion(int ligne, int colonne){
       return CaseJeu[ligne][colonne].LirecouleurJetonCase();
   }
   
   public boolean placerPion(Pion p, int ligne, int colonne){
       if (!caseOccupee(ligne, colonne)){
           CaseJeu[ligne][colonne].PoserPion(p);
           return true;
       }
       else {
           System.out.println("Erreur, il y a déjà un pion sur cette case");
           return false;
       }
   }
   
   public Pion enleverPion(int ligne, int colonne){
       if (caseOccupee(ligne, colonne)){
           Pion Pionrecup = CaseJeu[ligne][colonne].pionCourant;
           CaseJeu[ligne][colonne].pionCourant = null;
           return Pionrecup;
       } else {
           System.out.println("Erreur, il n'y a pas de pion sur cette case");
           return null;
       }
   }
   
   public String typePionGrille(int ligne, int colonne) {
        return CaseJeu[ligne][colonne].typePionCase();
    }
   
   
   
}
