package DSList;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Iterator;
public class IteratorTestDemo {
	public static void main(String[] args) {
			List <String> programmingLanguages=new ArrayList<String>();
			programmingLanguages.add("Java");
			programmingLanguages.add("Python");
			programmingLanguages.add("UI");
			programmingLanguages.add(".Net");
			programmingLanguages.add("Testing");
			System.out.println(programmingLanguages);
			System.out.println("Working with Iterator");
			Iterator <String> i=programmingLanguages.iterator();
			while(i.hasNext()) {
				System.out.println(i.next());
			}
			System.out.println("Working with ListIterator--Forward Direction");
			ListIterator <String> l=programmingLanguages.listIterator();
			while(l.hasNext()) {
				System.out.println(l.next());
			}
			System.out.println("Working with ListIterator--Backward Direction");
			while(l.hasPrevious()) {
					System.out.println(l.previous());
			}
		}
	}		
	
