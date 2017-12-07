import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Button button1;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Main window");

        button1 = new Button("Show alert box");
        button1.setOnAction(e -> AlertBox.display("Alert Box", "Wow this alert box is awesome"));

        StackPane layout1 = new StackPane();
        layout1.getChildren().add(button1);
        Scene scene1 = new Scene(layout1, 300, 250);
        window.setScene(scene1);
        window.show();

    }
}

