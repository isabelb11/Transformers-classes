package basics;

public class Runner {

	public static void main(String[] args) {
		String str = new String("test");

        Student stu = new Student();
        stu.firstname = "jack";
        stu.lastName = "ma";
        stu.age = 48;

        Student st2 = new Student("David", "Jackson", 25);

        
        System.out.println(st2.firstname);
        System.out.println("-----------------------------------");
        System.out.println(stu.firstname.length());
        System.out.println(stu.lastName);
        System.out.println(stu.age);

        System.out.println("-----------------------------------");
        stu.printStudInfo();
        st2.printStudInfo();
    }
	}
		
		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
		
	


