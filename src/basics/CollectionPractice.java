package basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> stu = new HashMap<String, String> ();
		
		stu.put("firstName", "Isabel");
		stu.put("LastName", "Blas");
		stu.put("age", "33");
		
		Map<String, String> stu2 = new HashMap<String, String> ();
		
		stu2.put("firstName", "Matthew");
		stu2.put("LastName", "Pablo");
		stu2.put("age", "12");
		
		System.out.println(stu);
		//System.out.println(stu2);
		
		List<Map<String, String>> students = new ArrayList<Map<String, String>> ();
		
		students.add(new HashMap<String, String>());
		students.add(new HashMap<String, String>());
		students.add(new HashMap<String, String>());
		
		students.get(1).put("firstName", "Isabel");
		students.get(1).put("lastName", "blas");
		students.get(2).put("firstName", "Matthew");
		students.get(2).put("lastName", "Pablo");
		
		System.out.println(students);
		
		System.out.println(students.get(1).get("lastName"));
		
		Map<Integer, Map<String, String>> tempStu = new HashMap<Integer, Map<String, String>> ();
		 
		tempStu.put(1001, new HashMap<String, String>());
		tempStu.put(1002, new HashMap<String, String>());
		tempStu.put(1003, new HashMap<String, String>());
		tempStu.put(1004, new HashMap<String, String>());
		tempStu.put(1005, new HashMap<String, String>());
		
		tempStu.get(1004).put("firstName", "Harris");
		System.out.println();
		
		
		
		

	}

}
