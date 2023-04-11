package basics;

import java.util.ArrayList;

public class Instructor extends Person{

	private ArrayList<String> subjects;
	
	// constructors
	public Instructor() {
		super();
		subjects = new ArrayList<String>();
	}
	public Instructor(String firstName, String lastName, String email, String gender, int age) {
		super(firstName, lastName, email, gender, age);
		subjects = new ArrayList<String>();
	}
	// getters & setters
	public ArrayList<String> getSubjescts(){
		return subjects;
	}
	
	public void setSubjects(ArrayList<String> subjects) {
		this.subjects = subjects;
	}

	
	// add subject - it should take one string and add it to the list subjects. returns nothing
	public void addSubject(String subject) {
		subjects.add(subject);
	}
	
	
	// toString
	@Override
	public String toString() {
		return "Instructor [" + super.toString() + " - subjects=" + subjects + "]";
	}
}



