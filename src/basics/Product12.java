package basics;

public class Product12 {
	// encapsulation - data hiding 
		// is the idea of making your variables private
		
		// Access Modifiers
		// public, protected, default, private
		
		// public = you can access it in the entire project
		// private = you can only access it within the same class
		
		
		private String name;
		
		public Product12() {
			this.name = "";
		}
		public Product12(String name) {
			this.name = name;
		}
		
		// getters and setters / accessor and mutators
		// these are public methods that are going to return or change a variable
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}

}
