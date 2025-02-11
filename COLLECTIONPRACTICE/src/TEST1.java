// List for primitive Integer, Double, String

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TEST1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		    list.add(10);
	        list.add(7);
	        list.add(15); 
	        list.add(new Integer(42));
	        list.add(10);
	        System.out.println("Displaying bcz toString() method");
	        System.out.println(list);
	        System.out.println("Second Approach");
	        for(Integer a:list) {
	        	System.out.println(a);
	        }
	        System.out.println("Third Approach- Iterator");
	        ListIterator itr=list.listIterator();
	       while(itr.hasNext()) { 
	    	   System.out.println(itr.next());
	       }
	        
	        
	        

	}

}
