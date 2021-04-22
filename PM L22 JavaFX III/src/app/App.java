package app;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.HikeHistory;
import model.TrailBag;
import model.User;
import model.UserBag;
import utils.BackupAndRestore;
import view.SignInPane;

public class App extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		UserBag userBag = new UserBag(1000);
		TrailBag trailBag = new TrailBag(500);
		
		BackupAndRestore.restoreAll(userBag, trailBag);
		
		Pane root  = new SignInPane(userBag, primaryStage).getRoot();
	
		
		Scene scene = new Scene(root, 800, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
		
//		User user1 = new User("A", "AA", "AAA", "Aaa123", new HikeHistory());
//		User user2 = new User("B", "BB", "BBB", "Bbb123", new HikeHistory());
//		User user3 = new User("C", "CC", "CCC", "Ccc123", new HikeHistory());
//		
//		UserBag userBag = new UserBag(100);
//		userBag.insert(user1);
//		userBag.insert(user2);
//		userBag.insert(user3);
//		
//		userBag.display();
//		
//		User admin = userBag.getAdmin();
//		admin.setAdmin(user3);
//		
//		admin.unSetAdmin(user3);
//		
//		System.out.println("---------------------");
//		userBag.display();
//		
		
	}

}
