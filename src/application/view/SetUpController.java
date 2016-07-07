package application.view;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SetUpController {
	@FXML
	private Button next;
	@FXML
	private Button cancel;
	@FXML
	private Button previous;
	@FXML
	private RadioButton createWorkspace;
	@FXML
	private RadioButton workspace;
	@FXML
	private ImageView logo;
	@FXML
	ToggleGroup toggleBtn;
	@FXML
	VBox primaryVBox;

	
	@FXML
    private void initialize() {
		
		createWorkspace.setUserData("createWorkspace");
		workspace.setUserData("workspace");
		previous.setDisable(true);
	
	}
	
	Stage prevStage;
	

    public void setPrevStage(Stage stage){
         this.prevStage = stage;
         
    }

    
    @FXML
    public void gotoCreateCategory() throws IOException {
      // Stage stage = new Stage();
       
//       try {
//           // Load root layout from fxml file.
//          // FXMLLoader loader = new FXMLLoader();
//           //loader.setLocation(Main.class.getResource("view/setup.fxml"));
//           //VBox rootLayout = (VBox) loader.load();
//
//           // Show the scene containing the root layout.
//         //  Scene scene = new Scene(rootLayout);
//         //  prevStage.setScene(scene);
//           
//           
//        // Give the controller access to the main app.
//          // SetUpController controller = loader.getController();
//           
//           
//           prevStage.show();
//       }
//       } catch (IOException e) {
//           e.printStackTrace();
//       }
      // br.getChildren().clear();
    	Stage stage = (Stage) next.getScene().getWindow();
    	
    	
//       primaryVBox.getChildren().clear();
//       Scene scene = new Scene(primaryVBox);
//       prevStage.setScene(scene);
       
     //  myPane = FXMLLoader.load(getClass().getResource("createCategory.fxml"));
      // Scene scene = new Scene(myPane);
      // stage.setScene(scene);

      // prevStage.close();

    	 FXMLLoader loader = new FXMLLoader();
         loader.setLocation(Main.class.getResource("view/workspace.fxml"));
         VBox rootLayout = (VBox) loader.load();
         
         // Show the scene containing the root layout.
         Scene scene = new Scene(rootLayout);
         stage.setScene(scene);
         
         
      // Give the controller access to the main app.
       //  SetUpController controller = loader.getController();
       //  controller.setPrevStage(primaryStage,root);
         
         
    }
    @FXML
    private void closeButtonAction(){
        // get a handle to the stage
        Stage stage = (Stage) cancel.getScene().getWindow();
        // do what you have to do
        stage.close();
    }
	

}
