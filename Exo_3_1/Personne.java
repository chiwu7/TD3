package Exo_3_1;

public class Personne {

  private final String nom;

  public Personne (String nom){
    this.nom = nom;
  }

  public void afficher () {
    System.out.println(nom);
  }
}