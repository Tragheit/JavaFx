import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
/* implements EventHabdler<ActionHandler> used only when
    used only when handle() is located in the same class
    this solution sgould not be used!
 */
    //first button
    Button button;

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //setting the name of Stage
        //Stage is just blank window
        primaryStage.setTitle("Title of the Window");

        //creating layout
        //Layout is the way the elements are arranged
        StackPane layout = new StackPane();

        //creating scene
        //Scene is the content of the window (buttons, text fields etc.)
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);

        //display of Stage to the user
        primaryStage.show();

        //using our first button
        button = new Button();

        //setting text on button
        button.setText("Click me");

        //when action occurs invoke method from implicit parameters
        button.setOnAction(e -> System.out.println("Oooo i love when u touch me there...."));

        /* this solution uses lambda expressions, it is recommendded solution.
           We are creating eventHabdler in the run, without the need for implementing handle() menthod
         */

        //adding our first button to the main screen
        layout.getChildren().add(button);

    }

    /*
    This solution requires a lot of additional code

    @Override
    public void handle(ActionEvent event) {
        if(event.getSource() == button) {
            System.out.println("Oooo i love when u touch me there....");
        }
    }

    */
}

