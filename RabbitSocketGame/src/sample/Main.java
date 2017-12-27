package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Отображение окна для входа
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //primaryStage.setTitle("Hello ");
        //primaryStage.setScene(new Scene(root, 300, 190));
        //primaryStage.show();

        //Отображение игры
        Parent root1 = FXMLLoader.load(getClass().getResource("Field.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root1, 600, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        Player player1 = new Player("A");
        Player player2 = new Player( "B");
        Controller.randomRabbit();


        launch(args);
    }
}
