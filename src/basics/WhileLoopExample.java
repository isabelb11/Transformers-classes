package basics;

public class WhileLoopExample {

	public static void main(String[] args) {
		
		
		// while, do-while, for, for-each
		// while (conditions) {}

		int i = 10;
		while (i > 0) {
			System.out.println(i--);
		}
		////
		int [] numbers = { 12, 1, 5, 1, 1, 5, 12, 1, 54, 1, 02, 65, 5, 1, 251, 1212, 56 };
		//System.out.println(numbers.length - 1);
		
		int index = 0;
		while(index < 17) {
			System.out.print(numbers[index++]);
			if (index < 17) {
			System.out.print(",");
			}
		}
			
			System.out.println();
			index = numbers.length -1;
			while (index >=0) {
				System.out.print(numbers[index--] + ", ");
			}
		
		}
	}


