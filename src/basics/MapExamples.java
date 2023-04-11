package basics;

import java.util.HashMap;

public class MapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// hashMap is a key/ value pair structure
		// you define the data types for keys and values <key,value>
		// keys will be unique and so its stored in a set 
		// the values can be anything 
		// is not index based
		
		// creating a HashMap
				HashMap<Integer, String> empList = new HashMap<Integer, String>();

				// to add items
				empList.put(10, "David");
				empList.put(20, "Jack");
				empList.put(30, "Anna");

				// get values
				System.out.println(empList.get(20));

				// get all keys
				System.out.println(empList.keySet());

				// get all values
				System.out.println(empList.values());

				// to verify if a key/value exists
				System.out.println(empList.containsKey(30));
				System.out.println(empList.containsValue("Anna"));

				// to get the size of the map
				System.out.println(empList.size());

				// to iterate through a map
				for (Integer key : empList.keySet()) {
					System.out.println(key + " " + empList.get(key));
				}

				System.out.println(empList);

				String[] values = { "CA", "VA", "PA", "TX", "MD", "VA", "ND", "WI", "VA", "TX", "CT", "MI", "TX", "FL", "FL" };

				System.out.println(countRep(values));
				System.out.println(countRepOfDup(values));
				
				String temp = "this is a sample string I am given to count the number of chars of";
				
				System.out.println(countRepChar(temp));
				
				
			}
	
	public static HashMap<Character, Integer> countRepChar(String input) {
		HashMap<Character, Integer> res = new HashMap<Character, Integer>();
		for (char key : input.toCharArray()) {
			if (res.containsKey(key)) {
				// we have it in the map, increase the current count
				int currentCount = res.get(key) + 1; // get the current count and add 1 to it
				res.put(key, currentCount); // update the count in the map for the key
			} else {
				// first time seeing this value
				// add it to the map with count 1
				res.put(key, 1);
			}
		}
		return res;
	}
	public static HashMap<String, Integer> countRep(String[] input) {
		HashMap<String, Integer> res = new HashMap<String, Integer>();
		for (String key : input) {
			if (res.containsKey(key)) {
				// we have it in the map, increase the current count
				int currentCount = res.get(key) + 1; // get the current count and add 1 to it
				res.put(key, currentCount); // update the count in the map for the key
			} else {
				// first time seeing this value
				// add it to the map with count 1
				res.put(key, 1);
			}
		}
		return res;
	}

	public static HashMap<String, Integer> countRepOfDup(String[] input) {
		HashMap<String, Integer> temp = countRep(input);
		HashMap<String, Integer> res = new HashMap<String, Integer>();

		for (String key : temp.keySet()) {
			if (temp.get(key) > 1) {
				res.put(key, temp.get(key));
			}
		}

		return res;
	}

}
			