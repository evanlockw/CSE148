package p1;

import java.util.ArrayList;
import java.util.List;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.Pane;

public class CollegeListView {
	
	private ListView listView;
	private String itemSelected;
	
	public CollegeListView(List<String> list) {
		ObservableList<String> observableList = FXCollections.observableArrayList(list);
		listView = new ListView(observableList);
		listView.setPrefSize(300, 150);
		
		MultipleSelectionModel<String> listViewSelectionModel = listView.getSelectionModel();
		listViewSelectionModel.setSelectionMode(SelectionMode.MULTIPLE);
		listViewSelectionModel.selectedItemProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> changed, String oldValue, String newValue) {
				itemSelected = newValue;
			}
			
		});
	}
	
	public ListView getListView() {
		return listView;
	}
	
	public String getSelectedItem() {
		return itemSelected;
	}
}
