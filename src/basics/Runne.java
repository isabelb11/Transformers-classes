package basics;

public class Runne {
	 public static void main(String[] args) {
	BankAccount user1 = new BankAccount();
    System.out.println(user1.balance);
    BankAccount user2 = new BankAccount("Anna", "Davidson", 
            "2021231212", "anna.e@gmail.com", "A123654789", 599.84);
    System.out.println(user2.email);
    user2.deposit(50);
    user2.withdraw(500);
    user2.checkBalance();
    user2.deposit(1500);
    user2.withdraw(2000);
    user2.checkBalance();
    
    System.out.println("-------------------------------");
    Bank branch1 = new Bank("Falls Church, VA", "Jack Ma");
    branch1.addCustomer(user2);
    branch1.addCustomer(user2);
    branch1.addCustomer(user2);
    branch1.addCustomer(user2);
    branch1.addCustomer(user2);
    branch1.addCustomer(user2);
    branch1.addCustomer(user2);
    branch1.addCustomer(user2);
    branch1.addCustomer(user2);
    branch1.addCustomer(user2);
    branch1.addCustomer(user2);
    branch1.addCustomer(user2);
    branch1.addCustomer(user2);
    branch1.addCustomer(user2);
    branch1.addCustomer(user2);
    branch1.addCustomer(user2);
    branch1.addCustomer(user2);
    branch1.addCustomer(user2);
    branch1.addCustomer(user2);
    branch1.addCustomer(user2);
    branch1.addCustomer(user2);
    branch1.addCustomer(user2);
    branch1.addCustomer(user2);
    branch1.addCustomer(user2);
    branch1.addCustomer(user2);
    branch1.addCustomer(user2);
    branch1.addCustomer(user2);
    branch1.addCustomer(user2);
    branch1.addCustomer(user2);
    branch1.addCustomer(user2);
    branch1.addCustomer(user2);
    branch1.addCustomer(user2);
    branch1.addCustomer(user2);
    branch1.addCustomer(user2);
    branch1.addCustomer(user2);
    branch1.addCustomer(user2);
    branch1.printBankInfo();
}
}



	
 
	

