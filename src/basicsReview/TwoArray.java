package basicsReview;

public class TwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //int [] [] excel = new int[row][cool];
		int [][] excel = {
				{10,20,33,40},
				{25,11,30,44},
				{33,36,37,39}
				
		};
		System.out.println(excel[1][2]);
		
		for(int row = 0; row < excel.length; row++) {
			for(int col = 0; col < excel[row].length; col ++) {
				
				System.out.print(excel[row][col] + " ");
				
				
			}
			System.out.println();	
			
		}
		}
	}


