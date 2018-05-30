package application;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TwoPlayerScreenController
{
	@FXML
	private TextField name1;
	@FXML
	private TextField gender1;
	@FXML
	private TextField color1;
	
	@FXML
	private TextField name2;
	@FXML
	private TextField gender2;
	@FXML
	private TextField color2;
	
	private Player one = null;
	private Player two = null;
	
	@FXML
	private Label message;
	
	@FXML
	public void addPlayer1(ActionEvent event)
	{
		if(!name1.getText().equals(null) && !gender1.getText().equals(null) && !color1.getText().equals(null) && !one.getOptions().isEmpty())
		{
			one = new Player(name1.getText(),gender1.getText(),color1.getText());
		}
		else
		{
			message.setText("ERROR: SOMETHING MISSING");
		}
	}
	
	@FXML
	public void addPlayer2(ActionEvent event)
	{
		if(!name1.getText().equals(null) && !gender1.getText().equals(null) && !color1.getText().equals(null) && !one.getOptions().isEmpty())
		{
			two = new Player(name2.getText(),gender2.getText(),color2.getText());
		}
		else
		{
			message.setText("ERROR: SOMETHING MISSING");
		}
	}
	
	@FXML
	public void setCareerC1(ActionEvent event)
	{
		one.setCareerOptions("College");
	}
	
	@FXML
	public void setCareertoNC1(ActionEvent event)
	{
		one.setCareerOptions("No College");
	}
	
	@FXML
	public void setCareerC2(ActionEvent event)
	{
		two.setCareerOptions("College");
	}
	
	@FXML
	public void setCareertoNC2(ActionEvent event)
	{
		two.setCareerOptions("No College");
	}
	
	@FXML
	public void openBoard(ActionEvent event)
	{
		if(one == null && two == null)
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
		else
			message.setText("ERROR: SOMETHING MISSING");
	}
}