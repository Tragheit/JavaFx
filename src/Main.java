import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage window;
    private Scene scene;
    private Button button;
    private ListView<String> listView;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("ComboBox Demo");
        button = new Button("Submit");


        listView = new ListView<>();
        listView.getItems().addAll("Iron Man", "Titanic", "Contact", "Surrogates");

        //Decide whether one or multiple selection are allowed
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        button.setOnAction(e -> buttonClicked());



        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(listView, button);

        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    //Print out movies
    private void buttonClicked(){
        String message = "";
        //all Lists in JavaFX are ObservableLists <- main class
        ObservableList<String> movies;
        movies = listView.getSelectionModel().getSelectedItems();

        for (String m: movies) {
            message += m + "\n";
        }

        System.out.println(message);
    }
}

