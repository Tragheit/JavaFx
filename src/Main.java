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
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        window = primaryStage;
        window.setTitle("Main window");

        //executes safe exit when "x" clicked
        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });

        button = new Button("Close Program");

        //executes safe exit when button clicked
        button.setOnAction(e -> closeProgram());


        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene1 = new Scene(layout, 300, 250);
        window.setScene(scene1);
        window.show();
    }

    private void closeProgram() {
        Boolean answer = ConfirmBox.display("Title", "Sure you want exit");

        if(answer) {
            window.close();
        }
    }
}

