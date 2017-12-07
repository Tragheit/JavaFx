import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage window;
    private Scene scene;
    TreeView<String> tree;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("ComboBox Demo");

        TreeItem<String> root, bucky, megan;

        //Root
        root = new TreeItem<>();
        //expended by default
        root.setExpanded(true);

        //Bucky
        bucky = makeBranch("Bucky", root);
        makeBranch("thenewboston", bucky);
        makeBranch("YouTube", bucky);
        makeBranch("Chicken", bucky);

        //Megan
        megan = makeBranch("Megan", root);
        makeBranch("Glitter", megan);
        makeBranch("Makeup", megan);

        //Create tree
        //root - main branch
        tree = new TreeView<>(root);

        //to keep root expanded (our root is only container for branches.
        // Does not contain anythink by itself
        tree.setShowRoot(false);

        //listener needed to react on selection
        tree.getSelectionModel().selectedItemProperty().addListener((v, onldValue, newValue) -> {
            if(newValue != null){
                System.out.println(newValue.getValue());
            }
        });

        //Layout
        StackPane layout= new StackPane();
        layout.getChildren().add(tree);
        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }
//create branches
    private TreeItem<String> makeBranch (String title ,TreeItem<String> parent) {
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);

        return item;
    }
}

