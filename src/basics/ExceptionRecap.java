package basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionRecap {

	public static void main(String[] args) {
		
		// when designing a method that has code that may cause a checked exception
				// you have 2 options
				
				// 1 - try/catch in the method
				// you privide a solution the possible checked exception your code may cause
				// in the method. which means that everytime you call the method, it has the same solution
				
				// 2 - throws in the defination of the method
				// with this you identify that this method causes a checked exception to the person who calls 
				// this method. they will have to handle the exception. 
				// it will give them an option to handle it differently everytime they call the method
		
System.out.println(div(10, 0));
		
		try {
			printFile1("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		printFile2("");
	}

	public static int div(int a, int b) {
		int res = 0;
		try {
			res = a / b;
		} catch (ArithmeticException e) {
			System.out.println("can not divide by zero");
		}
		return res;
	}

	public static void printFile1(String path) throws FileNotFoundException {
		FileInputStream temp = null;
		temp = new FileInputStream(new File(path));
		System.out.println(temp.toString());
	}
	
	public static void printFile2(String path) {
		FileInputStream temp = null;
		try {
			temp = new FileInputStream(new File(path));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(temp.toString());
	}

}
			
		
		
		
	

	


