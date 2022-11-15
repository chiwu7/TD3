package Exo_1_3;

public class Camion extends Voiture {
  
  private int poids;

   /**
    Constructeur de la classe Camion.
    @author trist
    @date 15/11/2002

    @param vitesse
      Vitesse maximale du camion.

    @param prix_vente
      Le prix de vente de base du camion.

    @param couleur
      La couleur du camion

    @param poids
      Poids du camion en kilo

    @return un nouveau camion
  **/

  public Camion (int vitesse, double prix, String couleur, int poids) {
    super(vitesse, prix, couleur);
    this.poids=poids;
  }

  @Override
  public double calculerPrixDeVente(){
    if (poids > 2000) {
      return super.calculerPrixDeVente()*0.9;
    } 
    else {
      return super.calculerPrixDeVente()*0.8;
    }
    
  }

  


  
}