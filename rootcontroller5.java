package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.text.Font;

public class rootcontroller5 implements Initializable {
	@FXML private ColorPicker cp;
	@FXML private Label la;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		la.setFont(new Font(30));
		cp.setOnAction(e->{la.setTextFill(cp.getValue());});
	}
}

