package application;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TwoPlayerScreenController
{
	@FXML
	private String name1;
	@FXML
	private String gender1;
	@FXML
	private String color1;
	
	@FXML
	private String name2;
	@FXML
	private String gender2;
	@FXML
	private String color2;
	
	private ArrayList<Player> players = new ArrayList<Player>();
	
	public ArrayList<Player> getPlayers()
	{
		return players;
	}
	
	@FXML
	public void addPlayer1(ActionEvent event)
	{
		players.add(0,new Player(name1,gender1,color1));
	}
	
	@FXML
	public void addPlayer2(ActionEvent event)
	{
		players.add(1,new Player(name2,gender2,color2));
	}
	
	@FXML
	public void openBoard(ActionEvent event)
	{
		try 
		{
			Parent root = FXMLLoader.load(getClass().getResource("/application/Board.fxml"));
			
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