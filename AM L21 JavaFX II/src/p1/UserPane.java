package p1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class UserPane {
	private VBox root;
	
	public UserPane() {
		HBox inputBox = new HBox(20);
		inputBox.setAlignment(Pos.CENTER);
		TextField firstNameField = new TextField();
		firstNameField.setPromptText("FIRST NAME");
		TextField lastNameField = new TextField();
		lastNameField.setPromptText("LAST NAME");
		inputBox.getChildren().addAll(firstNameField, lastNameField);
		
		HBox buttonBox = new HBox(30);
		buttonBox.setAlignment(Pos.CENTER);
		Button okBtn = new Button("OK");
		okBtn.setPrefSize(50, 30);
		Button clearBtn = new Button("Clear");
		clearBtn.setPrefSize(50, 30);
		buttonBox.getChildren().addAll(okBtn, clearBtn);
		
		
		
		HBox outputBox = new HBox(20);
		outputBox.setAlignment(Pos.CENTER);
		TextArea outputArea = new TextArea();
		outputBox.getChildren().add(outputArea);
		
		okBtn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				String firstName = firstNameField.getText();
				String lastName = lastNameField.getText();
				outputArea.appendText("Hi, " + firstName + " " + lastName + "\n");
				firstNameField.clear();
				lastNameField.clear();
			}
			
		});
		
		clearBtn.setOnAction( e -> {
			firstNameField.clear();
			lastNameField.clear();
			outputArea.clear();
		});
		
		VBox root = new VBox(20);
		Insets insets = new Insets(40);
		root.setPadding(insets);
		root.getChildren().addAll(inputBox, buttonBox, outputBox);
		this.root = root;
	}

	public VBox getRoot() {
		return root;
	}
}
