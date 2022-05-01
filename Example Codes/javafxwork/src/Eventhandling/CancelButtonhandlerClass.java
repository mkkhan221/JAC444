package Eventhandling;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class CancelButtonhandlerClass implements EventHandler<ActionEvent>{

	@Override
	public void handle(ActionEvent event) {
		System.out.println("Cancel Button is Pressed");
		
	}

}
