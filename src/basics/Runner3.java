package basics;

public class Runner3 {
	
public static void main(String[] args) {

		
		Product p1= new Product("M&M", 5.99, 8);
		Product p2= new Product("RedBull", 1.89, 12);
		Product p3= new Product("Lays", 1.20, 15);
		Product p4= new Product("Monster", 2.89, 15);
		Product p5= new Product("Coke", .95, 8);
		Product p6= new Product("Chetoose", 3.75, 3);
		Product p7= new Product("Water", 2.0, 5);
		Product p8= new Product("Cracker", 3.1, 2);
		Product p9= new Product("Ice Tea", 2.0, 5);
		Product p10= new Product("Gummies", 2.0, 5);
		Product p11= new Product("KitKat", 5.0, 5);
		Product p12= new Product("Twix", 2.0, 5);
		
		
		VendingMachine machine1 = new VendingMachine("serial12345", 4, 3);
		
		System.out.println(machine1);
		
		machine1.addItem(p1, 0, 0);
		machine1.addItem(p2, 0, 1);
		machine1.addItem(p3, 0, 2);
		
		machine1.addItem(p4, 1, 0);
		machine1.addItem(p5, 1, 1);
		machine1.addItem(p6, 1, 2);
		
		machine1.addItem(p7, 2, 0);
		machine1.addItem(p8, 2, 1);
		machine1.addItem(p9, 2, 2);
		
		machine1.addItem(p10, 3, 0);
		machine1.addItem(p11, 3, 1);
		machine1.addItem(p12, 3, 2);
		
		System.out.println(machine1);
}

}
		

	



