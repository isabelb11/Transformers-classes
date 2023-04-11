package basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExeceptionalHandlingExamples {
	
	public static void main(String[] args) {
		
		// exception is an event that is going to stop the execution of the application
		//it happens when something goes wrong

	    // stack trace - the message that you see in the console

	    // throw is a keyword you can use to can and execute an exeption
       //throw new ArithmeticException("test");

		// checked exception - are exceptions that will require handling

	   // unchecked exceptions - are exceptions with optional handling

		// ArrayIndexOutOfBoundsException
	 //int [] nums = {1,2,3};
	 //System.out.println(nums[3]);

	// NullPointerException
   //String str= null;
    //System.out.println(str.length());

  //to see a checked exception
 //FileInputStream f = new FileInputStream(new File(""));

 // handling exception is having a plan b.
		
		String str = "test";
		int a = 5;
		int b = 2;
//		ArithmeticException
		// try / catch
		try {
			System.out.println(a / b);
			System.out.println(str.length());

		} catch (ArithmeticException e) {
			System.out.println("can not divide by zero");
		} catch (Exception e) {
			System.out.println("something went wrong");
			e.printStackTrace();
//			throw e;
		} finally {
			// finally will be executed regardless of catching any exception
			System.out.println("finally");
		}

		// throws
		readFile1("");
		
		
		try {
			readFile2("1");
		} catch (FileNotFoundException e) {
			System.out.println("did not find the file 1");
		}
		try {
			readFile2("2");
		} catch (FileNotFoundException e) {
			System.out.println("did not find the file 2");
		}
		

		System.out.println("End");
	}

	public static FileInputStream readFile1(String path) {
		FileInputStream f = null;

		try {
			f = new FileInputStream(new File(path));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return f;
	}

	public static FileInputStream readFile2(String path) throws FileNotFoundException {
		FileInputStream f = null;
		
			f = new FileInputStream(new File(path));
	
		
		return f;
	}
	}


