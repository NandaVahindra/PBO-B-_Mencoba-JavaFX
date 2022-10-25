/*
Nama: Made Nanda Wija Vahindra
NRP : 5025211160
*/
package javagui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author ASUS ROG STRIX
 */
public class JavaGUI extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("say 'OOP'");
        btn.setLayoutX(270);
        btn.setLayoutY(100);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Sukses!");
            }
        });
        
        Button btn2 = new Button();
        btn2.setText("Exit");
        btn2.setLayoutX(285);
        btn2.setLayoutY(150);
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });
        
        Group root = new Group();
        root.getChildren().add(btn);
        root.getChildren().add(btn2);        
        Scene scene = new Scene(root, 600, 400, Color.BLACK);
        
        primaryStage.setTitle("TestJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
