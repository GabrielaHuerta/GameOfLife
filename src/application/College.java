package application;

public abstract class College extends Career
{
	public College()
	{
		super.needDegree = true;
	}
}
//College - Scientist, doctor, Vet, Lawyer, SecretAgent, fashion designer, game designer
class Scientist extends College
{
	
	@Override
	public String getCareer()
	{
		return "Scientist";
	}
	
	public int getSalary()
	{
		super.salary = 100;
		return salary;
	}
	
}

class Doctor extends College
{
	
	@Override
	public String getCareer()
	{
		return "Doctor";
	}
	
	public int getSalary()
	{
		super.salary = 130;
		return salary;
	}
	
}

class Vet extends College
{
	
	@Override
	public String getCareer()
	{
		return "Veterinarian";
	}
	
	public int getSalary()
	{
		super.salary = 100;
		return salary;
	}
	
}

class Lawyer extends College
{
	
	@Override
	public String getCareer()
	{
		return "Lawyer";
	}
	
	public int getSalary()
	{
		super.salary = 120;
		return salary;
	}
	
}

class SecretAgent extends College
{
	
	@Override
	public String getCareer()
	{
		return "Secret Agent";
	}
	
	public int getSalary()
	{
		super.salary = 100;
		return salary;
	}
	
}

class FashionDesigner extends College
{
	@Override
	public String getCareer()
	{
		return "Fashion Designer";
	}
	
	public int getSalary()
	{
		super.salary = 80;
		return salary;
	}
}

class GameDesigner extends College
{
	@Override
	public String getCareer()
	{
		return "Game Designer";
	}
	
	public int getSalary()
	{
		super.salary = 110;
		return salary;
	}
}