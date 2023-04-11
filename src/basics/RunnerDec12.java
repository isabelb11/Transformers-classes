package basics;

public class RunnerDec12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Product obj1 = new Product();
//		
//		System.out.println(obj1.getName());
//		obj1.setName("new name");;
//		System.out.println(obj1.getName());

		
		BankAccount2 user1 = new BankAccount2("Jack", "Ma", 35, "acc1234", 5999.85);
		
		System.out.println(user1.getFirstName());
		
		user1.setFirstName("new name");
		
		System.out.println(user1.getFirstName());
		

	}

}
