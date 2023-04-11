package basics;

public class Person_1_4 {
	
	
	private String phone;
	private String email;

	public Person_1_4() {
		super();
		this.phone = "";
		this.email = "";
	}
	
	public Person_1_4(String phone) {
		this();
		this.phone = phone;
//		this.email = "";
	}

	public Person_1_4(String phone, String email) {
		super();
		this.phone = phone;
		this.email = email;
	}

	public void print(String str) {
		System.out.println("Person: " + str);
	}

	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return " this is the toString method from the Person";
	}
}
	
	
	