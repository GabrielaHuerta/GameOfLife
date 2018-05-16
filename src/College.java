/**
 * College is a subclass of Career.
 * College will help determine what Careers you can chose from.
 * 
 * @author oz_hu
 *
 */

public class College
{
	private ArrayList<Career> collegeJobs;
	
	public College()
	{
		collegeJobs = new ArrayList<Career>();
		collegeJobs.add(new Doctor());
		collegeJobs.add(new Teacher());
		collegeJobs.add(new Accountant());
		collegeJobs.add(new Pilot());
		collegeJobs.add(new Police());
		collegeJobs.add(new Scientist());
		collegeJobs.add(new CEO());
		collegeJobs.add(new MrStites());
	}
	
	public Career getRandomJob()
	{
		int choice = (int)(Math.random()*70)+1;
		choice /= 10;
		return collegeJobs.get(choice);
	}
	
	public Career chooseJob()
	{
		Career option1 = getRandomJob();
		Career option2 = getRandomJob();
		Career option3 = getRandomJob();
	}
}
