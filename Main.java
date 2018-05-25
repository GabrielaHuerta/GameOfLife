package application;
	
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	/*public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}*/

	public void start(Stage theStage)
	{
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root,400,400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		theStage.setScene(scene);
		theStage.show();
		theStage.setTitle("Timeline Example");
		// root = new Group(); 
		Scene theScene = new Scene(root); 
		theStage.setScene(theScene); 
		
		Canvas canvas = new Canvas (600,600); 
		root.getChildren().add(canvas); 
		
		GraphicsContext gc = canvas.getGraphicsContext2D(); 
		
		Image wheel = new Image("wheel-of-fortune-hi.png"); 
		
		final long startNanoTime = System.nanoTime(); 
		
		new AnimationTimer()
		{
			public void handle(long currentnanoTime)
			{
				
				gc.drawImage(wheel, 300, 300);
			}
			
		}.start();
		
		theStage.show(); 
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
}
