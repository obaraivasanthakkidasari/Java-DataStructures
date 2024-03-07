package DSList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterate {

	public static void main(String[] args) {
		LinkedList<Integer> obj=new LinkedList<Integer>();
		for(int i=1;i<=5;i++) {
			obj.add(i);
		}
       System.out.println(obj);
       System.out.println("Iterate by using basic for loop");
       for(int j=0;j<obj.size();j++) {
    	   System.out.println(obj.get(j));
       }
       System.out.println("Iterate by using  forEach loop");
       for(int x:obj) {
    	   System.out.println(x);
       }
       System.out.println("Iterate by using while loop");
       int k=0;
       while(k<obj.size()) {
    	   System.out.println(obj.get(k));
    	   k++;
       }
       System.out.println("Itearate by using Iterate interface");
       ListIterator<Integer> i=obj.listIterator();
       while(i.hasNext()) {
    	   System.out.println(i.next());
       }
       System.out.println("Itearate by using ListIterate inteface-forward");
       ListIterator<Integer>l=obj.listIterator();
       while(l.hasNext()) {
    	   System.out.println(l.next());
	}
       System.out.println("Itearate by using ListIterate inteface-Backward");
       while(l.hasPrevious()) {
    	   System.out.println(l.previous());
}
}
} 