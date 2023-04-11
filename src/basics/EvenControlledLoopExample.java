package basics;



import java.util.Random;
import java.util.Scanner;



public class EvenControlledLoopExample {
	
    public static void main(String[] args) {



		// TODO Auto-generated method stub
		
		String password = "pass123";
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the passaword: ");
		String input = sc.next();
		while(input.equals(password) == false) {
			System.out.println("Try again");
			input = sc.next();
			System.out.println("correct");
		}
		System.out.println("correct");
		
		int start = 1;
        int end = 10;
        
        Random r = new Random();
        boolean gussed = false;
        
        
        int randomValue = r.nextInt(end - start + 1 ) + start;
        
        while (gussed == false) {
            System.out.println("Enter a value: ");
            int input1 = sc.nextInt();
            
            if(input1 > randomValue) {
                System.out.println("Go down");
            } else if(input1 < randomValue) {
                System.out.println("Go up");
            } else {
                System.out.println("Correct, the value was " + input1);
                gussed = true;
            }
        }
        
        System.out.println("Thanks for playing, try again!");
        
        
		
		
		
		}
		
		
			
	
			
		
 	}


