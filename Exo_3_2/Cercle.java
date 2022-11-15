package Exo_3_2;
import java.lang.Math;

public class Cercle extends Forme {

  private double cote;
  private double pi = 3.14;
  
  public Cercle(double c){
    this.cote=c;
  }

  public double getSurface() {
    return pi*Math.pow(cote,2);
  }
}