package application;

import java.util.ArrayList;
import java.util.Scanner;                                      //simply drop pieces at spot assigned 

import javafx.animation.Animation;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Transition extends Application
{
	private ArrayList<Coordinate> list = new ArrayList<Coordinate>(); 
	private int spotCount = 0; 
	private int startX = 0; 
	private int startY = 0; 
	private int endX = 50; 
	private int endY = 50; 
	public static void main(String[] args) 
	{
		launch(args);
	}
    public void start(Stage primaryStage)
    {
    	// talk with others about Path transition
    	//https://docs.oracle.com/javafx/2/animations/basics.htm#CJAJJAGI 
    	Image car = new Image("car.png"); //pass an image to this thing  
    	ImageView tacos = new ImageView(car); 
    	Scanner scan = new Scanner(System.in); 
    	 
    	 
         TranslateTransition transition = new TranslateTransition(Duration.seconds(3),tacos); 
        	//transition.setDuration(Duration.seconds(3)); 
    		tacos.setScaleX(.07);              //makes image smaller 
    		tacos.setScaleY(.07);  
    		tacos.setRotate(-90);
        	transition.setFromX(startX);       //to where
        	transition.setFromY(startY);   
        	
        
            transition.setToX(endX);
            transition.setToY(endY); 
         
        	transition.setCycleCount(1); 
   
        	transition.play(); 
        	
        	Pane root = new Pane(); 
        	root.getChildren().add(tacos); 
        	Scene scene = new Scene(root, 875, 925); 
        	
        	
        	primaryStage.setTitle("Transition");
        	primaryStage.setScene(scene); 
        	primaryStage.show(); 
        	
    
    }
}
 	
   
