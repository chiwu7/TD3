import Exo_3_1.Personne;
import Exo_3_1.IngenieurReseau;
import Exo_3_1.IngenieurLogiciel;


class Main {
  
  public static void main(String[] args) {
    Personne[] personnes = new Personne[3];
    personnes[0] = new IngenieurReseau("Paul");
    personnes[1] = new IngenieurLogiciel("Philippe");
    personnes[2] = new IngenieurReseau("Pierre");
    for (int i = 0; i < personnes.length; i++)
    personnes[i].afficher();
  }
  
}