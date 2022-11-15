package Exo_1_2;

public class PointNom extends Point {

  private String nom;

  public PointNom(String nom, int x, int y) {
    setPointNom(x, y, nom);
  }
  
  public void setPointNom(int x, int y, String nom){
    setPoint(x, y);
    this.nom = nom;
  }

  public void affCoordNom(){
    System.out.println("Nom du point : " + nom);
    super.afficheCoords();
  }
  
}

/*
  Question 2 : 
  
  public static void main(String[] args) {
    PointNom simon = new PointNom();
    simon.setPointNom(3,4,"simon");
    simon.affCoordNom();
  }

*/