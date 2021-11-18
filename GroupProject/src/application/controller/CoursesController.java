package application.controller;

import java.util.ArrayList;

import application.model.Assignment;
import application.model.Courses;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class CoursesController {
	
	
    @FXML//delete later
    private TextArea courseArea;
    @FXML
    private Button course1_btn;
    
    ArrayList<Courses> t = new ArrayList<Courses>(); 
    
    public void startUpPage(ArrayList<Courses> c) {//used for example only
    	t = c;
    	courseArea.setText(t.get(0).getName());
    }

    @FXML//can be renamed 
    void toAssignments(ActionEvent event) {    	
    	//Used for demo only, Assignments will only be created in Assignment Page
    	ArrayList<Assignment> x = new ArrayList<Assignment>();
    	Assignment a = new Assignment("Assignment 1", "01/21/22");
    	Assignment a2 = new Assignment("Assignment 2", "01/21/22");
    	x.add(a);
    	x.add(a2);
    	t.get(0).setAssignments(x);
    	try {
			FXMLLoader loader = new FXMLLoader();
			/*Same as Main's resources, but now we're in CoursesController. This time, we back up two folders,
			 * from application/controller, to get to source, then we direct it to application/view
			 * to get Assignments.fxml
			 */
			loader.setLocation(CoursesController.class.getResource("../../application/view/Assignments.fxml"));
			AnchorPane root = (AnchorPane)loader.load();				
			Scene scene = new Scene(root, 800, 800);// pane you are GOING TO show
			Stage stage = new Stage();
			scene.getStylesheets().add(getClass().getResource("../../application/application.css").toExternalForm());
			stage.setTitle("Assignments Page");//sets page title
			
	    	//Used to set up page
			AssignmentsController ac = loader.getController();
			ac.startUpPage(t, 0);
			
			stage.setScene(scene);
			stage.show();
			this.closePage(event);
		}catch(Exception e) {
			e.printStackTrace();
		}
    	
    }
    //This is used for closing pages. 
    private void closePage(ActionEvent event) throws Exception {
		Object source = event.getSource();
		if(source == course1_btn) {//if action came from course1_btn (name can be changed later)
			Stage stage  = (Stage) course1_btn.getScene().getWindow();
			stage.close();
		}else {//if source of event is not found
			throw new Exception("Cannot find source\n");
		}
    	
    }

}
