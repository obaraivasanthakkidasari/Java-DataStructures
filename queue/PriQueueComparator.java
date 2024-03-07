package queue;

import java.util.PriorityQueue;
import java.util.Queue;
class Book implements Comparable<Book>{
	int id;
	String name,author,publisher;
	int quantity;
	public Book(int id, String name, String author, String publisher, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher + ", quantity="
				+ quantity + "]";
	}


	public int compareTo(Book b) {
		if(id>b.id) {
			return 1;
		}
		else if(id<b.id) {
			return -1;
		}else {
			return 0;
		}
	}
	
}
public class PriQueueComparator {
	public static void main(String[] args) {
		Queue<Book> queue=new PriorityQueue<Book>();
		//Creating Book
		Book b1=new Book(121,"lET US C","Yashwanth Kanetkar","BPB",8);
		Book b2=new Book(233,"O.S","Galvin","Willey",6);
		Book b3=new Book(101,"DC&N","Forouzen","Mc Grill Hill",4);
		//Adding book to queue
		queue.add(b1);
		queue.add(b2);
		queue.add(b3);
		System.out.println("Traversing the queue elements");
		//Traversing the queue elements
		for(Book b:queue) {
			System.out.println(b.id+""+b.name+""+b.author+""+
		b.publisher+""+b.quantity);		
		}	
		queue.remove();
		System.out.println("After removing one book record");
		for(Book b:queue) {
			System.out.println(b.id+""+b.name+""+b.author+""+
					b.publisher+""+b.quantity);
		}
	}

}
