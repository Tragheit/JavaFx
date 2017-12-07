import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Stage window;

        window = primaryStage;
        window.setTitle("Main window");

        //special layout for arrange items in a grid
        GridPane grid = new GridPane();

        /* Insets - object which stores the amount of padding for each edge
           adds 10 pixels padding around window */
        grid.setPadding(new Insets(50, 50, 50, 50));

        //sets the vertical spacing or the padding of vertically lines
        grid.setVgap(8);
        //sets the horizontal spacing or the padding of vertically lines
        grid.setHgap(10);

        //Name label
        Label nameLabel = new Label("Username");

        //adding items to the grid cells
        GridPane.setConstraints(nameLabel, 0, 0);

        //Name input
        TextField nameInput = new TextField("default login");
        GridPane.setConstraints(nameInput, 1, 0);

        //Password Label
        Label passLabel = new Label("Password");
        GridPane.setConstraints(passLabel, 0, 1);

        //Password Input
        TextField passInput = new TextField();
        //light grayed out text inside textfield
        passInput.setPromptText("password");
        GridPane.setConstraints(passInput, 1, 1);

        Button loginButton = new Button("Login");
        GridPane.setConstraints(loginButton, 1, 2);

        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton);

        Scene scene = new Scene(grid, 350, 200);
        window.setScene(scene);

        window.show();

    }
}

