package DSList;
		import java.util.ArrayList;
		import java.util.List;
		public class ArrayListDemo {
			public static void main(String[] args) {
				//Adding elements to array list.
					List<Integer>al=new ArrayList<Integer>();
					al.add(10);
					al.add(30);
					al.add(40);
					System.out.println(al);
					al.add(1,20);//add element at index List Interface method
					System.out.println(al);
					List<Integer>a2=new ArrayList<Integer>();
					System.out.println(a2);
				    a2.addAll(al);//addAll() method
				    System.out.println(a2);
				    List<Integer>a3=new ArrayList<Integer>(al);
				    System.out.println(a3);
				    System.out.println("Element at index position3 is "+al.get(3));//get() get element
				    al.set(1,25);//set() set method
				    System.out.println(al);
				  //al.remove(30);//this will give error because it remove on index position based
				    al.remove(new Integer(30));//Using wrapper class
				    System.out.println(al);
				}
			}
