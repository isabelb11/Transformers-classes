package basics;

public class MutationExample {

	public static void main(String[] args) {
	
		String x = "test";
		x = "testing";

		System.out.println(x);
		
		System.out.println(x.toUpperCase());
		
	
		
		System.out.println("x "+x);
		// TESING 
		// testing
		
		StringBuilder sb = new StringBuilder("tseting is so fun");
		
		sb.append(" adding this at the end");
		
		System.out.println(sb);
		
		
		
		String user = "user ";
		
		for (int i = 0; i < 10; i++) {
			System.out.println(user + (i+1));
		}
		
		
		
	}


	}


