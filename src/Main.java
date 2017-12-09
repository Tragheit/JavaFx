import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage window;
    private Scene scene;
    private BorderPane layout;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Menu Demo");

        //          Layout
        GridPane layout = new GridPane();
        layout.setPadding(new Insets(20, 20, 20, 20));

        layout.setVgap(8);
        layout.setHgap(10);

        //          Items
        Label usernameLabel = new Label("Username");
        //setting inline style only for usernameLabel
        usernameLabel.setStyle("-fx-text-fill: antiquewhite");
        //setting custom id to the label
        usernameLabel.setId("bold-label");

        TextField usernameTextField = new TextField();
        usernameTextField.setPromptText("username");

        Label passwordLabel = new Label("Password");
        //setting inline style only for username
        passwordLabel.setStyle("-fx-text-fill: antiquewhite");
        //setting custom id to the label
        passwordLabel.setId("bold-label");

        TextField passwordTextField = new TextField();
        passwordTextField.setPromptText("password");

        Button loginButton = new Button("Login");
        Button signUpButton = new Button("Sign Up");
        signUpButton.getStyleClass().add("button-blue");

        //changing layout style after click - just experimental
        loginButton.setOnAction(e -> {
            setUserAgentStylesheet(STYLESHEET_CASPIAN);
        });

        GridPane.setConstraints(usernameLabel, 0, 0);
        GridPane.setConstraints(usernameTextField, 1, 0);

        GridPane.setConstraints(passwordLabel, 0, 1);
        GridPane.setConstraints(passwordTextField, 1, 1);
        GridPane.setConstraints(loginButton, 0, 2);

        GridPane.setConstraints(signUpButton, 1, 2);



        layout.getChildren()
                .addAll(usernameLabel, usernameTextField, passwordLabel, passwordTextField, loginButton, signUpButton);


        scene = new Scene(layout, 300, 250);

        //set custom layout (user's) as default for scene
        scene.getStylesheets().addAll("Viper.css");
        window.setScene(scene);
        window.show();
    }
}

