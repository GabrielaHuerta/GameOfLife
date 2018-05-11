import java.util.Arrays;

/**
 * Money class keeps track of a Player's
 * money(in bills), stocks, and salary.
 * It totals all money(including tiles)
 * when Game finishes.
 * @author oz_hu
 *
 */

public class Money
{
	private int salary;
	
}

class Salary
{
	private int[] so = {20,30,40,50,60,70,80,90,100};
	                  // 0  1  2  3  4  5  6  7  8
	private ArrayList<Integer> salaryOptions = new ArrayList<Integer>(Arrays.asList(so));
	
	public ArrayList<Integer> getSalaryOptions()
	{
		return salaryoptions;
	}
	public Integer getSalary()
	{
		if(salaryOptions.size()==0)
			return 0;
		int rand = (int)(Math.random()*salaryOptions.size());
		Integer temp = salaryOptions.get(rand);
		salaryOptions.remove(rand);
		return temp;
	}
}