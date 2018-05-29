package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Board4Controller
{
	@FXML
	private Label spin;
	public void spin(ActionEvent event)
	{
		int rand = (int)(Math.random()*10)+1;
		spin.setText(""+rand);
	}
}
