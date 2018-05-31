package application;

import java.util.ArrayList;

import javafx.fxml.FXML;

public class Player
{
	private String name;
	private String gender;
	private double totalMoney; 
	private int numOfChildren;
	private boolean hasSpouse;
	private ArrayList<Career> options;
	private double salary; 


	public Player(String name, String gender)
	{
		this.name = name;
		this.gender = gender; 
		totalMoney = 200; 
		numOfChildren = 0; 
		hasSpouse = false;  
		salary = 0; 
	}

	public String getName()
	{
		return name; 
	}
	
	public String getGender()
	{
		return gender; 
	}

	public int getNumOfChildren()
	{
		return numOfChildren;
	}

	public boolean isMarried()
	{
		return hasSpouse;
	}

	
	public double getSalary()
	{
		return salary; 
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
	
	public void setSalary(int sal)
	{
		salary = sal; 
	}

	public void getMarried()
	{
		hasSpouse = true;
	}
	

	public void addChildren(int numBaby)
	{
		numOfChildren += numBaby;
	}


}
