package application;
import java.util.ArrayList; 

public class Home 
{
    private boolean hasHouse; 
    private ArrayList<House> typeHouse; 
 
    public Home()
    {
    	 typeHouse.add(new House("SplitLevel", 40000.00, "Was one level before the 'quake. Now a real fixer-upper for adventurous folks!")); 
    	 typeHouse.add(new House("Mobile Home", 60000.00, "Aluminum-sided little beauty! Great location, lovely view. Trailer hitch included.")); 
    	 typeHouse.add(new House("Log Cabin", 80000.00, "Rustic Charm in a woodland setting. Loft w/skylight, stone fireplace. Near Lake Ketcheefishee. ")); 
    	 typeHouse.add(new House("Country Cottage", 1000000.00, "Large yard with garden, frog pond, picket fence. Sunny and cozy inside!" )); 
    	 typeHouse.add(new House("Dutch Colonial", 120000.00, "8 spacious rooms w/study, den. Solar-heated, wood-burning stoves, solid oak floors.")); 
    	 typeHouse.add(new House("Beach House", 140000.00, "Only 50 yards from Monsoon beach. Sun deck, boat dock, hurrican wall. Hurry while it lasts!")); 
    	 typeHouse.add(new House("Farmhouse", 160000.00, "Located on 50 rolling acres! Garbazo bean crops, prize-winning pigs and dairy cows, spacious barn w/silo.")); 
    	 typeHouse.add(new House("Tudor", 180000.00, "Tufloors, tubaths, tucar garage. Perfect for tupeople with tukids or more!")); 
    	 typeHouse.add(new House("Victorian", 200000.00, "Library, parlor, servant's quarters, marble fireplaces, wraparound porch.")); 
    	 typeHouse.add(new House("Ranch Style", 140000.0, "A cool ranch with alot of cows and a broken down farmhouse full of chickens.")); 
    	 typeHouse.add(new House("Small Cape", 160000.00, "Charming cape, with backyard pool.")); 
    	 typeHouse.add(new House("Executive Cape", 4000000.00, "Better than the Small Cape.")); 
    }
    
    public boolean getHasHouse()
    {
    	return hasHouse; 
    }
}
