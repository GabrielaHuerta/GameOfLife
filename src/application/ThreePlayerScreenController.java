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

public class ThreePlayerScreenController
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
	
	@FXML
	private TextField name3;
	@FXML
	private TextField gender3;
	@FXML
	private TextField color3;
	
	private ArrayList<Player> players = new ArrayList<Player>();
	
	@FXML
	public void addPlayer1(ActionEvent event)
	{
		players.add(0,new Player(name1.getText(),gender1.getText(),color1.getText()));
	}
	
	@FXML
	public void addPlayer2(ActionEvent event)
	{
		players.add(1,new Player(name2.getText(),gender2.getText(),color2.getText()));
	}
	
	@FXML
	public void addPlayer3(ActionEvent event)
	{
		players.add(2,new Player(name3.getText(),gender3.getText(),color3.getText()));
	}
	
	@FXML
	public void openBoard(ActionEvent event)
	{
		try 
		{
			Parent root = FXMLLoader.load(getClass().getResource("/application/Board3.fxml"));
			
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