package basics;

public class StaticKeywordPractice { 
	
	

	    // static 
	    // static members will belong to the class and not the objects of he class
	    // static members are called class-level and other members are called object-level

	    // staqtic call => name-of-the-class.name-of-the-member
	    // Math.max() in this case, Math is the class name and max() is a static method in that class
	    // so you do not have to create an object of the class to call static members of the class
	    // you call the name of the class and the name of the member in that class

	    // final vs static vs private
	    // final - you can not change the value of the variable after initializing it

	    // static - the variables belongs to the class and not to the objects, so it is the same value
	    // for the class and all of the objects of the class. it can change, but if you change it in one place
	    // it will change for all

	    // private - is going limit the scope you can access the variable. private members are 
	    // only accissble inside the class
		public static void main(String[] args) {
	        int x = 10;
	        int y = 15;

	        System.out.println(Math.max(x, y));

	        String str1 = "this is a test";
	        String str2 = "testing";
	        String str3 = "this";

	        System.out.println(str1.length());
	        System.out.println(str2.length());
	        System.out.println(str3.length());

	        Customer obj1 = new Customer("Jack", "lastname", "jack@gmail.com");
	        Customer obj2 = new Customer("David", "lastname", "jack@gmail.com");
	        Customer obj3 = new Customer("Anna", "lastname", "jack@gmail.com");



	        System.out.println(obj1);
	        System.out.println(obj2);
	        System.out.println(obj3);


	        System.out.println(Math.PI);
	        System.out.println(Math.E);
	        System.out.println(Integer.MAX_VALUE);


	        System.out.println("Customer.count " + Customer.count); // static call
//	        System.out.println("obj1.x " + obj1.count);
//	        System.out.println("obj2.x " + obj2.count);
//	        System.out.println("obj3.x " + obj3.count);

	        System.out.println("-------------------------------------------------");
	        System.out.println(Math.pow(10, 3));
	        
	     // create the function pow
			// 12^3
			// 12 * 12 * 12

			System.out.println(pow(10, 3));

		}

		// 3, 2
		public static int pow(int num, int pow) {
			int res = 1;

			for (int i = 0; i < pow; i++) {
				res *= num;
			}
			return res;
		}

		public static void takeScreenShot() {
			System.out.println("Taken Screen Shot");
		}

		public static void readFile() {
			System.out.println("File read");
	    }
	}

	