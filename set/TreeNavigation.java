package set;

import java.util.TreeSet;

public class TreeNavigation {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(70);
		ts.add(10);
		ts.add(60);
		ts.add(20);
		ts.add(50);
		ts.add(30);
		//ts.add(40);//If comment 40 then it gives lower values.
		System.out.println("Default Sorting Order+"+ts);
		System.out.println("Decending Sorting Order+"+ts.descendingSet());
		System.out.println(ts.floor(40));
		System.out.println(ts.lower(20));
		System.out.println(ts.ceiling(40));
		System.out.println(ts.higher(50));
		System.out.println(ts.pollFirst());
		System.out.println(ts);
		System.out.println(ts.pollLast());
		System.out.println(ts);	
}
}