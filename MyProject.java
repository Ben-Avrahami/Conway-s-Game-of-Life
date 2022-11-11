import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class MyProject extends Application{
	public void start(Stage stage) throws Exception{
		Parent root = (Parent)

				FXMLLoader.load(getClass().getResource("MyProject.fxml"));

		Scene scene = new Scene(root);
		stage.setTitle("Game Of Life");//title of the window
		stage.setScene(scene);
		stage.setResizable(false);//makes the windows not resizeable
		stage.show();
	}
	public static void main(String[] args) {
		launch(args);
		System.out.println();
	}
}
