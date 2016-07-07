package application.view;

import java.io.IOException;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class WorkspaceController {
	@FXML
	private Button next;
	@FXML
	private Button cancel;
	@FXML
	private Button previous;
	@FXML
	private CheckBox recievables;
	@FXML
	private CheckBox payments;
	
	@FXML
    private void initialize() {
		
		recievables.setUserData("recievables");
		payments.setUserData("payments");
		//previous.setDisable(true);
	
	}
	 @FXML
	 private void closeButtonAction(){
	        // get a handle to the stage
	        Stage stage = (Stage) cancel.getScene().getWindow();
	        // do what you have to do
	        stage.close();
	    }
	 @FXML
	 private void previousButtonAction(){
		 Stage stage = (Stage) cancel.getScene().getWindow();
	        // do what you have to do
		 FXMLLoader loader = new FXMLLoader();
         loader.setLocation(Main.class.getResource("view/setup.fxml"));
         VBox rootLayout=null;
		try {
			rootLayout = (VBox) loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
         // Show the scene containing the root layout.
         Scene scene = new Scene(rootLayout);
         stage.setScene(scene);
         
	 }
	 
	

}
