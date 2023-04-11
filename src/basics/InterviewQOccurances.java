package basics;

import java.util.HashMap;
import java.util.Map;

public class InterviewQOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "this is a sample text. "
		+"this sample text is used to count thr number os words";
		
		// count the number of words
		
		System.out.println(str.split(" ").length);

	}
	
	public static Map<String, Integer> countWords(String str) {
		
 Map<String, Integer> res = new HashMap<String, Integer> ();
 	String temp = str.replaceAll(" ", "");
 	res.put(" ", str.length() - temp.length());
    for(String w: str.split("")) {
	if(res.containsKey(w)) {
		 res.put(w, res.get(w) + 1);
	 } else {
		 res.put(w,1);
			 
		 }
	 }
  return res;
 }
	 
 } 

