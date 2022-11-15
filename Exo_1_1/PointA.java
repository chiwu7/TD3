package Exo_1_1;

public class PointA extends Point {

  public void Afficher() {
    System.out.println("Les coordonnées du point sont (" + getX() + "," + getY() + ")");
  }
  
}
//Question 3 : 

// X et Y ne serait pas accessible.

/*
public static void main(String[] args) {
    PointA simon = new PointA();
    simon.initialise(7,3);
    simon.Afficher();
  }
*/