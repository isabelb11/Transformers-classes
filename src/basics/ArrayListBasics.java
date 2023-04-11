package basics;

import java.util.ArrayList;



public class ArrayListBasics{
    public static void main(String[] args) {



       // how to create an instance of array list
        ArrayList<String> temp = new ArrayList<String>();
        
        // to add items
        temp.add("test 1");
        temp.add("test 2");
        temp.add("test 3");
        temp.add("test 4");
        temp.add("test 5");
        
        // to get one index value
        System.out.println(temp.get(0));
        System.out.println(temp.get(3));
        
        // to get the size of the list
        System.out.println(temp.size());
        
        for (int i = 0; i < temp.size(); i++) {
            System.out.println(temp.get(i));
        }
        
        
//        temp.add(1, "new value");
//        temp.clear();
//        temp.remove(3);



       // to print the list
        System.out.println(temp);
    }
}