package basics;

public interface MasterCardStandards {
	
	//variables in an interface is always
	// public final static

	String mcCustomerService = "2021231212";
	public final static String mcCustomerService2 = "2021231212";

	// abstract - all methods are by default abstract, so it does not matter if you
	// mention it or not

	public abstract boolean validate();

	public boolean mfa();

	// exceptions
	// static methods
	public static int sum(int a, int b) {
		return a + b;
	}

	// default methods
	public default boolean checkTheCode() {
		return false;
	}
}

	

	

}
