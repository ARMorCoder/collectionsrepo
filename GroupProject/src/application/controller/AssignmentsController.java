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

public class AssignmentsController {
	
	
    @FXML
    private TextArea assignmentArea;
    @FXML
    private Button courses_btn;
    
    ArrayList<Courses> t;//Global variable used for assigning arraylist
    Courses m;
    
    public void startUpPage(ArrayList<Courses> c, int i) {
    	t = c;//
    	m = t.get(i);
    	for(Assignment a : m.getAssignments()) {
    		assignmentArea.appendText(a.getName() + " due at " + a.getDate() + "\n");
    	}
    	
    }

    @FXML
    void toCourses(ActionEvent event) {
    	try {
			FXMLLoader loader = new FXMLLoader();
			/*Same as Course's resources, but now we're in AssignmentsController. Same as before, we back up two folders,
			 * from application/controller, to get to source, then we direct it to application/view
			 * to get Courses.fxml
			 */
			loader.setLocation(AssignmentsController.class.getResource("../../application/view/Courses.fxml"));
			AnchorPane root = (AnchorPane)loader.load();				
			Scene scene = new Scene(root, 800, 800);// pane you are GOING TO show
			Stage stage = new Stage();
			scene.getStylesheets().add(getClass().getResource("../../application/application.css").toExternalForm());
			stage.setTitle("Courses Page");//sets page title
			
	    	//Used to set up page
			CoursesController ac = loader.getController();
			ac.startUpPage(t);
			
			stage.setScene(scene);
			stage.show();
			this.closePage(event);
		}catch(Exception e) {
			e.printStackTrace();
		}
    	
    	
    }
    private void closePage(ActionEvent event) throws Exception {
		Object source = event.getSource();
		if(source == courses_btn) {//if action came from log_btn
			Stage stage  = (Stage) courses_btn.getScene().getWindow();
			stage.close();
		}else {
			throw new Exception("Cannot find source\n");
		}
    	
    }

}
