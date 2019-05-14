package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class rootcontroller3 implements Initializable {
	@FXML private TextField tf;
	@FXML private TextArea ta;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		tf.setOnAction(e -> {ta.appendText(tf.getText()+"\n");tf.clear();});
	}
}

