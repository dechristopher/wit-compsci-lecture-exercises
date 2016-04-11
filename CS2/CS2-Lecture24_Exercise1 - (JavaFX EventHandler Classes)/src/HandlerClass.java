import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandlerClass implements EventHandler<ActionEvent> {
	public void handle(ActionEvent event){
		System.out.println("You suck.");
	}
}
