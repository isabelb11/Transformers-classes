package basics;

import java.lang.management.GarbageCollectorMXBean;

import javax.xml.transform.sax.SAXSource;

public class StackAndHeapExamples {
	
	public static void main(String[] args) {

		// stack and heap - is the memory structure of java
				// a list of all of the instructions system should perform

				// heap - where the data is being organized and stored

				// the primitive values will be stored in the stack
				// the reference data type objects will be stored in the heap

				// == equality operator - will compare wat you have in the stack
				// == for primitives will compare the values.
				// == for reference will compare the location the variable is stored at
				// .equals() method will compare the values of your object

				// String static pool
				// When you create String with literal values, it will go to the static pool
				// if we have a String with the same value, this variable will refer to that
				// same location
				// if we do not have it, it will create one and refer to it
				// when you use the constructor of the class String, you are bypassing the
				// string static pool and creating a new object, regardless of having the same
				// object
				// in the static pool
				// new String() <<< === constructor of class String

		int x = 10;
		int y = x;
		String s1 = "test";
		String s2 = s1;
		s1 = "testing";

		String s3 = "testing";
		String s4 = "test222";
		String s5 = "test222";
		String s6 = new String("testing");

		System.out.println("s3==s6  " + (s3 == s6));
		System.out.println("s3.equals(s6)  " + (s3.equals(s6)));

		System.out.println("s1==s2  " + (s1 == s2));
		System.out.println("s3==s1  " + (s3 == s1));
		System.out.println("s5==s4  " + (s5 == s4));

		String t1 = "test";
		String t2 = "testing";
		t1 = null;
		t2 = null;
		
		
		// Garbage collection - is the process of removing 
		// the variables that are not being 
		// refered to in the memory
		// java manages that process automatically
		
		// method finalize() is what java calls before removing the variables
		
		
		// clear vs remove vs GC
		// clear and remove methods will clear or remove values in a list
		// GC will remove the values from the memory if no variable refers to them
		
		
		int [] w = new int [5];
		
		String q = "";
		String q1 = null;
		String q2;
		System.out.println(q);
		System.out.println(q1);
//		System.out.println(q2);
		
		System.out.println(w[0]);
		
		
		Integer i = 10;
		int j = 10;
		i.equals(j);
		
		
		
		
		System.out.println("--------------------------------");
		
		
		boolean b1 = false;
		boolean b2 = true;
		boolean b3 = b1 || b2;
		boolean b4 = b3 && b1;
		boolean b5 = b4;
		
		System.out.println(b1 == b4); // rue 
		
		char a = 'A';
		char b = 'a';
		
		System.out.println(a == b);
		
		String s = "a";
		
		System.out.println(a == s.charAt(0));
		
		int i2 = 65;
		
		System.out.println(a == i2);
		
		System.out.println((int)'A' );
		
		
		
	
	}

}
