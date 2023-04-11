package basics;

public class Decem_05_12 {
	public static void main(String[] args) {
		
		// ///data-type identifier = new data-type(args);
		
		Student obj1 = new Student();
        System.out.println(obj1.firstName);
        
        Book b1 = new Book();
        Book b2 = new Book("Harry Potter", 19.99);
        System.out.println(b2.title);
        System.out.println(b2.price);
        Book b3 = new Book("Rich Dad Poor Dad", "Business", 
                "Robert T. Kiyosaki", "1997/01/01", 1.0, "0-446-67745-0",
                29.99, "something", 336);
        
        System.out.println(b3.iSBN);
    
        

	}
	
}




		      
		
	


