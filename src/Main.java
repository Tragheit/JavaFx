import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage window) {
        window.setTitle("Bucky's Meat Subs");

        Scene scene;
        Button button;

        //CheckBoxes
        CheckBox box1 = new CheckBox("Bacon");
        CheckBox box2 = new CheckBox("Tuna");

        //selected by default
        box2.setSelected(true);

        //Buttons
        button = new Button("Order Now");
        button.setOnAction(e -> handleOptions(box1, box2));

        //Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(box1, box2, button);

        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    //Handle checkbox options
    private void handleOptions(CheckBox box1, CheckBox box2) {
        String messaege = "Users order :\n";

        if(box1.isSelected()){
            messaege += "Bacon ";
        }

        if(box2.isSelected()){
            messaege += "Tuna ";
        }

        System.out.println(messaege);
    }
}

