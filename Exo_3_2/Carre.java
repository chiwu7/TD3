package Exo_3_2;

public class Carre extends Forme {

  private double cote;
  
  public Carre(double c){
    this.cote=c;
  }

  public double getSurface() {
    return cote*cote;
  }
}