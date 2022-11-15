package Exo_1_3;

public class Voiture {

  /*
    Attribut final indique qu'on ne peut pas redéfinir (=Changer) les valeurs de ces variables.
  */
  
  private final int vitesse;
  private final double prix_vente;
  private final String couleur;

      /**
    Constructeur de la classe Voiture.
    @author trist
    @date 15/11/2002

    @param vitesse
      Vitesse maximale de la voiture.

    @param prix_vente
      Le prix de vente de base de la voiture.

    @param couleur
      La couleur de la voiture

    @return une nouvelle voiture
  **/
  
  public Voiture (int vitesse, double prix, String couleur){
    this.vitesse = vitesse;
    this.prix_vente = prix;
    this.couleur = couleur;
  }  

  public double calculerPrixDeVente() {
    return this.prix_vente;
  }
  
}