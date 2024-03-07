package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
				Map<Integer,String>hm=new  HashMap<Integer,String>();
				hm.put(111,"RamMohan");
				hm.put(211,"Java");
				hm.put(22,"Oracle");
				hm.put(1,"CoreJava");
				hm.put(89,"Html");
				System.out.println(hm);
		// How to add one collection data in to other.
				Map<Integer,String>hm2=new  HashMap<Integer,String>();
				System.out.println(hm2);
				hm2.putAll(hm);	
				System.out.println(hm2);
				// Contains key
				System.out.println(hm.containsKey(143));
				System.out.println(hm.containsValue("Java"));
				//Get the value based on key
				System.out.println(hm.get(111));
				//Replace & Remove
                hm.replace(1,"Python");
                System.out.println(hm);
                hm.remove(89);
                System.out.println(hm);
                
	   //Get only keys
	 System.out.println("Retieve all the key values");
	 Set<Integer>s=hm.keySet();
	 for(int x:s)
		 System.out.println(x);
	 //Retrieve all vlaues.
	 System.out.println("Retieve all the values");
	 Collection <String>c=hm.values();
	 for(String value:c)
		 System.out.println(value);
	 // Get all key values at a time using entry set.
	 
     
	}
	           

}
