import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class L24_E1 extends Application {

	public static void main(String[] args) {
		
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		
		Button btSuck = new Button("You suck.");
		btSuck.minWidthProperty().bind(pane.widthProperty());
		
		HandlerClass suckHandler = new HandlerClass();
		btSuck.setOnAction(suckHandler);
		
		pane.setMinWidth(120);
		pane.getChildren().add(btSuck);
		
		Scene s = new Scene(pane, 400, 400);
		
		primaryStage.setScene(s);
		primaryStage.setTitle("Sucker");
		primaryStage.show();
	}

}
