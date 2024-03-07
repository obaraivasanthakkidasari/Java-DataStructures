package DSList;

import java.util.LinkedList;

public class LLGetElement {

	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		for(int i=1;i<=10;i++) {
			l.add(i);
		}
	System.out.println(l);
	System.out.println("First Element="+l.getFirst());
	System.out.println("Last Element="+l.getLast());
	System.out.println("Element at index 4="+l.get(4));
	System.out.println(l.peekFirst());
	System.out.println(l);
	System.out.println(l.peekLast());
	System.out.println(l);
	System.out.println(l.pollFirst());
	System.out.println(l);
	System.out.println(l.pollLast());
	System.out.println(l);
}
	
}
