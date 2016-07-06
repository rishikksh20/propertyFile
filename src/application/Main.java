package application;
	
import java.io.File;
import java.io.IOException;

import application.view.SetUpController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	 private Stage primaryStage;
	@Override
	public void start(Stage primaryStage) {
		try {
			this.primaryStage=primaryStage;
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,640,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("FinnAxia SetUp"); 
			initRootLayout();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	/**
     * Initializes the root layout.
     */
    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/setup.fxml"));
            VBox rootLayout = (VBox) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            
            
         // Give the controller access to the main app.
            SetUpController controller = loader.getController();
            
            
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Try to load last opened person file.
     
    }
	public static void main(String[] args) {
		launch(args);
	}
}
