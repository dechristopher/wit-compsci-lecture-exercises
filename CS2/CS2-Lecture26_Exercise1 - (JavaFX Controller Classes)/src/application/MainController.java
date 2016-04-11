package application;

import java.util.Random;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
	
	@FXML
	Label myMessage;
	
	public void ClickMe(){
		Random r = new Random();
		System.out.println(r.nextInt(100));
		myMessage.setText("Num: " + r.nextInt(100));
	}
}
