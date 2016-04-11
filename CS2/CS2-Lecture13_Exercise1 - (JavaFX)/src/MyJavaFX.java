import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX extends Application {

	@Override
	public void start(Stage primaryStage){
		Button btOK = new Button("Hello World!");
		Scene scene = new Scene(btOK, 300, 300);
		
		primaryStage.setResizable(false);
		
		primaryStage.setTitle("MyJavaFX");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
