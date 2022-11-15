package Exo_1_3;

public class LeaPassion {
  public static void main(String[] argv) {

    Camion marcel = new Camion(520, 100, "bleu", 1900);
    System.out.println("Marcel coûte : " + marcel.calculerPrixDeVente() );
  }
}