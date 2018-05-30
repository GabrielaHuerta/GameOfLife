package application;
import java.util.ArrayList; 

public class Home 
{
    private boolean hasHouse; 
    private ArrayList<House> typeHouse; 
 
    public Home()
    {
    	 typeHouse.add(new House("House Boat", 200000.00, "gh1.jpg")); 
    	 typeHouse.add(new House("Teepee", 100000.00, "gh2.jpg")); 
    	 typeHouse.add(new House("Farm House", 300000.00, "gh3.jpg")); 
    	 typeHouse.add(new House("Eco House", 200000.00, "gh4.jpg" )); 
    	 typeHouse.add(new House("Beach Hut", 100000.00, "gh5.jpg")); 
    	 typeHouse.add(new House("City Penthouse", 600000.00, "gh6.jpg")); 
    	 typeHouse.add(new House("Idio Apartment", 100000.00, "gh7.jpg")); 
    	 typeHouse.add(new House("Family House", 250000.00, "gh8.jpg")); 
    	 typeHouse.add(new House("Ranch House", 600000.00, "gh9.jpg")); 
    	 typeHouse.add(new House("Luxury Apartment", 250000.0, "gh10.jpg")); 
    	 typeHouse.add(new House("Windmill", 350000.00, "gh11.jpg")); 
    	 typeHouse.add(new House("Cozy Cottage", 150000.00, "gh12.jpg")); 
         typeHouse.add(new House("Dream Villa", 300000.00, "gh13.jpg")); 
    }
    
    public boolean getHasHouse()
    {
    	return hasHouse; 
    }
}
