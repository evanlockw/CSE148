package border_pane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		root.setPadding(new Insets(10, 100, 100, 100));
		//top
		MenuBar menuBar = new MenuBar();
		Menu fileMenu = new Menu("FILE");
		menuBar.getMenus().add(fileMenu);
		
		// middle
		GridPane gridPane = new GridPane();
		TextField firstNameField = new TextField();
		TextField lastNameField = new TextField();
		TextArea outputArea = new TextArea();
		Button okBtn = new Button("OK");
		Button cancelBtn = new Button("CANCEL");
		
		gridPane.add(firstNameField, 0, 0);
		gridPane.add(lastNameField, 1, 0);
		gridPane.add(okBtn, 0, 1);
		gridPane.add(cancelBtn, 1, 1);
		gridPane.add(outputArea, 0, 2, 2, 2);
		
		gridPane.setHgap(20);
		gridPane.setVgap(20);
		
		root.setTop(menuBar);
		root.setCenter(gridPane);
		
		
		Scene scene = new Scene(root, 500, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
