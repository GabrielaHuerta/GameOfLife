/**
 * A Career is an abstract class with 
 * subclasses College and NoCollege.
 * A Player has-a Career.
 * 
 * @author oz_hu
 *
 */

public abstract class Career
{
	protected String career;
	
	public Career()
	{
		career = getCareer();
	}
	
	public String getCareer();
}

class Doctor extends Career
{
	private boolean needDegree = true;
	private int salary;
}

class Superstar
{
	
}

class TravelAgent
{
	
}

class Teacher
{
	
}

class Athlete
{
	
}

class SalesPerson
{
	
}

class Accountant
{
	
}

class Artist
{
	
}
