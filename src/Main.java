import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage window;
    private Scene scene;
    private Button button;
    private ComboBox<String> comboBox;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("ComboBox Demo");
        button = new Button("Submit");

        comboBox = new ComboBox<>();
        comboBox.getItems().addAll(
                "Good Will Hunting",
                "St. Wincent",
                "Blackhat"
        );

        comboBox.setPromptText("What is your favourite movie? ");

        //User is able to enter title of his favourite movie from keyboard
        comboBox.setEditable(true);

        //comboBoxes generates it's own events. No need to implement listeners
        comboBox.setOnAction(e -> System.out.println("User selected: " + comboBox.getValue()));

        button.setOnAction(e -> printMovie());


        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(comboBox, button);

        scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }

    //Print out a movie
    private void printMovie() {
        System.out.println(comboBox.getValue());
    }
}

