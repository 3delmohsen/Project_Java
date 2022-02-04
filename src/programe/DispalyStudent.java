package programe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;

import java.io.IOException;

public class DispalyStudent {
    @FXML
    private TextField IdStudent;
    @FXML
    private Label namstudent;
    @FXML
    private Label idstudent;
    @FXML
    private Label years;
    @FXML
    private Label email;
    @FXML
    private Label college;
    @FXML
    private Label department;
    @FXML
    private Label degree;

    @FXML
    private TextField IdStudent1;
    @FXML
    private TextField NameStudent;
    @FXML
    private TextField YearsStudent;
    @FXML
    private TextField EmailStudent;
    @FXML
    private TextField CollegeStudent;
    @FXML
    private TextField DepartmentStudent ;
    @FXML
    private TextField DegreeStudent;


    @FXML
    public void BackToHome(ActionEvent event)throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("Fxml_files/HomePage.fxml"));
        Scene scene =new Scene(root,675,475);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
    }






    public static String[]arr;

    public void displaystu() throws Exception {
        try {

            arr = Tools.search ("StudentData.txt", IdStudent.getText ());
            assert arr != null;
            namstudent.setText (arr[1]);
            idstudent.setText (arr[0]);
            years.setText (arr[2]);
            email.setText (arr[3]);
            college.setText (arr[4]);
            department.setText (arr[5]);
            degree.setText (arr[6]);
        }catch (ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog (null," The ID is incorrect ");
        }catch (NullPointerException e){

            JOptionPane.showMessageDialog (null," The ID is incorrect ");
        }

    }
    @FXML
    private void delete(ActionEvent event)throws Exception{
        try {
            if (IdStudent.getText ().equals (arr[0])) {

                Tools.delete ("StudentData.txt", arr[0] + ":" + arr[1] + ":" + arr[2] + ":" + arr[3] + ":" + arr[4] + ":"
                        + arr[5] + ":" + arr[6] + ":");
                Parent root = FXMLLoader.load (getClass ().getResource ("Fxml_files/dispaly_student.fxml"));
                Scene scene = new Scene (root, 604, 514);
                Stage window = (Stage) ((Node) event.getSource ()).getScene ().getWindow ();
                window.setScene (scene);
            }

        }catch (ArrayIndexOutOfBoundsException  e){
            JOptionPane.showMessageDialog (null,"The ID is incorrect");
        }catch (NullPointerException e){

            JOptionPane.showMessageDialog (null," The ID is incorrect ");
        }




    }

    @FXML
    private void update(ActionEvent event) throws Exception{

        try {


            if (IdStudent.getText ().equals (arr[0])) {
                Parent root = FXMLLoader.load (getClass ().getResource ("Fxml_files/update.fxml"));
                Scene scene = new Scene (root, 604, 514);
                Stage window = (Stage) ((Node) event.getSource ()).getScene ().getWindow ();
                window.setScene (scene);
            }
        }catch (ArrayIndexOutOfBoundsException  e){
            JOptionPane.showMessageDialog (null,"The ID is incorrect");
        }catch (NullPointerException e){

            JOptionPane.showMessageDialog (null," The ID is incorrect ");
        }


    }
    @FXML
    private void updatef(ActionEvent event)throws Exception{
        Tools.Update ("StudentData.txt",arr[0]+":"+arr[1]+":"+arr[2]+":"+arr[3]+":"+arr[4]+":"
                        +arr[5]+":"+arr[6]+":",
                IdStudent1.getText ()+":"+NameStudent.getText ()+":"+YearsStudent.getText ()
                        +":"+EmailStudent.getText ()+":"+CollegeStudent.getText ()
                        +":"+DepartmentStudent.getText ()+":"+DegreeStudent.getText ()+":");
        JOptionPane.showMessageDialog (null,"Update succeeded");

        Parent root = FXMLLoader.load (getClass ().getResource ("Fxml_files/dispaly_student.fxml"));
        Scene scene=new Scene (root,604,514);
        Stage window =(Stage) ((Node)event.getSource ()).getScene ().getWindow ();
        window.setScene (scene);
    }

    @FXML
    private void cont(){
        IdStudent1.setText (arr[0]);
        IdStudent1.setText (arr[0]);
        NameStudent.setText (arr[1]);
        YearsStudent.setText (arr[2]);
        EmailStudent.setText (arr[3]);
        CollegeStudent.setText (arr[4]);
        DepartmentStudent.setText (arr[5]);
        DegreeStudent.setText (arr[6]);
    }

}
