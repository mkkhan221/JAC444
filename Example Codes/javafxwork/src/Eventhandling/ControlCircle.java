package Eventhandling;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;

import javafx.stage.Stage;

public class ControlCircle extends Application {
  private CirclePane circlePane = new CirclePane();

  @Override 
  public void start(Stage primaryStage) {
    
    HBox hBox = new HBox();
    hBox.setSpacing(10);
    hBox.setAlignment(Pos.CENTER);
    Button btEnlarge = new Button("Enlarge");
    Button btShrink = new Button("Shrink");
    hBox.getChildren().add(btEnlarge);
    hBox.getChildren().add(btShrink);
    
    // Create and register the handler
    btEnlarge.setOnAction(new EnlargeHandler());
    btShrink.setOnAction(new ShrinkHandler());
    //btEnlarge.addEventHandler(ActionEvent.ANY, new EnlargeHandler());    
    
    //Create and register the handler using Anonymous class
    /*
     * btnEnlarge.setOnAction(new EventHandler<ActionEvent>(){
     * 					public void handle(ActionEvent e){
     * 						circlePane.enlarge();
     * 					}
     * 				});
     * 
     * btnShrink.setOnAction(new EventHandler<ActionEvent>(){
     * 					public void handle(ActionEvent e){
     * 						circlePane.shrink();
     * 					}
     * 				});
     */
    BorderPane borderPane = new BorderPane();
    borderPane.setCenter(circlePane);
    borderPane.setBottom(hBox);
    BorderPane.setAlignment(hBox, Pos.CENTER);
    
    
    Scene scene = new Scene(borderPane, 200, 150);
    primaryStage.setTitle("ControlCircle"); 
    primaryStage.setScene(scene); 
    primaryStage.show(); 
  }
  
  //Inner Class
  class EnlargeHandler implements EventHandler<ActionEvent> {
    @Override 
    public void handle(ActionEvent e) {
    	circlePane.enlarge();
      
    }
  }
  
  //Inner Class
  class ShrinkHandler implements EventHandler<ActionEvent>{

	@Override
	public void handle(ActionEvent event) {
		circlePane.shrink();
		
	}
	  
	  
  }
  
  public static void main(String[] args) {
    launch(args);
  }
}
