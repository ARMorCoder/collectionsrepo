package application;
	
import java.util.ArrayList;

import application.controller.CoursesController;
import application.model.Assignment;
import application.model.Courses;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader();
			
			/*Whats happening here is that the Resource starts in Main.java. In order to get changes within Courses.fxml,
			 * you will need to backtrack into the src folder, then direct it into application/view to get Courses.fxml
			 * 
			 * For the timer and break pages
			 * Timer: (TimerController.class.getResource("../../application/view/<Name>.fxml"));
			 * Break: (BreakController.class.getResource("../../application/view/<Name>.fxml"));
			 */
			loader.setLocation(Main.class.getResource("../application/view/Courses.fxml"));
			AnchorPane root = (AnchorPane)loader.load();				
			Scene scene = new Scene(root, 800, 800);// pane you are GOING TO show
			Stage stage = new Stage();
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setTitle("Courses Page");//sets page title
			
			//Used for demo only. But best to make a null Courses variable to pass through on start up first time, since 
			//a Course array will be needed for returning to the Course page with all Course info
	    	ArrayList<Assignment> a = new ArrayList<Assignment>();//delete
	    	ArrayList<Courses> courses = new ArrayList<Courses>();
	    	Courses u = new Courses("Application Programming", a);//delete
	    	courses.add(u);
			
	    	//Used to set up page, will not be used in final for Main.java, just for demo
			CoursesController c = loader.getController();
			c.startUpPage(courses);
			
			
			stage.setScene(scene);
			stage.show();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
