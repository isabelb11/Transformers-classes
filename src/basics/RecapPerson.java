package basics;

public class RecapPerson {
	private String phone;
	private String email;
	
	public RecapPerson() {
		super();
		this.phone ="";
		this.email= "";
	}
	
	public RecapPerson(String phone) {
		this();
		this.phone = phone;
		this.email = "";
	}
	
	public RecapPerson(String phone, String email) {
		super();
		this.phone = phone;
		this.email = email;
	}
	
	public void print(String str) {
		System.out.println("person:" + str);
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "this is the toString method from the person";
		
		
	
		
		
		
		
		
		
	}

}
