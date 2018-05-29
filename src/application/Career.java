package application;

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
	protected boolean needDegree;
	protected int salary; //in thousands
	
	public abstract String getCareer();
	public abstract int getSalary();
}

//College - Scientist, doctor, Vet, Lawyer, SecretAgent, fashion designer, game designer
//NoCollege - police, dancer, athlete, singer, inventor, firefighter, chef, racecar driver
