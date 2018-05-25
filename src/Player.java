package application;

import javafx.fxml.FXML;

public class Player
{
	private String name;
   private String gender;
   private String carColor; 
   //private Career test; 
   
   
   //Composition of Home, money, College/noCollege, Family 
   
   public Player(String name, String gender, String carColor)
   {
	   this.name = name;
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
   
   /*public Career getCareer()
   {
	   
   }*/
   
}
