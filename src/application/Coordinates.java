package application;

public class Coordinates
{
  private int spot; 
  private int coordinateX; 
  private int coordinateY; 
  private String identification; 
  
  public Coordinates()
  {
	  spot = 0; 
	  coordinateX = 0; 
	  coordinateY = 0; 
	  identification = ""; 
  }
  
  public Coordinates(int spot, int coordX, int coordY, String ident)
  {
	  this.spot = spot; 
	  coordinateX = coordX; 
	  coordinateY = coordY; 
	  this.identification = ident;  
  }
  
  public int getSpot()
  {
	  return spot; 
  }
  public int getCoordX()
  {
	  return coordinateX; 
  }
  
  public int getCoordY()
  {
	  return coordinateY; 
  }
  
  public String getIdentifaction()
  {
	  return identification; 
  }
 

}
