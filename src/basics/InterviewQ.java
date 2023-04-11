package basics;

import java.util.Stack;

public class InterviewQ {

	public static void main(String[] args) {
		
		 String value = "(((((<><>)))))";
	        
	        System.out.println(isBalanced(value));
	        
	        
	    }
	    
	    
	    public static boolean isBalanced(String str) {
	        Stack<Character> temp = new Stack<Character>();
	        
	        for (char c : str.toCharArray()) {
	            if(c == '(') {
	                temp.add(c);
	                System.out.println(temp);
	            } else if (c == ')'){
	                if(temp.pop() == '(') {
	                    System.out.println("pop");
	                }
	            }
	            if(c == '<') {
	                temp.add(c);
	                System.out.println(temp);
	            } else if (c == '>'){
	                if(temp.pop() == '<') {
	                    System.out.println("pop");
	                }
	            }
	            
	        }
	        
	        
	        System.out.println(temp);
	        return !(temp.size() >0);
	    }
		
	}
		


