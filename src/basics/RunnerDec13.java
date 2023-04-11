package basics;

public class RunnerDec13 {
	public static void main(String[] args) {
		
		Employee obj1 = new Employee("Admin", 132, "Jack", "Ma", "jack@gmail.com", "Male", 35);
		Instructor obj2 = new Instructor("Anna", "Davidson", "anna@gmail.com", "Female", 30);
		Student13 obj3 = new Student13("David", "Jackson", "david@gmail.com", "Male", 28, 3.8, "CS");
		
		
		obj2.addSubject("Java");
		obj2.addSubject("C++");
		obj2.addSubject("C#");
		obj2.addSubject("JS");
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		
		
	}
	}

	
		


