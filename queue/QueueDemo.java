package queue;

import java.util.Iterator;
import java.util.PriorityQueue;
public class QueueDemo {
	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("Amit");
		queue.add("Vijay");
		queue.add("Karan");
		queue.add("Jai");
		queue.add("Rahul");
		System.out.println("Head:"+queue.element());
		System.out.println("Head:"+queue.peek());
		System.out.println("Iterate the queue element");
		Iterator itr=queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("After removing two elements");
		Iterator itr2=queue.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

}
