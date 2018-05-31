package application;

import java.util.ArrayList;

import javafx.fxml.FXML;

public class Player
{
	private String name;
	private String gender;
	private double totalMoney; 
	private int numOfChildren;
	//private boolean hasSpouse;
	private ArrayList<Career> options;
	private double salary; 
	private double costOfHouse; 


	public Player(String name, String gender)
	{
		this.name = name;
		this.gender = gender; 
		totalMoney = 200000; 
		numOfChildren = 0; 
		salary = 0; 
		costOfHouse = 0; 
	}
	
	public void setCostOfHouse(double cost)
	{
		 costOfHouse = cost; 
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
 
	
	public double getSalary()
	{
		return salary; 
	}
	
	public double getCostOfHouse()
	{
		return costOfHouse; 
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


	public void addChildren(int numBaby)
	{
		numOfChildren += numBaby;
	}


}
