package application;

public class Coordinate 
{
  private String name ; 
  private int coordinateX; 
  private int coordinateY; 
  private String identification; 
  
  public Coordinate()
  {
	  name = ""; 
	  coordinateX = 0; 
	  coordinateY = 0; 
	  identification = ""; 
  }
  
  public Coordinate(String name, int coordX, int coordY, String ident)
  {
	  this.name = name; 
	  coordinateX = coordX; 
	  coordinateY = coordY; 
	  this.identification = ident;  
  }
  
  public String getName()
  {
	  return name; 
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
