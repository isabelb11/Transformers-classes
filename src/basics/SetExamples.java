package basics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class SetExamples {
	public static void main (String[]args) {
		
	//Hashset
    //is un-ordered
	//not sorted
    // it takes unique value
    // is not index based

 HashSet<String>temp = new HashSet<String>();
 
 System.out.println(temp.add("123"));
 System.out.println(temp.add("547"));
 System.out.println(temp.add("984"));
 System.out.println(temp.add("951"));
 System.out.println(temp.add("169"));
 System.out.println(temp.add("1"));
 
 System.out.println(temp);
 
 System.out.println(temp.contains("1"));
 
 for(String  v: temp) {
	 System.out.println(v);
 }
 
 String [] values = {"CA", "VA", "PA", "MD", "ND", "WI", "TX", "CT","MI", "TX", "FL"};

 }
	public static boolean hasDoublecate(String[] input) { 
		for(int i =0; i < input.length; i++) {
			for (int j = i+1; j < input.length; j++) {
				if(input[i].equals(input[j])) {
					// we have a duplicate
					System.out.println(input[i] + " " + j + " " + i);
					return true;
				} else {
					// this iteration is not duplicate
				}
			}
		}
		return false;
				}
			
		
 public static boolean hasDuplicate_withSet(String[] input) {
	 HashSet<String> temp = new HashSet<String>();
	 
	 for(String i: input) {
		 if(temp.add(i)) {
			 System.out.println(i);
			 
			 
			return true;
			
		 }
 }
	
	 
	 return false;
 }
  
 public static Collection<String> hasDuplicate_Multi(String[] input, boolean rep) {
     Collection<String> dup = null;
     if (rep) {
         dup = new ArrayList<String>();
     } else {
         dup = new HashSet<String>();
     }



     HashSet<String> temp = new HashSet<String>();
     for (String i : input) {
         if (!temp.add(i)) {
             dup.add(i);
         }
     }
     return dup;
     
	  
  }
}
		
	
 