package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class Main extends Application {
	
	public static Parent root;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			root = FXMLLoader.load(getClass().getResource("app.fxml"));
			
			Button btShrink = (Button) root.lookup("#shrink");
			Button btEnlarge = (Button) root.lookup("#enlarge");
			
			ShrinkHandler sh = new ShrinkHandler();
			EnlargeHandler eh = new EnlargeHandler();
			
			btShrink.setOnAction(sh);
			btEnlarge.setOnAction(eh);
			
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}