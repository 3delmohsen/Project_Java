package programe;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.event.ActionEvent;
import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Controller{
    @FXML
    private TextField user;
    @FXML
    private PasswordField pass;

    private boolean f=false;
    public static String user_name;
    @FXML
    public void loginA(ActionEvent event)throws IOException {


        File Login =new File("database\\logindata.txt");
        Scanner print;
        try {

            print= new Scanner(Login);
            while (print.hasNextLine()){
                String s= print.nextLine();
                String [] arr=s.split(";",2);

                if(arr[0].equals(user.getText() )&& arr[1].equals(pass.getText())){
                    user_name=arr[0];

                    f=true;
                }
            }
            if (f){

                Parent root= FXMLLoader.load(getClass().getResource("Fxml_files/HomePage.fxml"));
                Scene scene =new Scene(root,675,475);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);


            }else {
                JOptionPane.showMessageDialog(null,"Incorrect username or password.");
            }

        }catch (FileNotFoundException fi){
            System.out.println(fi.getMessage());
        }

    }
    @FXML
    protected void closeA(){
        System.exit(0);
    }
}
