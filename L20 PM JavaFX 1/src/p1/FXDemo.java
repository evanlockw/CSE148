package p1;

import javafx.application.Application;
import javafx.stage.Stage;

public class FXDemo extends Application {

	public static void main(String[] args) { // one single thread
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception { // multithread portion

		primaryStage.show();
	}

}
