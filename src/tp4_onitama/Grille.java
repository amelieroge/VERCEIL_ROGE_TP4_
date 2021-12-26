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
   Case [][] GrilleJeu = new Case[5][5];
   
   public Grille(){
       for (int i = 0 ; i < 5 ; i++){
           for (int j = 0 ; j < 5 ; j++){
               if (i == 2 && j == 0){
                   Case troneBlanc = new Case();
                   GrilleJeu[i][j] = troneBlanc;
               }
               if (i == 2 && j == 4){
                   Case troneNoir = new Case();
                   GrilleJeu[i][j] = troneNoir;
               }
               else {
               GrilleJeu[i][j] = new Case();
               }
           }
       }
   }
   
   public boolean caseOccupee(int ligne, int colonne){
       if (GrilleJeu[ligne][colonne].PresencePion()){
           return true;
       }
       return false;
   }
   
   public String lireCouleurPion(int ligne, int colonne){
       return GrilleJeu[ligne][colonne].LirecouleurJetonCase();
   }
   
   public boolean placerPion(Pion p, int ligne, int colonne){
       if (!caseOccupee(ligne, colonne)){
           GrilleJeu[ligne][colonne].PoserPion(p);
           return true;
       }
       else {
           System.out.println("Erreur, il y a déjà un pion sur cette case");
           return false;
       }
   }
   
   public boolean enleverPion(int ligne, int colonne){
       if (caseOccupee(ligne, colonne)){
           GrilleJeu[ligne][colonne].pionCourant = null;
           return true;
       } else {
           System.out.println("Erreur, il n'y a pas de pion sur cette case");
           return false;
       }
   }
   
   public String typePionGrille(int ligne, int colonne) {
        return GrilleJeu[ligne][colonne].typePionCase();
    }
   
   
   
}
