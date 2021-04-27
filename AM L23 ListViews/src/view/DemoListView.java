package view;

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
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DemoListView extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label response = new Label("Select a College: ");

		Text title = new Text("New York State Colleges");
		title.setFill(Paint.valueOf("#2A5058"));
		title.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		
		String selectedItem;

		ArrayList<String> list = new ArrayList<>();
		list.add("SCCC");
		list.add("SBU");
		list.add("NCC");
		list.add("NYU");
		list.add("St. Joe");

		ListViewPane listViewPane = new ListViewPane(list, response, selectedItem);
		VBox box = (VBox) listViewPane.getRoot();
		
		FlowPane root = new FlowPane();
		root.setPadding(new Insets(40));
	
		
		root.getChildren().addAll(title, box, response);

		Scene scene = new Scene(root, 350, 300);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
