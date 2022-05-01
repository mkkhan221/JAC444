package Basic;

//package sample.BasicExample.ShowCircle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ShowCircle extends Application {
  @Override 
  public void start(Stage primaryStage) {
    // Create a circle and set its properties
    Circle circle = new Circle();
    circle.setCenterX(200);
    circle.setCenterY(200);
    circle.setRadius(50);
    circle.setStroke(Color.BLACK);
    circle.setFill(Color.WHITE);
    
    Rectangle rectangle = new Rectangle(100,100,Color.RED);
    // Create a pane to hold the circle 
    Pane pane = new Pane();
    pane.getChildren().addAll(circle,rectangle);
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 400, 400);
    primaryStage.setTitle("ShowCircle"); 
    primaryStage.setScene(scene); 
    primaryStage.show(); 
  }
  
  public static void main(String[] args) {
    launch(args);
  }
}
