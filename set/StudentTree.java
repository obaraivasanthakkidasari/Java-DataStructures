package set;

import java.util.Comparator;
import java.util.TreeSet;

class Students{
	int regNo;
	String studentName;
	double marks;
	public Students(int regNo, String studentName, double marks) {
		super();
		this.regNo = regNo;
		this.studentName = studentName;
		this.marks = marks;
	}
	@Override//To Print the values.
	public String toString() {
		return "students [regNo=" + regNo + ", studentName=" + studentName + ", marks=" + marks + "]";
	}
	
}

class NameSort implements Comparator<Students>{

	@Override
	public int compare(Students o1, Students o2) {
		if(o1.studentName.compareTo(o2.studentName)>=1)
		return 1;
		else if (o1.studentName.compareTo(o2.studentName)<1)
			return -1;
		else 
			return 0;
	}

}

public class StudentTree {

	public static void main(String[] args) {
		Students ram=new Students(123,"Ram",85);
		Students java=new Students(133,"Java",75);
		Students python=new Students(113,"Python",65);
		Students oracle=new Students(123,"Oracle",95);
    TreeSet<Students> stree=new TreeSet<Students>(new NameSort());
    stree.add(ram);
    stree.add(oracle);
    stree.add(python);
    stree.add(java);
    for(Students s: stree)
    //System.out.println(stree);
    System.out.println(s);
    
	}

}
