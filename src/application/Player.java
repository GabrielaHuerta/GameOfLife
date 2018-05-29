package application;

import java.util.ArrayList;

import javafx.fxml.FXML;

public class Player
{
	private String name;
	private String gender;
	private String carColor;
	private double totalMoney; 
	private int numOfChildren;
	private boolean hasSpouse;
	private String spouseGender;
	private ArrayList<Career> options;
	private Career test;


	public Player(String name, String gender, String carColor)
	{
		this.name = name;
		this.gender = gender; 
		this.carColor = carColor; 
		totalMoney = 200; 
		numOfChildren = 0; 
		hasSpouse = false; 
		spouseGender = "";    
	}

	public String getGender()
	{
		return gender; 
	}

	public String carColor()
	{
		return carColor; 
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


	public void subtractMoney(double money)
	{
		totalMoney -= money; 
	}

	public void addMoney(double money)
	{
		totalMoney += money; 
	}

	public double getTotalMoney()
	{
		return totalMoney; 
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


	public void setCareerOptions(String message)
    {
		options = new ArrayList<Career>();
		if(message.equals("College"))
		{
			options.add(new Scientist());
			options.add(new Doctor());
			options.add(new Vet());
			options.add(new Lawyer());
			options.add(new SecretAgent());
			options.add(new FashionDesigner());
			options.add(new GameDesigner());
		}
		else
		{
			options.add(new Police());
			options.add(new Dancer());
			options.add(new Athlete());
			options.add(new Singer());
			options.add(new Inventor());
			options.add(new FireFighter());
			options.add(new Chef());
			options.add(new RaceCarDriver());
		}
    }

}
