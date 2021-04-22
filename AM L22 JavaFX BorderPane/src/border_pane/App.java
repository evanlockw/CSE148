package border_pane;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class App extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		root.setPadding(new Insets(10, 20, 30, 20));
		// top
		MenuBar menuBar = new MenuBar();
		menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
		Menu homeMenu = new Menu("HOME");
		menuBar.getMenus().add(homeMenu);
		MenuItem exitItem = new MenuItem("Exit");
		MenuItem settingsItem = new MenuItem("Settings");
		MenuItem historyItem = new MenuItem("History");
		homeMenu.getItems().add(exitItem);
		homeMenu.getItems().add(settingsItem);
		homeMenu.getItems().add(historyItem);

		Menu trailMenu = new Menu("TRAILS");
		menuBar.getMenus().add(trailMenu);
		MenuItem searchItem = new MenuItem("Search");
		MenuItem updateItem = new MenuItem("Update");
		MenuItem removeItem = new MenuItem("Remove");
		trailMenu.getItems().add(searchItem);
		trailMenu.getItems().add(updateItem);
		trailMenu.getItems().add(removeItem);

		Menu adminMenu = new Menu("ADMIN");
		menuBar.getMenus().add(adminMenu);
		MenuItem userItem = new MenuItem("Users");
		MenuItem trailItem = new MenuItem("Trails");
		adminMenu.getItems().add(userItem);
		adminMenu.getItems().add(trailItem);

		exitItem.setOnAction(e -> {
//			BackupAndRestore.backupAll();
			Platform.exit();
		});

		// middle
		GridPane gridPane = new GridPane();
		gridPane.setPadding(new Insets(40));
		gridPane.setAlignment(Pos.CENTER);

		gridPane.prefWidthProperty().bind(primaryStage.widthProperty());
		gridPane.prefHeightProperty().bind(primaryStage.heightProperty());

		ColumnConstraints c1 = new ColumnConstraints();
		c1.setPercentWidth(50);
		c1.setHalignment(HPos.CENTER);
		ColumnConstraints c2 = new ColumnConstraints();
		c2.setPercentWidth(50);
		c2.setHalignment(HPos.CENTER);

		c1.setHgrow(Priority.ALWAYS);
		c2.setHgrow(Priority.ALWAYS);

		gridPane.getColumnConstraints().addAll(c1, c2);

		RowConstraints rc = new RowConstraints();
		rc.setFillHeight(true);
		rc.setValignment(VPos.CENTER);
		rc.setVgrow(Priority.ALWAYS);

		gridPane.getRowConstraints().add(rc);

		TextField firstNameField = new TextField();
		TextField lastNameField = new TextField();
		TextArea outputArea = new TextArea();
		Button okBtn = new Button("OK");
		okBtn.setMaxSize(70, 20);
		Button cancelBtn = new Button("CANCEL");
		cancelBtn.setMaxSize(70, 20);

		gridPane.add(firstNameField, 0, 0);
		gridPane.add(lastNameField, 1, 0);
		gridPane.add(okBtn, 0, 1);
		gridPane.add(cancelBtn, 1, 1);
		gridPane.add(outputArea, 0, 2, 2, 2);

		gridPane.setHgap(20);
		gridPane.setVgap(20);
		
		HBox buttonBox = new HBox(30);
		Button insertBtn = new Button("INSERT");
		Button searchBtn = new Button("SEARCH");
		Button updateBtn = new Button("UPDATE");
		Button removeBtn = new Button("REMOVE");
		
		buttonBox.setAlignment(Pos.CENTER);
		buttonBox.getChildren().addAll(insertBtn, searchBtn, updateBtn, removeBtn);

		root.setTop(menuBar);
		root.setCenter(gridPane);
		root.setBottom(buttonBox);

		Scene scene = new Scene(root, 500, 400);
		primaryStage.setScene(scene);
		primaryStage.setOnCloseRequest( e -> {
//			BackupAndRestore.backupAll();
		});
		primaryStage.show();
	}

}
