/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**********************************************
Workshop 7
Course:JAC44
Last Name:MANVANI
First Name:PRIYANKA
ID:141803197
Section:JAC444NBB
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature
Date:27-03-2022
**********************************************/ 
package Eventhandling;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TesterClass extends Application {
    private int year;
    private char gender;
    private String name;

    private TextField txtName = new TextField();
    private TextField cbYear = new TextField();
    private TextField cbGender = new TextField();
    
    private Label status = new Label();

    private Button btnSubmit = new Button("Submit Query");
    private Button btnExit = new Button("Exit");

    

    public void start(Stage primaryStage) {
        final GridPane search = new GridPane();
        search.setPadding(new Insets(30,30,30,30));
        search.setVgap(10);
        search.setHgap(10);

        final ColumnConstraints c1 = new ColumnConstraints();
        c1.setPercentWidth(40);
        final ColumnConstraints c2 = new ColumnConstraints();
        c2.setPercentWidth(40);
        final ColumnConstraints c3 = new ColumnConstraints();
        c3.setPercentWidth(40);
        search.getColumnConstraints().addAll(c1,c2,c3);
        

        search.add(new Label("Enter the Year"),0,0);
        search.add(cbYear,1,0);
        

        search.add(new Label("Enter the Gender"),0,1);
        search.add(cbGender,1,1);
     

        search.add(new Label("Enter the Name"),0,2);
        search.add(txtName,1,2);

        search.add(status, 0,3,2,1);

        HBox buttons = new HBox(10);

        btnSubmit.setPrefWidth(140);
        btnExit.setPrefWidth(70);

        buttons.getChildren().addAll(btnSubmit, btnExit);
        search.add(buttons,0,4,2,1);


        btnSubmit.setOnAction(e -> {
            status.setText("");
  
              
                name = txtName.getText().substring(0,1).toUpperCase() + txtName.getText().substring(1).toLowerCase();

                if(name.isEmpty()) {
                    status.setText("Please enter a name.");
                }
                else {
                    int rank = Function.findName(year, gender, name);

                    if(rank == 0) {
                        status.setText("Entered name is  not found.");
                    }
                    else {
                        status.setText(name + "(" + gender + ") found at rank #" + rank + " in " + year);
                    }
                }
           
        });


        btnExit.setOnAction(e -> Platform.exit() );

        txtName.setOnKeyPressed(e-> {
            if(e.getCode() == KeyCode.ENTER) {
                btnSubmit.fire();
            }
        });

        Scene scene = new Scene(search,350,230);

        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Search Name Ranking Application");
        primaryStage.show();
    }

    public static void main(String[] args) { launch (args); }
}
