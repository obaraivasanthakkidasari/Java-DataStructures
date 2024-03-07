package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo1 {

	public static void main(String[] args) {
		TreeMap<Integer,String>hm=new  TreeMap<Integer,String>();
		hm.put(131,"Ram");
		hm.put(111,"Java");
		hm.put(143,"Oracle");
		hm.put(221,"Python");
		hm.put(456,"Html");
		hm.put(123,"JavaScript");
		hm.put(786,".Net");
		hm.put(234,"Mysql");
		System.out.println(hm);
		System.out.println("Least key="+hm.firstKey());
		System.out.println("Largest key="+hm.lastKey());
		System.out.println("Descending order="+hm.descendingMap());
		System.out.println("Sub Map="+hm.subMap(143,456));
		System.out.println("Tail Map="+hm.tailMap(143));
		System.out.println("Head Map="+hm.headMap(143));
		System.out.println(hm.comparator());
	}

}
