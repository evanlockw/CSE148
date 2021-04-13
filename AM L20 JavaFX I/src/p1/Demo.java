package p1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Demo extends Application {

	public static void main(String[] args) { // For single thread program
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception { // for multithread program
		System.out.println("hello world!");
		
		Button btn1 = new Button("Hi");
		btn1.setPrefSize(70, 30);
		Button btn2 = new Button("Bye");
		btn2.setPrefSize(70, 30);
		HBox box1 = new HBox(60);
		box1.setAlignment(Pos.CENTER);
		box1.getChildren().addAll(btn1, btn2);
		
		TextField nameField = new TextField();
		TextField showField = new TextField();
		
		btn1.setOnAction(e -> {
			String name = nameField.getText();
			showField.setText("Hi, " + name);
			nameField.clear();
		});
		
		btn2.setOnAction(e -> {
			String name = nameField.getText();
			showField.setText("Bye, " + name);
			nameField.clear();
		});
		
		HBox box2 = new HBox(30);
		box2.setAlignment(Pos.CENTER);
		box2.getChildren().addAll(nameField, showField);
		
		VBox root = new VBox(60);
		root.setAlignment(Pos.CENTER);
		
		root.getChildren().addAll(box1, box2);
		
		Scene scene = new Scene(root, 400, 300);
		primaryStage.setTitle("Hello");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
