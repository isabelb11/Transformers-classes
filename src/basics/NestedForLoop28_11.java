package basics;

public class NestedForLoop28_11 {

	public static void main(String[] args) {
		
//      int count =0;
//      for(int j = 0; j <5 ; j++) {
//          for(int i = 0; i < 10; i++) {
//              System.out.print(" (j=" + j + " i=" + i + ") ");
//              count++;
//          }
//          System.out.println();
//      }
//      System.out.println(count);

//      int [][] numbers = new int [5][4];
      int[][] numbers = { { 84, 48, 89, 63 }, { 77, 86, 49, 49 }, { 72, 78, 22, 56 }, { 70, 98, 25, 60 },
              { 74, 76, 85, 84 } };

//      84    48    89    63
//      77    86    49    49
//      72    78    22    56
//      70    98    25    60
//      74    76    85    84

      System.out.println("row " + numbers.length);
      System.out.println("col " + numbers[0].length);

      for (int row = 0; row < numbers.length; row++) {
          for (int colm = 0; colm < numbers[row].length; colm++) {
              System.out.print(numbers[row][colm] + " ");
//              System.out.println(row + " " + colm + " = " + numbers[row][colm]);
          }
          System.out.println();
      }

      // create a 2D array of int and assign the following values
      
      
//    44    84    19
//    48    47    38 
//    64    28    99 
//    29    26    72
//    78    86    17
//    46    62    17

    System.out.println("**************************************");
    int[][] nums = { { 44, 84, 19 }, { 48, 47, 38 }, { 64, 28, 99 }, { 29, 26, 72 }, { 78, 86, 17 },
            { 46, 62, 17 } };

    int sum = 0;
    int count = 0;
    double avg = 0;
    for (int r = 0; r < nums.length; r++) {
        for (int c = 0; c < nums[r].length; c++) {
            System.out.print(nums[r][c] + " ");
            sum += nums[r][c];
        }
        count += nums[r].length;
        System.out.println();
    }

    System.out.println("sum: " + sum);
    System.out.println("count: " + count);
    System.out.println("avg: " + ((double) sum / count));
    // loop through and print the values in the same format
    
 // optional:
    // find the sum of all of the values in the array
    // find the average of all of the values in the array

    System.out.println("******************************");
    // Q1
    // create an int with name n and assign the value 1;
    // write loop that runs for 3 times
    // in each iteration of that, write a loop that runs for 4 times
    // on every iteration of the inner loop, print n++ and one space on the same
    // line
    // go to the next line after each cycle of the inner loop

    int n = 1;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 4; j++) {
            if (n < 10) {
                System.out.print("0");
            }
            System.out.print(n++ + "\t");
        }
        System.out.println();
    }

    System.out.println("**********************");
    // Q2
    // write a loop that runs for 5 times
    // in each iteration of that, write another loop that runs 3 times
    // in each iteration of that, check to see if the sum of counter of
    // the outer and inner loop is even or odd
    // print your findings accordingly
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 3; j++) {
            if ((i + j) % 2 == 0) {
                System.out.println(i + " + " + j + " = " + (i + j) + " is even");
            } else {
                System.out.println(i + " + " + j + " = " + (i + j) + " is odd");
            }
        }
    }

    // break
    // stop the loop / get out of the loop

    // continue
    // go to the next iteration / do not run the remaining part of this iteration

    System.out.println("---------------------------------");
    for (int i = 0; i < 10; i++) {
        System.out.println(i);
        if (i == 5) {
            System.out.println("break");
            break;
        }
    }

    System.out.println("---------------------------------");
    for (int i = 0; i < 10; i++) {
        if (i == 5) {
            continue;
        }
        System.out.println(i);
    }
    
    System.out.println("---------------------------------");
    x: for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 10; j++) {
            if(i == 2) {
                break x;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
    

}

    
        	
        
        	
        

      
		
		
		
		
		
		
		
		
	}
		
		
	
		
  
		

		
		
		
		
		
		
	
		
		
	

			   
		   
			 
			   
			   
			   
			   
			   
			   
			   
	   

      
	
		

	
		



