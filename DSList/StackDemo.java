package DSList;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
	Stack<String> animals=new Stack<String>();
	animals.push("Dog");
	animals.push("Horse");
	animals.push("Cat");
	animals.push("Lion");
	System.out.println(animals);
	System.out.println(animals.search("Cat"));
	System.out.println(animals.peek());//Top of the Stack
	System.out.println(animals.pop());
	System.out.println(animals);
	}

}
