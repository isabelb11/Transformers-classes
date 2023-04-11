package basics;

public abstract class BankAccount4 {

//	abstract code 
	public abstract void printStatement();
	public abstract void validateUserPass();

//	non-abstract code

	private double balance;
	private String firstName;
	private String lastName;

	public BankAccount4() {
		super();
		this.balance = 0;
		this.firstName = "";
		this.lastName = "";
	}
	
	public BankAccount4(double balance, String firstName, String lastName) {
		super();
		this.balance = balance;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
