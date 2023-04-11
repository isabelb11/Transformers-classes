package basics;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str = "test";
		
		String str2= "test";
		
		String str3 = new String ("test");
		
		System.out.println("using method equals " + str.equals(str3));
		
		//length
		System.out.println(str.length());
		
		//concat
		System.out.println(str.concat(" this is the test we added"));
		
		// substring 
		
		String newStr = str.substring(4);
		System.out.println(newStr);
		
		String java = "java is fun!"; 
		
		System.out.println(java.charAt(java.length() - 1));
		
		// develop an app that makes first name and last name and 
		// suggests email add 
		String firstName = "JACK";
		String lastName = "mA";
		String email = firstName + "." + lastName + "@gmail.com";
		//String email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@";
		
		System.out.println(email.toLowerCase());
				
		

	}

}
