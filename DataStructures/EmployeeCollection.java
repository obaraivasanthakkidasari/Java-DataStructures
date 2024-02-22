package DataStructures; 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
    int empID;
	String empName;
	double empSalary;
	String empDesg;
	public Employee() {
		super();
	}
	public Employee(int empID, String empName, double empSalary, String empDesg) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDesg = empDesg;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", empSalary=" + empSalary + ", empDesg=" + empDesg
				+ "]";
	}
}

class SalarySort implements Comparator<Employee>{
@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.empSalary>o2.empSalary)
			return 1;
		else if(o1.empSalary<o2.empSalary)
			return -1;
		else
		return 0;
	}
}
class NameSort implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.empName.compareTo(o2.empName)>1)
			return 1;
		else if(o1.empName.compareTo(o2.empName)<1)
			return -1;
		else
			return 0;
	}
	
}
public class EmployeeCollection {
public static void main(String[] args) {
		
   Employee java=new Employee(111,"Java",45000,"Manager");
   Employee ram=new Employee(121,"Ram",55000,"TeamLead");
   Employee oracle=new Employee(121,"Oracle",35000,"Sr Developer");
   Employee html=new Employee(131,"Html",25000,"Jr.Developer");
   List<Employee> empList=new ArrayList<Employee>();
   empList.add(java);
   empList.add(oracle);
   empList.add(ram);
   empList.add(html);
   System.out.println("Employee List Before Sorting");
   for (Employee e:empList) {
	   System.out.println(e);
   }
   System.out.println("Employee List Based on  salary Sorting");
   Collections.sort(empList,new SalarySort());
   for (Employee e:empList) {
	   System.out.println(e);
   
	}
   System.out.println("Employee List Based on  Name Sorting");
   Collections.sort(empList,new NameSort());
   for (Employee e:empList) {
	   System.out.println(e);
	}
}
}

