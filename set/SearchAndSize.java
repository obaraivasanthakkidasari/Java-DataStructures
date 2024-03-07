package set;

import java.util.HashSet;
import java.util.Set;

public class SearchAndSize {

	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		System.out.println("Is set empty?: "+set.isEmpty());
		System.out.println("Number of elements in HashSet before adding:"+set.size());
		set.add("Dollar");
		set.add("INR");
		set.add("Euro");
		set.add("Yen");
//Call contain() method to check an element exists in set or no
		if(set.contains("Dollars")) {
			System.out.println("Does Elements Dollar exist in set?");
			System.out.println("Yes Elements Dollar exist in set?");
		}
		else {
			System.out.println("No, Element 'Dollar' does not exist");
		}
	}

}
