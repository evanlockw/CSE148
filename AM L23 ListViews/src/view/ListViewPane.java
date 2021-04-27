package view;


import java.util.ArrayList;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ListViewPane {
	private VBox root;
	private String trailSelected;

	public ListViewPane(ArrayList<String> list, Label response) {
		String selected;
		root = new VBox(30);
		root.setPadding(new Insets(20));
		ObservableList<String> trailList = FXCollections.observableArrayList(list);
		ListView<String> lvTrails = new ListView(trailList);
		lvTrails.setPrefSize(300, 150);
		
		MultipleSelectionModel<String> lvSelModel = lvTrails.getSelectionModel();
		lvSelModel.setSelectionMode(SelectionMode.MULTIPLE);
		lvSelModel.selectedItemProperty().addListener(new ChangeListener() {

			@Override
			public void changed(ObservableValue arg0, Object oldValue, Object newValue) {
				response.setText((String)newValue);
			}

		});
		
		root.getChildren().add(lvTrails);
	}
	
	public Pane getRoot() {
		return root;
	}
	
	public String getSelectedItem() {
		return selectedItem;
	}
}
