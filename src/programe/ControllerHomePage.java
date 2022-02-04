package programe;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;


public class ControllerHomePage {

    @FXML
    public static Label username;
    @FXML
    public void logout(ActionEvent event) throws IOException {

        Parent root= FXMLLoader.load(getClass().getResource("Fxml_files/Login.fxml"));
        Scene scene =new Scene(root,340,397);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        try {
            Image icon = new Image(getClass().getResourceAsStream("Fxml_files/dtu-logo.png"));
           window.getIcons().add(icon);
        }catch (IllegalArgumentException e){
            System.out.println("not Found Logo");
        }


    }
    public void AddStu(ActionEvent event)throws IOException{

        Parent root = FXMLLoader.load (getClass ().getResource ("Fxml_files/AddStudent.fxml"));
        Scene scene=new Scene (root,601,490);
        Stage window =(Stage) ((Node)event.getSource ()).getScene ().getWindow ();
        window.setScene (scene);

    }
    public void disstu(ActionEvent event) throws IOException{

        Parent root = FXMLLoader.load (getClass ().getResource ("Fxml_files/dispaly_student.fxml"));
        Scene scene=new Scene (root,604,514);
        Stage window =(Stage) ((Node)event.getSource ()).getScene ().getWindow ();
        window.setScene (scene);


    }




}
