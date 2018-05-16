package application;

public class Players 
{
   private String gender; 
   private String carColor; 
   //private Career test; 
   
   
   //Composition of Home, money, College/noCollege, Family 
   
   public Players(String gender, String carColor)
   {
	   this.gender = gender; 
	   this.carColor = carColor; 
   }
   
   public String getGender()
   {
	   return gender; 
   }
   
   public String carColor()
   {
	   return carColor; 
   }
   
 /*  public Career getCareer()
   {
	   
   }*/
   
}
