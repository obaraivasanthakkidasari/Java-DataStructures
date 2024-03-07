package DSList;
import java.util.ArrayList;
import java.util.List;
public class ElementsTestDemo {
		public static void main(String[] args) {
			List<Integer>al=new ArrayList<Integer>();
			for(int i=1;i<=10;i++)
			{
				al.add(i);
			}
			System.out.println(al);
			List<Integer>a2=new ArrayList<Integer>();
			a2.add(4);
			a2.add(7);
			a2.add(2);
			a2.add(9);
			System.out.println(a2);
			//al.removeAll(a2);//from a1 all elements of a2 removed
		    //System.out.println(al);
			al.retainAll(a2);//common elements will be retain.
			System.out.println(al);
			}
	}
