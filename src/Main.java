import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
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



        //          file menu
        //underline before menuitem name means that user can use shortcut alt _ first letter to open it
        Menu fileMenu = new Menu("_File");

        //Menu items
        MenuItem newMi= new MenuItem("New...");
        newMi.setOnAction(e -> System.out.println("Create new Project"));

        MenuItem openMi = new MenuItem("Open...");
        openMi.setOnAction(e -> System.out.println("Open existing project"));

        MenuItem saveMi = new MenuItem("Save...");
        saveMi.setOnAction(e -> System.out.println("Save project"));

        //horizontal line -> separator
        fileMenu.getItems().add(new SeparatorMenuItem());

        MenuItem settingsMi = new MenuItem("Settings...");
        settingsMi.setOnAction(e -> System.out.println("Open Settings"));

        //horizontal line -> separator
        fileMenu.getItems().add(new SeparatorMenuItem());

        MenuItem exitMi = new MenuItem("Exit...");
        exitMi.setOnAction(e -> System.out.println("Close Project"));

        fileMenu.getItems().addAll(newMi, openMi, saveMi, settingsMi, exitMi);



        //          edit menu
        Menu editMenu = new Menu("_Edit...");

        MenuItem cutMi = new MenuItem("Cut...");
        cutMi.setOnAction(e -> System.out.println("Cut"));

        MenuItem copyMi = new MenuItem("Copy...");
        copyMi.setOnAction(e -> System.out.println("Copy"));

        MenuItem pasteMi = new MenuItem("Paste");
        pasteMi.setOnAction(e -> System.out.println("Paste"));
        //To disable option -  will be grayed out
        pasteMi.setDisable(true);

        editMenu.getItems().addAll(cutMi, copyMi, pasteMi);


        //Main menu bar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu, editMenu);


        layout = new BorderPane();
        layout.setTop(menuBar);

        scene = new Scene(layout, 400, 300);
        window.setScene(scene);
        window.show();
    }
}

