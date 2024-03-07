package set;

import java.util.HashSet;

class Student{
	String studentName;
	String schoolName;
	int regNo;
	public Student(String studentName, String schoolName, int regNo) {
		super();
		this.studentName = studentName;
		this.schoolName = schoolName;
		this.regNo = regNo;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", schoolName=" + schoolName + ", regNo=" + regNo + "]";
	}
	
}
public class StudentSet {
	public static void main(String[] args) {
		HashSet<Student> hset=new HashSet<Student>();
//Create object of student class and pass the parameters.
		Student s1=new Student("John","RSVM",0012);
		Student s2=new Student("Shubh","DPS",1234);
		Student s3=new Student("Rickey","DAV",9876);
		// Adding elements to Hashset and pass reference variable s1,s2,s3.
		hset.add(s1);
		hset.add(s2);
		hset.add(s3);
		for(Student s:hset) {
			System.out.println(s);
		}
		
		
		

	}

}
