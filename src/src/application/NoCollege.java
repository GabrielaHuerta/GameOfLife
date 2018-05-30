package application;

public abstract class NoCollege extends Career
{
	public NoCollege()
	{
		super.needDegree = false;
	}
}

class Police extends NoCollege
{
	@Override
	public String getCareer()
	{
		return "Police Officer";
	}
	
	public int getSalary()
	{
		super.salary = 50;
		return salary;
	}
}

class Dancer extends NoCollege
{
	@Override
	public String getCareer()
	{
		return "Dancer";
	}
	
	public int getSalary()
	{
		super.salary = 50;
		return salary;
	}
}

class Athlete extends NoCollege
{
	@Override
	public String getCareer()
	{
		return "Athlete";
	}
	
	public int getSalary()
	{
		super.salary = 50;
		return salary;
	}
}

class Singer extends NoCollege
{
	@Override
	public String getCareer()
	{
		return "Singer";
	}
	
	public int getSalary()
	{
		super.salary = 70;
		return salary;
	}
}

class Inventor extends NoCollege
{
	@Override
	public String getCareer()
	{
		return "Inventor";
	}
	
	public int getSalary()
	{
		super.salary = 80;
		return salary;
	}
}

class FireFighter extends NoCollege
{
	@Override
	public String getCareer()
	{
		return "FireFighter";
	}
	
	public int getSalary()
	{
		super.salary = 50;
		return salary;
	}
}

class RaceCarDriver extends NoCollege
{
	@Override
	public String getCareer()
	{
		return "Race Car Driver";
	}
	
	public int getSalary()
	{
		super.salary = 60;
		return salary;
	}
}

class Chef extends NoCollege
{
	@Override
	public String getCareer()
	{
		return "Chef";
	}
	
	public int getSalary()
	{
		super.salary = 50;
		return salary;
	}
}