package basics;

public class stringMnipulation2 {

	public static void main(String[] args) {
		
		String str =  "jaCK";
		System.out.println("input str = " + str);
		String firstChar = "" +str.charAt(0);
	    firstChar = firstChar.toUpperCase();
		System.out.println(firstChar);
		String remainingChars = str.substring(1);
		remainingChars = remainingChars.toLowerCase();
		System.out.println(remainingChars);
		System.out.println("str in propper = "+ firstChar + remainingChars);
		//////
		
		
		
		
	
				
		
		
		 

	}

}
