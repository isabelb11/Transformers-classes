package basics;

public class StringReview {

	public static void main(String[] args) {
		// String literal
		// look for variable in String static pool 
		String city = "tyson";
		String city2 = "tyson";
		
		// String reference 
		// reference of this object will create in heap memory
		String town = new String("tyson");
		city2 = "Alexandria";
		
		boolean isCityEqual = city == city2;
		System.out.println(isCityEqual);
		
		boolean isCityEqualTown = town == city2;
		System.out.println(isCityEqualTown);
	
		
		//String methods
		String text = "HereInTekSchoolWeLearnJava";
		int Length = text.length();
		System.out.println("Lenght is " + Length);
		char onIndex2 = text.charAt(2);
		System.out.println(onIndex2);
		
		char lastCharacter = text.charAt(Length - 1);
	
		System.out.println(lastCharacter);
		
		// STRING CONCATINATION 
		// 1 concatination with +
		
		String firstName = " John ";
		String lastName = " Smith ";
		String fullName = firstName + "" + lastName;
		System.out.println(fullName);
		String fullNameWithConcat = firstName.concat(lastName);
		String fullNameWithSpace = firstName.concat(" ").concat(lastName);
		System.out.println(fullNameWithSpace);
		
		String someText = "result"  + (2 + 3);
		System.out.println(someText);
		
		// SUB STRING IN STRING 
		// some
		// thing 
		// substring
		
		String text1 = "something";
		
		String some = text1.substring(0,4);
		System.out.println(some);
		
		String thing = text1.substring(4);
		System.out.println(thing);
		//////
		
		
		
		String line = "00111102022500";
	
		String some1 = line.substring(0,3);
		System.out.println(some1);
		String some2 = line.substring(3,11);
		System.out.println(some2);
		String some3 = line.substring(11,14);
		System.out.println(some3);
		
		
		String code = line.substring(0,3);
		String date = line.substring(3,11);
		String amount = line.substring(11,14);
		
		System.out.println(code);
		System.out.println(date);
		System.out.println(amount);
		
		// Homework //
		// research how to convert a string of date to data object 
		//Date someDate = new Date();
		// research how to convert a string number to double data type.
		
		//INDEX OF STRING
		
		//String text3 = "sometext";
		//int index = text3.indexOf('e');
		//System.out.println(index);
		
		String pagination = "1011 - 1020 of 2268";
		//first solution not good option
		String totalCount = pagination.substring(pagination.length() - 4);
		// second solution find index of a character that never change 
		int index = pagination.indexOf("of");
		//String totalCount = pagination.substring(index+2);
		String totalCountAfterTrim = totalCount.trim();
		
		
		System.out.println(index);
		
		/////
		// CONTROLS STATEMENT
		
		String password = "this is";
		int Lenght = password.length();
		if (Length >=8) {
			System.out.println("Pass");
		} else {
			System.out.println("fail");
			
		}
		
		
		String gender = "Male";
		if (gender.equals("male")) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
			
			
			int age = 68;
			if (age > 16 && age < 65) {
				System.out.println("eligiable for driver license");
			}else if (age > 65) {
				System.out.println("not eligiable too old");
			}else {
				System.out.println("not eliable");
			}
		}
		
		
				
		
		
		
		

				
		
		
		
		

	}

}
