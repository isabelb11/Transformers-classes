package basics;

import java.util.Scanner;

public class ScannerPractice1 {

	public static void main(String[] args) {
		 String userName = "homayoon@tekschool.us";
			String password = "UthoghtIWouldGiveIt123";	 
			 Scanner sc = new Scanner(System.in);
			 System.out.println("please enter your name:");
			 String input = sc.next();
			
			 
			 
			 if (userName.equals(input)) {
			 System.out.println("correct Username");
		 } else {
			 System.out.println("Incorrect Username");
		 }
			 	System.out.println("Enter next user name");
				String username1 = "isabel19@gmail.com";
				String password2 = "12345";	 
				// Scanner sc1 = new Scanner(System.in);
				 System.out.println("please enter your name:");
				 String input4 = sc.next();
				 
				 if (userName.equals(input4)) {
				 System.out.println("correct Username1");
			 } else {
				 System.out.println("correct Username1");
				
				 System.out.println("please enter your grade:");
				 int input5 = sc.nextInt();
				 int grade = 85;
				 if (input5 > grade) {
					 System.out.println("pass");
					
				 }else {
					 System.out.println("fail");
				 }
				 
					
			 }
	}
}

		 

	



