package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("app.fxml"));
			
			Text t = (Text) root.lookup("#text");
			
			t.setOnKeyPressed(e -> {
				switch(e.getCode()){
				case UP:
					t.setY(t.getY() - 1);
					break;
				case DOWN:
					t.setY(t.getY() + 1);
					break;
				case LEFT:
					t.setX(t.getX() - 1);
					break;
				case RIGHT:
					t.setX(t.getX() + 1);
					break;
				default:
					break;
				}
			});
			
			Scene scene = new Scene(root,200,200);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("KeyPressed");
			primaryStage.setScene(scene);
			primaryStage.show();
			
			t.requestFocus();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}