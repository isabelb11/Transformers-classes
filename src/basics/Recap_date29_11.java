package basics;

public class Recap_date29_11 {

	public static void main(String[] args) {
		// nested loops
        String[][] cars = {
                { "Toyota", "Benz", "BMW", "Chevy" },
                { "SUV", "Van" },
                { "2002", "2022", "1991" } };



//        System.out.println(cars[0].length);
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < cars[row].length; col++) {
                System.out.print(cars[row][col] + " ");
            }
            System.out.println();
        }

        int[] nums = { 15, 8, 1548, 1221, 54, 21, 54, 21 };
        for (int i = 0; i < nums.length; i++) {
            System.out.println("for loop " + nums[i]);
        }



//        foreach - is designed to go through the entire collection
        // for(int num: nums){body}
        int sum = 0;



       for (int num : nums) {
            sum += num;
            System.out.println("foreach " + num + "   sum so far: (" + sum + ")");



       }
        System.out.println(sum);
        
        System.out.println("----------------");
		
        String [] names = {"jack", "david","anna"};
        for (String n : names) {
        	System.out.println(n);
        	
        	
        	System.out.println("----------------");
        	
        	String [] [] vehicles = {
        			{ "toyota","benz", "bmw","chevy"},
        			{ "suv", "van"},
        			{ "2002", "2022", "1991"} };
        	for(String[] row: vehicles) {
        		for(String col:row) {
        			System.out.print(col + " ");
        			
        			
        		}
        		System.out.println();
        	}
        		System.out.println("------------------");
        		
        		 int [][] numbers = {
        	                {2132,131,56,12,15,1},
        	                {15,51,8,5,8,1},
        	                {12,54,8},
        	                {1516,54,5848,45,4}};
        	        
        	        for (int[] row : numbers) {
        	            for (int col : row) {
        	                System.out.print(col + " ");
        	            }
        	            System.out.println();
        	        }
        	        System.out.println("----------------------");
        	        
        	        // lets create an array of String and add some values in it
        	        // create a for loop to go through all of the names and print them
        	        // use for loop, then use foreach
        	        
        		String []  name = {"Blas", "Keskin","Hanner"};
        				
        				for (String na : name) {
        		        	System.out.print(na + " ");
        				
        				System.out.println();
        				
        		}
        				 // Q1
        		        // lets create an array of String and add some values in it
        		        // create a for loop to go through all of the names and print them
        		        // use for loop, then use foreach
        		        String[] names2 = { "name 1", "name 2", "name 3", "name 4" };



        		       // your code here
        		        for (int j = 0; j < names2.length; j++) {
        		            System.out.println(names2[j]);
        		        }
        		        for (String n1 : names2) {
        		            System.out.println(n1);
        		        }



        		   // Q2
        		   // create a 2D array of chars, store some chars in the array
        		   // create a foreach loop that goes through and print the values
        		    char[][] characters = { { 'a', 'b' }, { 'q', 'e' }, { 'p', 'w' } };



        		   // your code
        		    for (char[] row : characters) {
        		     for (char c : row) {
        		      System.out.print(c + " ");
        		            }
        		      System.out.println();
        		        }
        		        }
     // Q3
        // create a string with some values
        // create a for loop that goes through each char and print each char of the
        // string
        // create another loop that does the same thing in reverse order



       // optional: do the same thing with a foreach loop



       String text = "this is a sample string";
        // text.charAt()
        // text.length()
        
        System.out.println("text.charAt(22) "+text.charAt(22));
        System.out.println("text.length() "+text.length());
        
        System.out.println("First loop - going forward");
        
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i) + ", ");
        }
        
        System.out.println();
        System.out.println("Second loop - going backward");
        
        for (int i = text.length()-1; i >=0; i--) {
            System.out.print(text.charAt(i)+ ", ");
        }
        
        System.out.println();
        System.out.println("Going through Chars of String with ForEach");
        
        for (char c: text.toCharArray()) {
            System.out.print(c + ", ");
        }
        System.out.println();
        
	
        
        System.out.println("-----------------------");
        
     // Q4
        // create a a 2D array of int values and assign some values
        // go through the values in rows and cols and sum the values
        // print the sum
        // then sum the odd and even values separately
        // print a message that says which category is larger



       int[][] temp = { { 15, 1568, 15, 23, 5, 21 },
                     { 15, 8, 56, 4, 87, 7, 9 }, 
                     { 95, 84, 7, 23, 6, 4 } };
        int sumAll = 0;
        int sumOdd = 0;
        int sumEven = 0;



       for (int[] row : temp) {
            for (int num : row) {
                if (num % 2 == 0) {
                    sumEven += num;
                } else {
                    sumOdd += num;
                }
                
            }
        }
        sumAll = sumEven + sumOdd;



       System.out.println("sumAll " + sumAll);
        System.out.println("sumEven " + sumEven);
        System.out.println("sumOdd " + sumOdd);
        System.out.println(sumEven > sumOdd ? "Sum Even is larger" : "Sum Odd is Larger");
        		
        
        			
        	}
}

        	
        	
        

	

		











		
		        
	



