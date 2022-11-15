package Exo_1_3;

public class Limousine extends Renault {

  private final int longueur;

    public Limousine (int vitesse, double prix, String couleur, int anneeFab, double reduc, int longueur) {
    super(vitesse, prix, couleur, anneeFab, reduc);
    this.longueur = longueur;
  }

  @Override
  public double calculerPrixDeVente() {

    if (longueur > 6 ) {
      return super.calculerPrixDeVente()*0.95;
    }
    else {
      return super.calculerPrixDeVente()*0.90;
    }
}

}