package application;
public class Career
{
	 private String type; 
	 private int salary; 
	 
	 
	 public Career(String type, int salary)
	 {
		 this.type = type; 
		 this.salary = salary; 
	 }
	 
	 public String getType()
	 {
		 return type; 
	 }
	 
	 public int getSalary()
	 {
		 return salary; 
	 }
	
	 
	 public String toString()
	 {
		 return "You are a " + getType() + " and you earn $" + getSalary(); 
	 }
}

//College - Scientist, doctor, Vet, Lawyer, SecretAgent, fashion designer, game designer
//NoCollege - police, dancer, athlete, singer, inventor, firefighter, chef, racecar driver
