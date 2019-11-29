package sample;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.*;
public class Main extends Application
{
    public static int width=800;
    public static int height=800;
    public static Stage stage;
    @Override
    public void start(Stage primaryStage) throws Exception{
        stage=primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("LoginScreen.fxml"));
        primaryStage.setTitle("Plant vs Zombies");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void changeScene(String file) throws Exception{ // custom made function which helps in changing the scene
        Parent root = FXMLLoader.load(Main.class.getResource(file));
        Main.stage.setScene(new Scene(root));
    }
    public static void main(String[] args) {
        launch(args);
    }
}