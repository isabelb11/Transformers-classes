package basics;

import java.util.ArrayList;

public class Student2 {
	
	private String firstName;

	static int count = 0;

	int id;

	static ArrayList<Student2> allStudents = new ArrayList<Student2>();

	private Student2() {
		super();
		this.firstName = "";

		count++;
		id = 1000 + count;
	}

	private Student2(String firstName) {
		this();
		this.firstName = firstName;
	}

	public static Student2 addStu(String firstName) {
		Student2 obj = new Student2(firstName);
		allStudents.add(obj);
		return obj;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return id + " " + firstName + " " + count;
	}

}
