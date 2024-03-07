package set;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(70);
		ts.add(10);
		ts.add(60);
		ts.add(20);
		ts.add(50);
		ts.add(30);
		ts.add(40);
		System.out.println(ts);
		System.out.println("First Element="+ts.first());
		System.out.println("Last Element="+ts.last());
		System.out.println("TailSet="+ts.tailSet(40));
		System.out.println("HeadSet="+ts.headSet(40));
		System.out.println("SubSet="+ts.subSet(30,70));
		System.out.println(ts.comparator()  );
	}

}
