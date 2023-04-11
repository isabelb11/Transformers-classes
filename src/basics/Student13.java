package basics;

public class Student13 extends Person {

	private double gpa;
	private String major;

	// constructors
	public Student13() {
		super();
		this.gpa = 0;
		this.major = "";
	}
	

	public Student13(String firstName, String lastName, String email, String gender, int age, double gpa, String major) {
		super(firstName, lastName, email, gender, age);
		this.gpa = gpa;
		this.major = major;
	}


	// getters & setters
	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	// toString
	@Override
	public String toString() {
		return "Student13 [" + super.toString() + " - gpa=" + gpa + ", major=" + major + "]";
	}

}
