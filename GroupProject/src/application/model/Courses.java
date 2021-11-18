package application.model;

import java.util.ArrayList;

public class Courses {
	private String name;
	private ArrayList<Assignment> assignments = new ArrayList<Assignment>();
	
	public Courses(String name, ArrayList<Assignment> a) {
		this.name = name;
		this.assignments = a;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Assignment> getAssignments() {
		return assignments;
	}
	public void setAssignments(ArrayList<Assignment> assignments) {
		this.assignments = assignments;
	}


}
