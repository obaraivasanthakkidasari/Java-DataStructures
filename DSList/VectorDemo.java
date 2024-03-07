package DSList;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>(4,6);
		System.out.println("Capacity="+v.capacity());
		System.out.println("Size="+v.size());
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);	
		v.add(50);
		System.out.println("Capacity="+v.capacity());
		System.out.println("Size="+v.size());
	}
}
