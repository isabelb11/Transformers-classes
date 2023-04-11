package basicsReview;

public class ForEachLoop {

	public static void main(String[] args) {
		
		String[] countries = {"brazil", "france", "spain", "Argentina"};
		
		for(String each : countries) {
			
		if (each.startsWith("a")) {
			System.out.println(each);
		}
		}

	}

}
