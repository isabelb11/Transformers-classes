package basics;

public class PracticeSelection1 {

	public static void main(String[] args) {
		
		double grade = 59;
		
		// write the code to check this number and print A
				// if the number is more than or equal to 90
				// if the grade is in the following ranges, print letter
				// 90-100 A
				// 80-89 B
				// 70-79 C
				// 60-69 D
				// F

				// {} Braces
				// [] Brackets
				// () Parenthesis
				// <> Angle brackets
		if (grade >= 90) {
			System.out.println("A");
		} else if (grade >= 80) {
			System.out.println("B");
		} else if (grade >= 70) {
			System.out.println("C");
		} else if (grade >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

		if (grade >= 90 && grade <= 100) {
			System.out.println("A");
		} else if (grade >= 80 && grade < 90) {
			System.out.println("B");
		}
		
		System.out.println("---------------");
		
		double amount = 25;
		double shipping = 0;
		
		// write a program that checks to see if the total amount is
				// more than 30. if so, shipping is free
				// if the amount is less than 30
				// shipping is 10
				// once your program is done, print the shipping cost and mount
				if(amount < 30) {
					shipping = 10;
				} else {
					shipping = 0;
				}
				System.out.println("Amount: $" + amount + " Shipping: $" + shipping);
				
				// optional part
				boolean c = true; 
				// if the amount is less than 30 and boolean c is false,
				// then shipping is 5% of the amount plus a 5$ fixed amount
				// if the c is true, the the shipping is just 7% of the amount
				
				if(amount < 30 && c == false) {
					// 5% and 5$
					shipping = (amount * .05) + 5;
				} else if (c == true) {
					shipping = amount * 0.07;
				}
				
				System.out.println("Amount: $" + amount + " Shipping: $" + shipping);
				
				
				
				
				}
			 }
		
			
			
		 	
			
	
	


