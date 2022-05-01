package Basic;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ButtonInPane extends Application {
	@Override 
	  public void start(Stage primaryStage) {
	    // Create a scene and place a button in the scene
	    //StackPane pane = new StackPane();
		HBox pane= new HBox();
		Button yes= new Button("Yes");
	    yes.setStyle("-fx-border-color: blue;");

	    Button no=new Button("No");
	   pane.getChildren().add(yes); 
	   pane.getChildren().add(no);
	   
	    
	    //hbox.getChildren().addAll(no,yes);
	    //pane.setRotat(45);
	    pane.setStyle("-fx-border-color: red; -fx-background-color: lightgray;");
	    pane.setMaxSize(100, 100);
	    Scene scene = new Scene(pane, 200, 250);
	    primaryStage.setTitle("Node Demo"); 
	    primaryStage.setScene(scene); 
	    primaryStage.show(); 
	  }
	  
	  public static void main(String[] args) {
	    launch(args);
	  }
}
