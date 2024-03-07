package DSList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class sortL_list {

	public static void main(String[] args) {
		 List<String> programmingLanguages=new ArrayList<String>();
		 programmingLanguages.add("Java");
		 programmingLanguages.add("Python");
		 programmingLanguages.add("UI");
		 programmingLanguages.add(".Net");
		 programmingLanguages.add("Testing");
		 System.out.println("Before Sorting:"+programmingLanguages);
		 Collections.sort(programmingLanguages);
		 System.out.println("After Sorting:"+programmingLanguages);
		 	
 
	}

}
