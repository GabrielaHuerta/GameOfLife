package application;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TwoPlayerScreenController
{
	@FXML
	private TextField name1;
	@FXML
	private TextField gender1;
	
	@FXML
	private TextField name2;
	@FXML
	private TextField gender2;
	 
	
	protected static Player one;
	protected static Player two;
	
	
	@FXML
	public void addPlayer1(ActionEvent event)
	{
		one = new Player(name1.getText(),gender1.getText()); 
	}
	
	@FXML
	public void addPlayer2(ActionEvent event)
	{
		two = new Player(name2.getText(),gender2.getText());
	}
	
	
	protected String getCollegeCareer(Player play)
	{
		ArrayList<Career> collegeCareer = new ArrayList<Career>(); 
		collegeCareer.add(new Career("Doctor", 130000));
		collegeCareer.add(new Career("Scientist", 100000));
		collegeCareer.add(new Career("Veterinarian", 100000));
		collegeCareer.add(new Career("Lawyer", 120000));
		collegeCareer.add(new Career("Fashion Designer", 80000));
		collegeCareer.add(new Career("Game Designer", 110000));
		collegeCareer.add(new Career("Secret Agent", 100000));
		collegeCareer.add(new Career("Mr.Stites", 1000000));
		collegeCareer.add(new Career("Extra", 1000000));
		 
		int rand = (int)(Math.random()*collegeCareer.size()-1); 
		play.setSalary(collegeCareer.get(rand).getSalary()); 
		return collegeCareer.get(rand).toString(); 
		
		
	}
	
	protected String getNonCollegeCareer(Player play)
	{
		ArrayList<Career> nonCollegeCareer = new ArrayList<Career>(); 
		nonCollegeCareer.add(new Career("Dancer", 50000));
		nonCollegeCareer.add(new Career("Athlete", 50000));
		nonCollegeCareer.add(new Career("Chef", 50000));
		nonCollegeCareer.add(new Career("Athlete", 50000));
		nonCollegeCareer.add(new Career("Race Car Driver", 60000));
		nonCollegeCareer.add(new Career("Police Officer", 50000));
		nonCollegeCareer.add(new Career("Inventor", 80000));
		nonCollegeCareer.add(new Career("Extra", 80000));
		
	
		int rand = (int)(Math.random()*nonCollegeCareer.size()-1); 
		play.setSalary(nonCollegeCareer.get(rand).getSalary()); 
		return nonCollegeCareer.get(rand).toString(); 
		
	}
	
	
	
	
	@FXML
	public void openBoard(ActionEvent event)
	{
		try 
		{
			Parent root = FXMLLoader.load(getClass().getResource("/application/Board2.fxml"));
			
			Scene scene = new Scene(root);
			
			//This line gets Stage info
			Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
			window.setScene(scene);
			window.show();
		} 
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}