package map;

import java.util.Comparator;
import java.util.TreeMap;

class Employee{
	private String name;
	private int salary;
	private int empCode;
	public Employee(String name, int salary, int empCode) {
		super();
		this.setName(name);
		this.setSalary(salary);
		this.setEmpCode(empCode);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getEmpCode() {
		return empCode;
	}
	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", empCode=" + empCode + "]";
	}
}


//Creating a comparator for Employee Salary
class EmpSalary implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.getSalary()>e2.getSalary()) {
			return 1;
		}
		else {
			return -1;
		}
	
	}
	
}
public class EmployeeMap {

	public static void main(String[] args) {
		TreeMap<Employee,String> treeMapSortName=new TreeMap<Employee,String>(new EmpSalary());
		treeMapSortName.put(new Employee("Ram",30000,101),"A");
		treeMapSortName.put(new Employee("Sham",60000,105),"B");
		treeMapSortName.put(new Employee("Krishna",15000,102),"C");
		treeMapSortName.put(new Employee("Radhe",24000,103),"D");
		treeMapSortName.put(new Employee("Ravi",7000,110),"E");
		System.out.println(treeMapSortName);
		{
			for(Employee key: treeMapSortName.keySet())
			{
				System.out.println(key);
			}
		}
	}

}
