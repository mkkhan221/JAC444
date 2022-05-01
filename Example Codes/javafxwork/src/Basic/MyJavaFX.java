package Basic;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {

		// Creating a simple button
		Button btnOK = new Button ("OK");
		Button btnCl = new Button ("Cancel");
		Scene sceneok = new Scene(btnOK, 100,150);
		
		primaryStage.setTitle("MyJavaFx");
		primaryStage.setScene(sceneok);
		
		primaryStage.show();	
	}
	public static void main(String[] args) {
		launch(args);
	}

}

