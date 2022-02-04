package programe;

import com.sun.javafx.css.ParsedValueImpl;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Fxml_files/Login.fxml"));
        Scene Scene1 =new Scene(root, 340, 397);
        primaryStage.setScene(Scene1);
        primaryStage.show();
        primaryStage.setTitle("Dtu Program");
        primaryStage.setResizable(false);
        try {
            Image icon = new Image(getClass().getResourceAsStream("Fxml_files/dtu-logo.png"));
            primaryStage.getIcons().add(icon);
        }catch (IllegalArgumentException e){
            System.out.println("not Found Logo");
        }



    }


    public static void main(String[] args)throws Exception {

        launch(args);

    }
}
