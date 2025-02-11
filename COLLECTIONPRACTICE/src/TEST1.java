// List for primitive Integer, Double, String

import java.util.ArrayList;
import java.util.Arrays;
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
	       //insert at begin , end and any position
	       System.out.println("Before Insert");
	       System.out.println(list);
	       list.add(0,100);
	       System.out.println("After Insertion");
	       System.out.println(list);
	       System.out.println(list.size());
	       list.add(list.size(),200);
	       System.out.println(list);
	       list.add(3,300);
	       System.out.println(list);
	       List<Integer> sublist= Arrays.asList(10,20,30);
	       System.out.println(list.addAll(sublist));
	       System.out.println(list);
	       //delete object from list
	       list.remove(1);
	       System.out.println(list);
	      // list.remove(10);// 10 is index
	       System.out.println(list);
	       list.remove(new Integer(10)); //10 is object
	       System.out.println(list);
	       list.removeFirst();
	       System.out.println(list);
	       list.removeLast();
	       System.out.println(list);
	       boolean exist=list.contains(new Integer(10));
	       if(exist)
	    	   System.out.println("searched found");
	       else
	    	   System.out.println("Not found");
	    
	       //find index of an object
	       System.out.println("index of 15 is "+
	       list.indexOf(new Integer(15)));
	       System.out.println("index of 15 is "+
	    	       list.lastIndexOf(new Integer(15)));
           list.add(200);
           System.out.println(list);
           System.out.println("index of 200 is "+
        	       list.indexOf(new Integer(200)));
        	       System.out.println("index of 200 is "+
        	    	       list.lastIndexOf(new Integer(200)));
	}

}
