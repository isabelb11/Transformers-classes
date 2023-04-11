package basics;

import java.util.Scanner;

public class Week2Recap {

	public static void main(String[] args) {
		
		String str = "this is test";
		int a = 10;
		int b = 5;
		System.out.println(a + "" + b);
		
		String str2 = "" + (a+b);
		System.out.println(str2);
		
		String firstName = "jack";
		String lastName = "Davidson";
		if(firstName.length() > lastName.length()) {
		}else {
			System.out.println("last name is longer");
			
			} 
		//// 
		
		Scanner sc = new Scanner(System.in);
		String firstInput = sc.nextLine ();
		System.out.println(firstInput);
		String secondInput = sc.nextLine ();
		if(firstInput.length()> secondInput.length()) {
			System.out.println("first input is longer");
		} else {
	
		
		System.out.println("second input is longer");
		
		}
		
			
		
		
		

	}

}
