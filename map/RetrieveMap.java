package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class RetrieveMap {

	public static void main(String[] args) {
		Map<Integer,String>hm=new  HashMap<Integer,String>();
		hm.put(111,"RamMohan");
		hm.put(211,"Java");
		hm.put(22,"Oracle");
		hm.put(1,"CoreJava");
		hm.put(89,"Html");
		System.out.println(hm);
		//Retrieve elements by entry method
		Set<Map.Entry<Integer,String>>s=hm.entrySet();
		for(Map.Entry<Integer,String>m:s) {
			System.out.println(m.getKey());
			System.out.println("====");
			System.out.println(m.getValue());
		}
		System.out.println("***Linkedn HashMap***");
		Map<Integer,String>hm1=new  LinkedHashMap<Integer,String>();
		hm1.put(111,"RamMohan");
		hm1.put(211,"Java");
		hm1.put(22,"Oracle");
		hm1.put(1,"CoreJava");
		hm1.put(89,"Html");
		System.out.println(hm);
		Set<Map.Entry<Integer,String>>s1=hm1.entrySet();
		for(Map.Entry<Integer,String>m:s1) {
			System.out.println(m.getKey());
			System.out.println("=====");
			System.out.println(m.getValue());
			//Linked Hash map maintain the insertion order.
	}
	}
}
