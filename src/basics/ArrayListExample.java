package basics;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
        // to get the length - use the method size()
        System.out.println(names.size());
        // to add items, use the method add()
        names.add("name1");
        names.add("name2");
        names.add("name3");
        names.add("name4");
        names.add("name5");
        System.out.println(names.size());
        // to get a value, use the method get()
        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));
        System.out.println(names.get(3));
        System.out.println(names.get(4));
        // print the list, you can loop or print the name of your list
        for (String n : names) {
            System.out.println("foreach " + n);
        }
        for (int i = 0; i < names.size(); i++) {
            System.out.println("for loop " + names.get(i));
        }
        System.out.println(names);
	}

}
