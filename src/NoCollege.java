/**
 * NoCollege is a subclass of Career.
 * NoCollege will help determine what Career you can have.
 * @author oz_hu
 *
 */

public class NoCollege
{
	private ArrayList<Career> noCollegeJobs;
	
	public NoCollege()
	{
		noCollegeJobs = new ArrayList<Career>();
		noCollegeJobs.add(new Superstar());
		noCollegeJobs.add(new Clown());
		noCollegeJobs.add(new Athlete());
		noCollegeJobs.add(new SalesPerson());
		noCollegeJobs.add(new Artist());
		noCollegeJobs.add(new Construction());
		noCollegeJobs.add(new Farmer());
		noCollegeJobs.add(new Makeup());
	}
	
	public Career getRandomJob()
	{
		int choice = (int)(Math.random()*70)+1;
		choice /= 10;
		return noCollegeJobs.get(choice);
	}
	
	public Career chooseJob()
	{
		Career option1 = getRandomJob();
		Career option2 = getRandomJob();
		Career option3 = getRandomJob();
	}
}
