package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class OrderedSet {

	public static void main(String[] args) {
		//Set<String> set=new HashSet<String>();
		Set<String> set=new LinkedHashSet<String>();
		//Adding elements to Hashset.
		set.add("First");
		set.add("Second");
		set.add("Third");
		set.add("Four");
		set.add("Five");
		System.out.println(set);
		

	}

}
