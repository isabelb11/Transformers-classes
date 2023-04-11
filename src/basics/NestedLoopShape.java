package basics;

public class NestedLoopShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int size = 5;
	        int count = 3;
	        for (int c = 0; c < count; c++) {



	           for (int i = 1; i <= size; i++) {
	                for (int j = i; j < size; j++) {
	                    System.out.print(" ");
	                }



	               for (int j = i; j > 0; j--) {
	                    System.out.print("* ");
	                }
	                System.out.println();
	            }
	            for (int i = size - 1; i > 0; i--) {
	                for (int j = i; j < size; j++) {
	                    System.out.print(" ");
	                }



	               for (int j = i; j > 0; j--) {
	                    System.out.print("* ");
	                }
	                System.out.println();
	            }
	        }
	}
}
	            

	
	        



	  
