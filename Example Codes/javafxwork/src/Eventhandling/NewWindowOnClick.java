package Eventhandling;



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class NewWindowOnClick extends Application{

	@Override
	public void start(Stage primaryStage){
		Button newWindow_btn = new Button();
		newWindow_btn.setText("Open a new Window");
		
		newWindow_btn.setOnAction( new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				Label myLabel = new Label("I am second Window");
				
				StackPane secondPane = new StackPane();
				secondPane.getChildren().add(myLabel);
				
				Scene secondScene = new Scene(secondPane,200,200);
				
				Stage secondStage = new Stage();
				secondStage.setTitle("New Window");
				secondStage.setScene(secondScene);
				
				secondStage.show();
				
				
			}
			
			
		});
		
		StackPane root = new StackPane();
		root.getChildren().add(newWindow_btn);
		
		Scene rootScene = new Scene(root, 400,200);
		primaryStage.setTitle("JavaFX Open a new Window Demo");
        primaryStage.setScene(rootScene);
        primaryStage.show();
	}
	public static void main(String[] args) {
        launch(args);
    }
}
