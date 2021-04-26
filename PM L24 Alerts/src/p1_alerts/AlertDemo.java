package p1_alerts;

import java.util.Optional;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AlertDemo extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		PasswordField passField1 = new PasswordField();
		PasswordField passField2 = new PasswordField();
		
		passField1.setMaxSize(70, 20);
		passField2.setMaxSize(70, 20);
		
		Button okBtn = new Button("OK");
		okBtn.setPrefSize(70, 20);
		
		VBox root = new VBox(20);
		root.setAlignment(Pos.CENTER);
		root.setPadding(new Insets(50));
		root.getChildren().addAll(passField1, passField2, okBtn);
		
//		okBtn.setOnAction(e -> {
//			if(passField1.getText().equals(passField2.getText())) {
//				System.out.println("Good password match!");
//			} else {
//			Alert alert1 = new Alert(AlertType.INFORMATION);
//			alert1.setTitle("Warning!");
//			alert1.setHeaderText("Hey, there is a warning");
//			alert1.setContentText("Passwords entered are not the exactly same.");
//			alert1.showAndWait();
//			}
//		});
		
		okBtn.setOnAction(e -> {
			TextInputDialog dialog = new TextInputDialog();
			dialog.setTitle("Text Input Dialog");
			dialog.setHeaderText("Look, a Text Input Dialog!");
			dialog.setContentText("Please enter your username: ");
			
			Optional<String> result = dialog.showAndWait();
			if(result.isPresent()) {
				System.out.println("Your user name is: " + result.get());
			}
		});
		
//		
		Scene scene = new Scene(root, 250, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

}
