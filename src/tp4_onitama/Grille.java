/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4_onitama;

public class Grille {
   Case [][] CaseJeu;
   int [] CoordCaseClique = new int[2];
   
// construit une case de 5x5 cases en définissant un trone noir et un trone blanc
   public Grille(){
       CaseJeu = new Case[5][5];
       for (int i = 0 ; i < 5 ; i++){
           for (int j = 0 ; j < 5 ; j++){
               if (i == 2 && j == 0){
                   Case troneBlanc = new Case(true,i,j);
                   CaseJeu[i][j] = troneBlanc;
               }
               else if (i == 2 && j == 4){
                   Case troneNoir = new Case(true,i,j);
                   CaseJeu[i][j] = troneNoir;
               }
               else {
                   CaseJeu[i][j] = new Case(false,i,j);
               }
           }
       }
       CoordCaseClique[0] = 5; // initialise les CoordClique à 5 pour effectuer les boucles de jeu
       CoordCaseClique[1] = 5;
   }
   
   // renvoie true si la case étudiée est occupée
   public boolean caseOccupee(int ligne, int colonne){
       if (CaseJeu[ligne][colonne].PresencePion()){
           return true;
       }
       return false;
   }
   
   // renvoie la couleur du pion qui est sur la case étudiée
   public String lireCouleurPion(int ligne, int colonne){
       return CaseJeu[ligne][colonne].LirecouleurJetonCase();
   }
   
   // place un pion p sur une case inoccupée
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
   
   // retire et renvoie un pion d'une case
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
   
   // renvoie le type de pion qui est sur la case étudiée ("Roi" ou "Pion")
   public String typePionGrille(int ligne, int colonne) {
        return CaseJeu[ligne][colonne].typePionCase();
    }
   
   // renvoie les coordonnées de la case selctionnée
   public void cliqueSurCase (int [] coord){
       CoordCaseClique[0] = coord[0];
       CoordCaseClique[1] = coord[1];
   }
   
}
