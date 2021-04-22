package p1;


import java.util.ArrayList;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		root.setAlignment(root, Pos.CENTER);
		
		
		ListView<String> lvColleges;
		 
		Label response = new Label("Select a college or university: ");
		
		Text title = new Text("NY Colleges and Universities");
		title.setFill(Paint.valueOf("#2A5058"));
		title.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		
//		ObservableList<String> colleges = FXCollections.observableArrayList("Stony Brook", "NYU", "SCCC" , "NCC", "Columbia");
		ArrayList<String> dataList = new ArrayList<>();
		dataList.add("A");
		dataList.add("B");
		dataList.add("C");
		
		ObservableList<String> colleges = FXCollections.observableArrayList(dataList);
		lvColleges = new ListView<String>(colleges);
		lvColleges.setPrefSize(300, 150);
		
		MultipleSelectionModel<String> lvSelModel = lvColleges.getSelectionModel();
		lvSelModel.setSelectionMode(SelectionMode.MULTIPLE);
		lvSelModel.selectedItemProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> changed, String oldValue, String newValue) {
				response.setText("You selected " + newValue);
			}
			
		});
		
		FlowPane flowPane = new FlowPane(10, 10);
		flowPane.getChildren().add(title);
		flowPane.getChildren().add(lvColleges);
		flowPane.getChildren().add(response);
		
		root.setCenter(flowPane);
		root.setPadding(new Insets(10));
		
		Scene scene = new Scene(root, 400, 250);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
