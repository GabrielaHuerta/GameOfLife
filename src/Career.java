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
	protected boolean needDegree;
	protected int salary; //in thousands
	
	public Career()
	{
		career = getCareer();
	}
	
	public String getCareer();
}

class Doctor extends Career
{
	needDegree = true;
	salary = 100;
	
	public String getCareer()
	{
		return "Doctor";
	}
}

class Superstar extends Career
{
	needDegree = false;
	salary = 60;
	
	public String getCareer()
	{
		return "Superstar";
	}
}

class Clown extends Career
{
	needDegree = false;
	salary = 10;
	
	public String getCareer()
	{
		return "Clown";
	}
}

class Teacher extends Career
{
	needDegree = true;
	salary = 50;
	
	public String getCareer()
	{
		return "Teacher";
	}
}

class Athlete extends Career
{
	needDegree = false;
	salary = 50;
	
	public String getCareer()
	{
		return "Athlete";
	}
}

class SalesPerson extends Career
{
	needDegree = false;
	salary = 30;
	
	public String getCareer()
	{
		return "SalesPerson";
	}
}

class Accountant extends Career
{
	needDegree = true;
	salary = 80;
	
	public String getCareer()
	{
		return "Accountant";
	}
}

class Artist extends Career
{
	needDegree = false;
	salary = 20;
	
	public String getCareer()
	{
		return "Artist";
	}
}

class Pilot extends Career
{
	needDegree = true;
	salary = 70;
	
	public String getCareer()
	{
		return "Pilot";
	}
}

class Police extends Career
{
	needDegree = true;
	salary = 60;
	
	public String getCareer()
	{
		return "Police Officer";
	}
}

class Scientist extends Career
{
	needDegree = true;
	salary = 100;
	
	public String getCareer()
	{
		return "Scientist";
	}
}

class CEO extends Career
{
	needDegree = true;
	salary = 90;
	
	public String getCareer()
	{
		return "CEO";
	}
}

class Construction extends Career
{
	needDegree = false;
	salary = 10;
	
	public String getCareer()
	{
		return "Construction Worker";
	}
}

class Farmer extends Career
{
	needDegree = false;
	salary = 40;
	
	public String getCareer()
	{
		return "Farmer";
	}
}

class Makeup extends Career
{
	needDegree = false;
	salary = 30;
	
	public String getCareer()
	{
		return "Cosmetologist";
	}
}

class MrStites extends Career
{
	needDegree = true;
	salary = 1000;
	
	public String getCareer()
	{
		return "Mr. Stites - a God":
	}
}