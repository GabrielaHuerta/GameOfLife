package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BeginningController
{
	@FXML
	public void start(ActionEvent event)
	{
		try 
		{
			Parent root = FXMLLoader.load(getClass().getResource("/application/TwoPlayerScreen.fxml"));

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