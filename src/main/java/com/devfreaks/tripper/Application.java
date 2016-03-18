package com.devfreaks.tripper;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {

    public static void main(String... args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        Button button = new Button("Hello");
        button.setOnAction((ActionEvent t) -> {
            System.out.println("aber hallo");
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(button);
        
        Scene scene = new Scene(root, 400, 300);
        
        stage.setTitle("Hello world");
        stage.setScene(scene);
        stage.show();
    }
    
}
