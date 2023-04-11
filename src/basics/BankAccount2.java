package basics;

public class BankAccount2  {
	
	private String firstName;
	
	private String lastName;
	
	private int age;
	
	private String accountNumber;
	private double balance;
	
	public BankAccount2() {
		this.firstName = "";
		this.lastName = "";
		this.age = 0;
		this.accountNumber = "";
		this.balance = 0;
	}
	
	public BankAccount2 (String firstName, String lastName, int age, String accountNumber, double balance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
//	String firstName
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastName;
	}

	public void setLastname(String lastname) {
		this.lastName = lastName;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

//	public void setBalance(double balance) {
//		this.balance = balance;
//	}
	
	
	
	
	

	
	
	

}
