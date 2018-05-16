package application;

public class House 
{
   private String type; 
   private double cost; 
   private String description; 
   
   public House(String type, double cost, String description)
   {
	   this.type = type; 
	   this.cost = cost; 
	   this.description = description; 
   }
   
 
   public String getType()
   {
	   return type; 
   }
   
   public double getCost()
   {
	   return cost; 
   }
   
   public String getDescription()
   {
	   return description; 
   }
   
   public String toString()
   {
	   return "Type: " + getType() + "\nCost: " + getCost() + "\nDescription: " + getDescription(); 
   }
}
