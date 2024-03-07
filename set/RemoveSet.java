package set;

import java.util.HashSet;

public class RemoveSet {

	public static void main(String[] args) {
		HashSet<Integer> hset=new HashSet<Integer>();
		hset.add(5);
		hset.add(10);
		hset.add(15);
		hset.add(20);
		System.out.println(hset);
		//Removing a specific elements from Hashset
		hset.remove(10);
		System.out.println(hset);
		HashSet<Integer> hset2=new HashSet<Integer>();
		hset2.add(20);
		hset2.add(5);
		hset.removeAll(hset2);
		System.out.println(hset);
	}

}
