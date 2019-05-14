package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BubbleChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
public class rootcontroller8 implements Initializable {
   @FXML private BubbleChart bubChart;
   @FXML private ScatterChart scatterChart;
   @FXML private LineChart lineChart;
   public void initialize(URL location, ResourceBundle resources) {
	XYChart.Series series1 = new XYChart.Series();
	series1.setName("Data1");       
	series1.setData(FXCollections.observableArrayList(
		new XYChart.Data(0.5, 70),new XYChart.Data(1.2, 40),
		new XYChart.Data(2.1, 50),new XYChart.Data(1.7, 30)
	));  
	XYChart.Series series2 = new XYChart.Series();
	series2.setName("Data2");
	series2.setData(FXCollections.observableArrayList(
		new XYChart.Data(2.3, 30),new XYChart.Data(2.1, 60),
		new XYChart.Data(0.3, 50),new XYChart.Data(3.0, 60)
	));
	XYChart.Series series4 = new XYChart.Series();
	series4.setName("Data1");       
	series4.setData(FXCollections.observableArrayList(
		new XYChart.Data(1.1, 5.5),new XYChart.Data(1.2, 5.6),
		new XYChart.Data(1.3, 5.5),new XYChart.Data(1.1, 5.6)
	));  
	XYChart.Series series5 = new XYChart.Series();
	series5.setName("Data2");       
	series5.setData(FXCollections.observableArrayList(
		new XYChart.Data(2.3, 6.0),new XYChart.Data(2.1, 3.0),
		new XYChart.Data(0.3, 6.0),new XYChart.Data(3.0, 3.0)
	));
	bubChart.getData().add(series4);
	bubChart.getData().add(series5);
	scatterChart.getData().add(series1);
	scatterChart.getData().add(series2);
	XYChart.Series series3 = new XYChart.Series();
	series3.setName("Æò±Õ¿Âµµ");       
	series3.setData(FXCollections.observableArrayList(
		new XYChart.Data("2015", 13),new XYChart.Data("2016", 6),
		new XYChart.Data("2017", 22),new XYChart.Data("2018", 19)
	));
	lineChart.getData().add(series3);
   }
}
