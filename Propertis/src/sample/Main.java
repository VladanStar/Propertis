package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Vladan Cupric JavaFX");

        Person vladan = new Person();
        vladan.firstNameProperty().addListener((v,oldValue, newValue) -> {
            System.out.println("Name change to " + newValue);
            System.out.println("firstNameProperty() "+ vladan.firstNameProperty());
            System.out.println("getFirstName() " + vladan.getFirstName());
        });

        Button button = new Button("Submit");
        button.setOnAction(e->vladan.setFirstName("Cupric"));
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 400, 400);
        window.setScene(scene);
        window.show();
    }
}
