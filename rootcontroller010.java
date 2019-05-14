package application;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
public class rootcontroller010 implements Initializable {
   @FXML private TextArea textArea;
   public void initialize(URL location, ResourceBundle resources) { }

   public void handleOpen(ActionEvent e) {
	Stage primaryStage = (Stage) textArea.getScene().getWindow(); 

	FileChooser fileChooser = new FileChooser();
	fileChooser.getExtensionFilters().addAll( new ExtensionFilter("All Files", "*.*"));
	File selectedFile = fileChooser.showOpenDialog(primaryStage);

	if (selectedFile != null) {
		textArea.appendText(selectedFile.getPath());
	}
   }
}

