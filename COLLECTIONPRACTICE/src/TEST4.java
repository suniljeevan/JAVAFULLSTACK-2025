// Map Demonstration

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public class TEST4 {
	public static void main(String[] args) {
		//creating simple map
		Map<String, Double> cgpaold= new HashMap<String,Double>();
		Map<String, Double> cgpatable= new LinkedHashMap<String,Double>();
		//adding entries
		cgpaold.put("toushif", 9.4);
		cgpaold.put("asmita", 8.6);
		cgpaold.put("dileep", 8.6);
		cgpaold.put("upendra", 8.3);
		cgpaold.put("laxmi", 9.4);
		cgpaold.put("chandana", 8.6);
		cgpatable.put("rohan", 7.8);
		cgpatable.putAll(cgpaold);
	    //displaying all entries
		System.out.println("Displaying old table");
		for(Map.Entry<String,Double> e:cgpaold.entrySet()) {
			System.out.println(e.getKey()+"->"+e.getValue());
		}
		System.out.println("Displaying new table");
		for(Map.Entry<String,Double> e:cgpatable.entrySet()) {
			System.out.println(e.getKey()+"->"+e.getValue());
		}
		//Displaying all keys
		Set<String> keys=cgpatable.keySet();
		System.out.println("All keys are "+keys);
		//Displaying values
		Collection<Double> values=cgpatable.values();
		System.out.println("All values are "+values);
	    //Displaying value for a given key
		System.out.println("Value for key toushif is "+
	        cgpatable.get("toushif"));
		//Displying value for key which is not present


System.out.println("Value for key aakash is "+
		        cgpatable.getOrDefault("aakash",0.0));
	}

}
