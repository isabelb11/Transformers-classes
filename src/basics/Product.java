package basics;

public class Product {
	String name; 
	double price;
	int quantity;
	
	// constructors
	// we use them when creating object of the class
	// these will have to initialize all of the variables of the class
	// default constructor
	public Product() {
		this.name = "";
		this.price = 0;
		this.quantity = 0;
	}
	
	// parameterized constructor
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	// to String method is going to give you a string representation
	public String toString() {
//		(M&M $8.99 8pcs)
		return "("+ name + " $" + price + " " + quantity+"pcs)";
//		return "Product [name: " + name + ", price: " + price + ", quantity: " + quantity+"]";
	}
}


	
		