package set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		//Adding elements to hashset
		set.add("First");
		set.add("Second");
		set.add("Third");
		set.add("Four");
		set.add("Fifth");
		System.out.println(set);
		// Adding duplictaes previous elements overidden.
		set.add("First");
		set.add("Third");
		System.out.println(set);
		set.add(null);
		set.add(null);
		System.out.println(set);// add only one null otherone ignored.
		

	}

}
