package Eventhandling;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class SimpleEventHandling extends Application{

	class CancelButtonhandlerClass1 implements EventHandler<ActionEvent>{

    	@Override
    	public void handle(ActionEvent event) {
    		System.out.println("Cancel Button is Pressed");
    		
    	}

    }
    class OKButtonhandlerClass1 implements EventHandler<ActionEvent> {

    	@Override
    	public void handle(ActionEvent event) {
    		System.out.println("Ok Button is Clicked");
    		
    	}

    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		HBox pane = new HBox(10);
		pane.setAlignment(Pos.CENTER);
		Button btOK = new Button("OK");
	    Button btCancel = new Button("Cancel");
	    
	    OKButtonhandlerClass1 okButtonHandler = new OKButtonhandlerClass1();
	    btOK.setOnAction(okButtonHandler);
	    
	    CancelButtonhandlerClass1 cancelButtonHandler = new CancelButtonhandlerClass1();
	    btCancel.setOnAction(cancelButtonHandler);
	    
	    pane.getChildren().addAll(btOK, btCancel);
	    
	   /* btCancel.setOnAction(new EventHandler<ActionEvent>()
	 	   {
	    		public void handle(ActionEvent event)
	    		{
	    			System.out.println("Cancel button is fired!!!");
	    			compute();
	    		}
	    		void compute() {}
	 	   });*/
	    //btCancel.setOnAction( e -> {System.out.println("Cancel button is fired!!!");});
	       
	    Scene scene = new Scene(pane,200,200);
	    primaryStage.setTitle("Handle Event"); 
	    primaryStage.setScene(scene); 
	    primaryStage.show(); 
	    
	   
	}
	
	public static void main(String[] args) {
	    launch(args);
	  }

}
