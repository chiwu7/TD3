package Exo_1_1;

public class Point
{
  public void initialise (int x, int y) {
  this.x = x ;
  this.y = y ;
  }
  
  public void deplacee(int dx, int dy) {
  x += dx ;
  y += dy ;
  }
  //yo
  public int getX() {
  return x ;
  }
    
  public int getY() {
  return y ;
  }
  
  private int x, y ;
}