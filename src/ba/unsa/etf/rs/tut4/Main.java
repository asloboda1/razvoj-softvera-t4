package ba.unsa.etf.rs.tut4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;

public class Main extends Application{
    public static void main(String[] args){
        System.out.println("Sretan rad na tutorijalu 4 !");
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception{
        Parent Root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        stage.setTitle("TUT 4");
        stage.setScene(new Scene(Root));
        stage.show();
    }
}