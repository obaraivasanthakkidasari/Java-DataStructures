package DSList;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorRetrieval {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		for(int i=0;i<=10;i++) {
			v.add(i);
		}
       System.out.println(v);
       System.out.println("Iteration-Iterator");
       Iterator<Integer>i=v.iterator();
       while(i.hasNext()) {
    	   System.out.println(i.next());
       }
       //System.out.println("Iteration-ListIterator-Forward");
       ListIterator<Integer>l=v.listIterator();
       while(l.hasNext()) 
    	   System.out.println(l.next());
       System.out.println("Iteration-ListIteration-Backward");
    	   while(l.hasPrevious()) 
        	   System.out.println(l.previous());
    	   System.out.println("Iteration-Enumerator");
    	   Enumeration<Integer>e=v.elements();
    	   while(e.hasMoreElements())
    		   System.out.println(e.nextElement());
	//
	}}
