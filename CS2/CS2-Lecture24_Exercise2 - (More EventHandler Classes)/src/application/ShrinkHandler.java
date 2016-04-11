package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.shape.Circle;

public class ShrinkHandler implements EventHandler<ActionEvent>{
	public void handle(ActionEvent event){
		System.out.println("Shrink");
		try {
			Circle c = (Circle) Main.root.lookup("#circle");
			c.setRadius(c.radiusProperty().doubleValue() - 1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}