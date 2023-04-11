package basics;

import java.util.ArrayList;

public class RecapArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // array list
		 // array list
        ArrayList<String> temp1 = new ArrayList<String>();
        
        
        
        temp1.add("string 1");
        temp1.add("string 2");
        temp1.add("string 3");
        temp1.add("string 4");
        temp1.add("string 5");
        temp1.add("string 6");
        
        System.out.println(temp1.size());;
        
        System.out.println(temp1.get(0));
        
        System.out.println(temp1.remove(1));;
        
        System.out.println(temp1);
        
        for (int i = 0; i < temp1.size(); i++) {
            System.out.println(temp1.get(i));
        }
        
        for (String s : temp1) {
            System.out.println("foreach "+s);
        }
        
        int x = 10;
        Integer i = 10;
        
	}
}
        
        
       


