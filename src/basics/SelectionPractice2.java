package basics;

public class SelectionPractice2 {

	public static void main(String[] args) {
		double age = 15;
		boolean insurance = true;
		double cost = 10589.95;
		double payOutPocket = 0;
		double finalBalance = 0;
		
		// check conditions below
				// if the age is in range of 35-50 and the patient 
				// has insurance, the payOutOfPocket should be 10% of the total cost. 
				
				// if the age is in than range but the patient does not 
				// have insurance, the payOutOfPocket should be 85% of the total cost. 
				
				// if the age is in the range of 18-25 and the patient has 
				// insurance then, the payOutOfPocket should be 35% of the total cost. 
				
				// if the age is in the range of 18-25 and the patient has no 
				// insurance then, the payOutOfPocket should be 95% of the total cost. 
				
				// any other condition, patient should pay the full price
				
				// Print a descriptive text to show the patient information and balance

				// auto format the code shortcut in windows => ctrl + shift + f
				// auto format the code shortcut in mac => command + shift + f
				
		// solution 
		if(age >=35 && age <= 50 && insurance == true) {
			// age 35-50 and insurance == true
			// pop = 10% of the cost
			payOutPocket = cost * 0.1;
		} else if (age >=35 && age <= 50 && insurance == false) {
			// age 35-50 and insurance == false 
			// pop = 85% of the cost
			payOutPocket = cost * 0.85; // 85/100*cost
		} else if (age >=18 && age <= 25 && insurance == true) {
			// age 18-25 and insurance == true
			// pop = 35% of the cost
			payOutPocket = cost * 0.35;
		}else if (age >=18 && age <= 25 && insurance == false) {
			// age 18-25 and insurance == false
			// pop = 95% of the cost
			payOutPocket = cost * 0.95;
		} else {
			// else pop = 100% of the cost
			payOutPocket = cost;
		}
		
		finalBalance = payOutPocket;
		
		System.out.println("Patient Financial Status Report");
		
		System.out.println("Age: " + age + " Insurance: " + insurance);
		System.out.println("Total Cost: $" + cost);
		System.out.println("Discounted Amount: $" + (cost - payOutPocket));
		System.out.println("Patient Pay Out of Pocket: $" + payOutPocket);
		System.out.println("Final Balance: $" + finalBalance);
			
			
		}
           

	}


