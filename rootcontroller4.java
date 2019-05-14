package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

public class rootcontroller4 implements Initializable {
	@FXML private TextField tf;
	@FXML private TextArea ta;
	@FXML private ComboBox<String> combo;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		combo.getItems().add("¸ð¸§");
		combo.valueProperty().addListener(new ChangeListener< String >() {
        	      public void changed(ObservableValue<? extends  String>  observable,  String  			oldValue, String  newValue) {
        		ta.setText(newValue);
        	      }
		});
	}
}

