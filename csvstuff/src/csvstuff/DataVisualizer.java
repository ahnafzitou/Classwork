package csvstuff;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import csvstuff.CSVUtilities;
public class DataVisualizer extends Application {

	@Override
	public void start(Stage stage) throws Exception 
	{
		stage.setTitle("Most Used Platform");
		final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Platform");
        final LineChart<Number,Number> lineChart = new LineChart<Number,Number>(xAxis,yAxis);
        lineChart.setTitle("Social Media Usage, 2017");
        XYChart.Series series = new XYChart.Series();
        series.setName("My portfolio");
                
	}

}
