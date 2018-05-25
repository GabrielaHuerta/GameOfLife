package application;

import java.util.Scanner;

import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Transition2 extends Application
{
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
    	System.out.print("Choose a number: "); 
    	int x = scan.nextInt(); 
    	Arc shape = new Arc(200,200,100,100,0,360); // can do 
    	tacos.setScaleX(.25);     //makes image smaller 
		tacos.setScaleY(.25);     
		tacos.setRotate(-90);
    	  
    	PathTransition transition = new PathTransition(Duration.seconds(3), shape, tacos); //Duration == speed 
    	//transition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);  
    	transition.setAutoReverse(false);
    	//transition.setCycleCount(Animation.INDEFINITE); 
    	
    	
    	transition.play(); 
    	
    	if(tacos.getY() == 300) // location plus number given 
    		transition.stop(); 
    	
    	
    		
    	
    	Pane root = new Pane(); 
    	root.getChildren().add(tacos); 
    	Scene scene = new Scene(root, 600, 600); 
    	
    	
    	primaryStage.setTitle("Transition");
    	primaryStage.setScene(scene); 
    	primaryStage.show(); 
    	}
    }
 
 	