package basics;

import java.util.ArrayList;

public class Student_1_04 extends Person_1_4 {
	
	private String firstName;

	public Student_1_04() {
		super();
		this.firstName = "";
	}

	public Student_1_04(String firstName) {
		super();
		this.firstName = firstName;
	}

	public Student_1_04(String firstName, String phone) {
		super(phone);
		this.firstName = firstName;
	}

	@Override
	public void print(String str) {
		System.out.println("Student: " + str);
	}

	public static void sum(int a, int b) {
		System.out.println(a + b);
	}

	public static int sum2(int a, int b) {
		System.out.println(a + b);
		return a + b;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public static void main(String[] args) {
		sum(10, 10);
		int x = sum2(10, 10);

		Person_1_4 obj = new Person_1_4("021231465");
		Student_1_04 obj2 = new Student_1_04("021231465");

		obj.print("test");
		obj2.print("test");

		ArrayList<Integer> nums = new ArrayList<Integer>();

		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		nums.add(7);
		nums.add(8);
		nums.add(9);
		nums.add(10);
		nums.add(11);
		
		
		
		
		
	}
	

}
