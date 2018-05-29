package application;

import javafx.util.Duration;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Board2Controller
{
	@FXML
	private Label spin;
	public void spin(ActionEvent event)
	{
		int rand = (int)(Math.random()*10)+1;
		spin.setText(""+rand);
		
		Image car = new Image("redcar.png"); //pass an image to this thing  
    	ImageView tacos = new ImageView(car); 
    	 
    	 
         TranslateTransition transition = new TranslateTransition(Duration.seconds(3),tacos); 
        	//transition.setDuration(Duration.seconds(3)); 
    		tacos.setScaleX(.07);              //makes image smaller 
    		tacos.setScaleY(.07);  
    		//tacos.setRotate(-90);
        	/*transition.setFromX(startX);       //to where
        	transition.setFromY(startY);   */
        	
        
            transition.setToX(50);
            transition.setToY(50);
         
        	transition.setCycleCount(1); 
   
        	transition.play(); 
        	
        	Pane root = new Pane(); 
        	root.getChildren().add(tacos); 
        	Scene scene = new Scene(root, 875, 925); 
        	
        	Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        	window.setScene(scene);
			window.show();

	}
}
