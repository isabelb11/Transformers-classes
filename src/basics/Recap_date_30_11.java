package basics;

public class Recap_date_30_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        
		int [][] numbers = {{1,2,5,1,52},{12,1},{154,12,32}};



     System.out.println("---------------");
      
      System.out.println(numbers[0]);
      System.out.println(numbers[1]);
      System.out.println(numbers[2]);
      
      // why we use []
      // why have index name in loop
      System.out.println("---------------");
      for (int[] row : numbers) {
          for(int value: row) {
              System.out.print(value + " ");
          }
          System.out.println();
      }
      
      //String = one object of the class String
      String str = "test";
      //Array of String - 1D array of String - multiple objects of class String    
      String [] str1 = {"test1","test2"};
      //Array of Array of String - 2D array - multiple of 1D array of String
      String [][] str2 = {{"t1"},{"t2","3"}};
      //Array of Array of Array of String - 3D Array of String - multiple of 2D
      String [][][] str3 = {
              {{"t1"},{"t2","3"}},
              {{"t3","5hd"},{"t2","cnvn", "asd"}},
              {{"t47"},{"t2","8563"}}
      };
      System.out.println("***************   ForEach   ***************");
      for (String[][] table : str3) {
          for(String[] row: table) {
              for(String value : row) {
                  System.out.print(value + "\t|\t");
              }
              System.out.println();
          }
          System.out.println("----------");
      }



     System.out.println("***************   For Loop   ***************");
      // [table#][row#][col#]
      for (int table = 0; table < str3.length; table++) {
          for (int row = 0; row < str3[table].length; row++) {
              for (int col = 0; col < str3[table][row].length; col++) {
                  System.out.print(str3[table][row][col] + "\t|\t");
              } // end of the row in each table
              System.out.println();
          } // end of each 2D - table
          System.out.println("----------");
      }
	}

}
