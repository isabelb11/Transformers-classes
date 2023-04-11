package basics;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		
		 // Random - generate a random value
        // goal: to learn how to generate a number within a given range



       Random r = new Random();



       // you are give a range
        // you are given n, which is the number of random odd values that is requested
        // of you



       // 10 - 100
        // n = 20



       int start = 10;
        int end = 100;
        int expectedAmount = 20;
        int count = 0;



       while (count < expectedAmount) {
            int rand = r.nextInt(end - start + 1) + start;
            if (rand % 2 != 0) {
                // odd
                System.out.println((count + 1 ) + "." + rand);
                count++;
            }
        }



       System.out.println();
       
       
		
		
		

	}

}
