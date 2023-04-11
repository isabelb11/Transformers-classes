package basics;

public class Runner20 {

	public static void main(String[] args) {
		
		// static members are called class-level
				// non-static members are called object-level
				
				// you do not need to have an object of the class to call a static member
				
				// if you change the value of a static member, it changes for the class and all 
				// of the objects at the same time
				
				
				
//				Student obj1 = new Student("Jack");
//				Student obj2 = new Student("David");
//				Student obj3 = new Student("Anna");

				Student2 obj1 = Student2.addStu("Jack");
				Student2 obj2 = Student2.addStu("Anna");
				Student2 obj3 = Student2.addStu("David");
				Student2 obj4 = Student2.addStu("Ahmad");
				
				Student2.addStu("David");
				Student2.addStu("David");
				Student2.addStu("David");
				Student2.addStu("David");
				Student2.addStu("David");
				Student2.addStu("David");
				Student2.addStu("David");
				Student2.addStu("David");
				Student2.addStu("David");
				Student2.addStu("David");
				
				
				for(Student2 s :Student2.allStudents) {
					System.out.println(s);
				}
				
			}
}
			
			
			
			
		