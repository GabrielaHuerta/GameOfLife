package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController
{
	private Scene scene;
	@FXML
	public void choose2(ActionEvent event)
	{
		try 
		{
			Parent root = FXMLLoader.load(getClass().getResource("/application/TwoPlayerScreen.fxml"));
			
			scene = new Scene(root);
			
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
	
	@FXML
	public void choose3(ActionEvent event)
	{
		try 
		{
			Parent root = FXMLLoader.load(getClass().getResource("/application/ThreePlayerScreen.fxml"));
			
			scene = new Scene(root);
			
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
	
	@FXML
	public void choose4(ActionEvent event)
	{
		try 
		{
			Parent root = FXMLLoader.load(getClass().getResource("/application/FourPlayerScreen.fxml"));
			
			scene = new Scene(root);
			
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