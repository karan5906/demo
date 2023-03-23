import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MyJavaFx extends Application {
    // Override the start method in the Application class
    @Override
    public void start(Stage primaryStage) {
        // Create a scene and place a button in the scene
        FlowPane pane = new FlowPane();
        Button btOK = new Button("OK");
        Button btCancel = new Button("Cancel");
        pane.getChildren().add(btOK);
        pane.getChildren().add(btCancel);
        pane.setVgap(5);
        pane.setHgap(85);
        FlowPane.setMargin(btOK, new Insets(10, 10, 10, 10));
        FlowPane.setMargin(btCancel, new Insets(10, 10, 10, 10));
        Scene scene = new Scene(pane, 230, 50);
        primaryStage.setTitle("MyJavaFX"); // Set the window title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    public static void main(String[] args) {
        launch(args); // Call superclass to create JavaFX application
    }
}