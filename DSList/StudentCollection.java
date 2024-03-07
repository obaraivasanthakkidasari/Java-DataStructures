package DSList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{//Step-1
	int studentNo;
	String studentName;
	double studentMarks;
	public Student(int studentNo,String StudentName,double studentMarks){
	super();
	this.studentNo=studentNo;
	this.studentName=StudentName;
	this.studentMarks=studentMarks;
	}
	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", studentName=" + studentName + ", studentMarks=" + studentMarks
				+ "]";
	}
	@Override
	public int compareTo(Student s1) {//Step-2
		if(this.studentMarks>s1.studentMarks)
		return 1;
		else if(this.studentMarks<s1.studentMarks)
	    return -1;
		else
			return 0;
	}
}
	

public class StudentCollection {
	public static void main(String[] args) {
		Student java=new Student(111,"Java",76);
		Student oracle=new Student(121,"Oracle",66);
		Student html=new Student(112,"html",86);
		Student python=new Student(115,"Python",56);
		Student testing=new Student(119,"Testing",96);
		List<Student>slist=new ArrayList<Student>();//Step-4
		slist.add(java);
		slist.add(oracle);
		slist.add(html);
		slist.add(python);
		slist.add(testing);
		System.out.println("StudentList Befor Sorting");
		for(Student s:slist) {
			System.out.println(s);	
		}
		Collections.sort(slist);
		System.out.println("StudentList Sorting Based on Marks: ");
		for(Student s:slist) {
			System.out.println(s);
		}
	}
}
