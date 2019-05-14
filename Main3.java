package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class Main3 implements Initializable {
	public void initialize(URL location, ResourceBundle resources) {
	}
	public void handleBtn1Action(ActionEvent event) { 
		System.out.println("버튼1 클릭"); 
	}
	public void handleBtn2Action(ActionEvent event) { 
		System.out.println("버튼2 클릭"); 
	}
	public void handleBtn3Action(ActionEvent event) { 
		System.out.println("버튼3 클릭"); 
	}
}

