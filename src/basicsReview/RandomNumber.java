package basicsReview;

import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		
		// random number
        int random = (int) (Math.random() * 50);
        int guess = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Guess a number ???");
            guess = scanner.nextInt();
            if (guess < random) {
                System.err.println("go higher");
            } else if (guess > random) {
                System.err.println("go lower");
            }
        } while (guess != random);
        scanner.close();
        System.out.println("Well done number was " + random);
    }

	}


