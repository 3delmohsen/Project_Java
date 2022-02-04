package programe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;



public class ControllerAddStudent {
    @FXML
    private TextField NameStudent;
    @FXML
    private TextField IdStudent;
    @FXML
    private TextField YearsStudent;
    @FXML
    private TextField EmailStudent ;
    @FXML
    private TextField CollegeStudent;
    @FXML
    private TextField DepartmentStudent;
    @FXML
    private TextField DegreeStudent;



 public void BackToHome(ActionEvent event)throws IOException {
     Parent root= FXMLLoader.load(getClass().getResource("Fxml_files/HomePage.fxml"));
     Scene scene =new Scene(root,675,475);
     Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
     window.setScene(scene);
 }

 public void AddStudent(ActionEvent event)throws Exception {
     Stu NewStudent= new Stu ();
     NewStudent.setSName (NameStudent.getText ());
     NewStudent.setSID (IdStudent.getText ());
     NewStudent.setSYears (YearsStudent.getText ());
     NewStudent.setSEmail (EmailStudent.getText ());
     NewStudent.setCollege (CollegeStudent.getText ());
     NewStudent.setSDepartment (DepartmentStudent.getText ());
     NewStudent.setDegree (DegreeStudent.getText ());



     Tools.insert ("StudentData.txt",  NewStudent.getSID () +":"
             +NewStudent.getSName () +":"
             +NewStudent.getSYears ()+":"
             +NewStudent.getSEmail ()+":"
             +NewStudent.getCollege ()+":"
             +NewStudent.getSDepartment ()+":"
             +NewStudent.getDegree ()+":");
     JOptionPane.showMessageDialog (null,"Successful addition");
     Parent root = FXMLLoader.load (getClass ().getResource ("Fxml_files/AddStudent.fxml"));
     Scene scene=new Scene (root,601,490);
     Stage window =(Stage) ((Node)event.getSource ()).getScene ().getWindow ();
     window.setScene (scene);



 }

}
