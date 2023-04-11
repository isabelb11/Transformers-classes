package basics;

import java.util.ArrayList;

public class  InterviewQFibNum  {

    // create a function that generates n number of fib numbers
    // fib numbers rule - we start with 1, 1, then every next number is the sum of the two previous
    // 1, 1, 2, 3, 5, 8, 13, 21
    

    // create a method that returns an ArrayList of Integer = results
    // the function will take one int as input
    public ArrayList<Integer> fibNumGenerator(int n){
        // i will create an ArrayList of numbers
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
        if(n == 0) {
            return nums;
        } else if (n==1) {
            nums.add(1);
        } else {
            nums.add(1);
            nums.add(1);
        }
        
        // i will loop through for n-2 times
        for (int i = 2; i < n; i++) {
            int x = nums.get(i-1) + nums.get(i-2);
            nums.add(x);
        }
        // n=5 [1,1,2,3,5]
        return nums;
    }
    public static void main(String[] args) {
    	InterviewQFibNum temp = new InterviewQFibNum();
        System.out.println(temp.fibNumGenerator(5));
    }
}