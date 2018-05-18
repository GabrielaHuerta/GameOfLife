public class Family
{
	private int numOfChildren;
	private boolean hasSpouse;
	private String spouseGender;
	
	public Family()
	{
		numOfChildren = 0;
		hasSpouse = false;
		spouseGender = "";
	}
	
	public void getMarried(String gender)
	{
		hasSpouse = true;
		spouseGender = gender;
	}
	
	public void addChildren(int numBaby)
	{
		numOfChildren += numBaby;
	}
	
	public int getNumOfChildren()
	{
		return numOfChildren;
	}
	
	public boolean getHasSpouse()
	{
		return hasSpouse;
	}
	
	public String getSpouseGender()
	{
		return spouseGender;
	}
	
	public String toString()
	{
		String output = "";
		
		output += "Married : " + getHasSpouse() + "\n";
		if(getHasSpouse() == true)
			output += "Spouse Gender: " + getSpouseGender() + "\n";
		output += "Number of Children : " + getNumOfChildren() + "\n";
		
		return output;
	}
}
