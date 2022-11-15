package Exo_1_3;

public class Renault extends Voiture {

  private final int anneeFabrication;
  private final double reduction;

    /**
    Constructeur de la classe Renault.
    @author trist
    @date 15/11/2002

    @param vitesse
      Vitesse maximale de la voiture.

    @param prix_vente
      Le prix de vente de base de la voiture.

    @param couleur
      La couleur de la voiture

    @param anneeFabrication
      Anne de fabrication de la renault

    @param reduction
      La reduction du constructeur sur l'achat de la voiture
    
    @return une nouvelle Renault
  **/
  
  public Renault (int vitesse, double prix, String couleur, int anneeFab, double reduc) {
    super(vitesse, prix, couleur);
    this.anneeFabrication = anneeFab;
    this.reduction = reduc;
  }

  @Override
  public double calculerPrixDeVente() {
    return super.calculerPrixDeVente() - reduction;
  }
  
}