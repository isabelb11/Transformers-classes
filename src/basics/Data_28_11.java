package basics;

public class Data_28_11 {

	public static void main(String[] args) {
		
		
		 int[][] numbers = new int[3][4];



	       int x = 10;



	       numbers[0][0] = 10;
	        numbers[0][1] = 20;
	        numbers[0][2] = 30;
	        numbers[0][3] = 40;



	       numbers[1][0] = 50;
	        numbers[1][1] = 60;
	        numbers[1][2] = 70;
	        numbers[1][3] = 80;



	       numbers[2][0] = 90;
	        numbers[2][1] = 100;
	        numbers[2][2] = 110;
	        numbers[2][3] = 120;



	       int[] nums = { 1, 5, 2, 4, 5, 1, 5, 1, 2, 85, 4, 5 };



	       System.out.println("length " + nums.length);
	        System.out.println(nums[0]);
	        System.out.println(nums[1]);
	        System.out.println(nums[2]);
	        System.out.println(nums[3]);
	        System.out.println(nums[4]);
	        System.out.println(nums[5]);
	        System.out.println(nums[6]);
	        System.out.println(nums[7]);
	        System.out.println(nums[8]);
	        System.out.println(nums[9]);
	        System.out.println(nums[10]);
	        System.out.println(nums[11]);



	       System.out.println("-----------------------------");
	        int index = 0;
	        while (index < nums.length) {
	            System.out.println("i: " + index + ", nums[i]: " + nums[index]);
	            index++;
	        }



//	        for(initialization;conditions;update){ body }
	        System.out.println("*************************************");



	       for (int i = 0; i < nums.length; i++) {
	            System.out.println("i: " + i + ", nums[i]: " + nums[i]);
	        }
		
		

	}

}

