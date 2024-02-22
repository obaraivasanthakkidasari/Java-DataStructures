package DataStructures;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class RetrieveListDemo {
		public static void main(String[] args) {
List<String> players=new ArrayList<String>();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the names,to complete the list ente'STOP'");
String name=sc.next();
while(!name.equals("STOP")) {
players.add(name);
name=sc.next();
			}
	System.out.println("List Contains="+players);
	System.out.println("Retriving players by using basic for loop");
			for(int i=0;i<players.size();i++) {
				System.out.println(players.get(i));
				}
	System.out.println("Retriving players by using for Each loop");
		    for(String s:players)	{
		    	System.out.println(s);
		    }
		    for(String s:players) {
				System.out.println(s);
		    }
	System.out.println("Retriving players by using for While loop");
				int x=0;
				while(x<players.size()) {
					System.out.println(players.get(x));
					x++;
			}
			
		}
		}
		
		


		
		
	

