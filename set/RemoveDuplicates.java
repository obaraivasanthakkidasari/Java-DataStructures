package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<Integer>al=new ArrayList<Integer>();
		al.add(10);
		al.add(30);
		al.add(40);
		al.add(20);
		al.add(10);
		al.add(40);
		System.out.println(al);
		Set<Integer> s= new HashSet<Integer>(al);
		System.out.println(s  );
		
	}

}
