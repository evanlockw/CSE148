package p1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Demo extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception { // multithread program
		UserBag userBag = BackupAndRestoreTools.restore();
		
		HBox box2 = new HBox(30);
		box2.setAlignment(Pos.CENTER);
		
		TextField nameField = new TextField();
		nameField.setPromptText("NAME");
		TextField idField = new TextField();
		idField.setPromptText("ID");
		
		HBox box3 = new HBox(30);
		box3.setAlignment(Pos.CENTER);
		
		Label viewLbl = new Label("RESULTS");
		
		box2.getChildren().addAll(nameField, idField);
		box3.getChildren().add(viewLbl);
		
		
		Button btn1 = new Button("Hi");
		btn1.setPrefWidth(40);
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				String name = nameField.getText();
				String id = idField.getText();
				viewLbl.setText("Hi, " + name + ", your ID is " + id);
				nameField.clear();
				idField.clear();
			}
			
		});
		
		
		// controls
		Button btn2 = new Button("Bye");
		btn2.setPrefWidth(40);
		
		btn2.setOnAction(e -> {
			String name = nameField.getText();
			String id = idField.getText();
//			User user = new User(nameField.getText(), emailField.getText());
//			UserBag.insert(user);
			BackupRestoreTools.backup(userBag);
			viewLbl.setText("Bye, " + name + ", your ID is " + id);
			nameField.clear();
			idField.clear();
		});
		
		
		HBox box1 = new HBox(60);
		box1.setAlignment(Pos.CENTER);
		box1.getChildren().addAll(btn1, btn2);
		
		VBox root = new VBox(30);
		
		root.setAlignment(Pos.CENTER);
		
		root.getChildren().addAll(box1, box2, box3);
		
		Scene scene = new Scene(root, 400, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Hello");
		primaryStage.show();
		
	}

}
