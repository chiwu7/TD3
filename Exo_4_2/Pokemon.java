package Exo_4_2;

public class Pokemon {

  private String nom; //nom du pokémon
  private int pv; 
  private int atk;

  public Pokemon (String nom, int pv, int atk){
    this.nom=nom;
    this.pv=pv;
    this.atk=atk;
  }

  public String getNom()
  {
    return nom;
  }

  public int getPv(){
    return pv;
  }

  public int getAtk(){
    return atk;
  }

  public boolean estKO () {
    if (getPv() == 0) {
      return true;
    }
    else {
      return false;
    }
  }

  public void attaquer (Pokemon p){
    int pokemonAtt = p.getPv();
    pokemonAtt -= this.getAtk();
    
  }

  public String toString() {
   return "Pokemon : " + this.nom +
	  " / Attaque : " + this.atk +
	  " / PV : " + this.pv;
}
}