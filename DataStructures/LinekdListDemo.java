package DataStructures;

import java.util.LinkedList;

public class LinekdListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> obj=new LinkedList<Integer>();
		obj.add(10);
		obj.add(20);
		obj.add(40);
		obj.add(50);
		System.out.println(obj);
		// Add the elements at specified Position.
		obj.add(2,30);
		System.out.println(obj);
		LinkedList<Integer> obj2=new LinkedList<Integer>();
		System.out.println(obj2);
		obj2.addAll(obj);
		System.out.println(obj2);
		obj.removeFirst();
		System.out.println(obj);
		obj.removeLast();
		System.out.println(obj);
		obj.remove(2);
		System.out.println(obj);
		
		
		
		

	}

}
