package Collections.comparableAndComparatorExample;

public class Employee {

	
	private int empId;
	private String name;
	private double salary;
	
	//It is a method of comparable interface used to sort the object because in object we cant sort it and we dont know how to sort wither to
	// sort with id name thats why we use compare to method method but it will sort only one object.
	
//	@Override
//	public int compareTo(Employee o) {
//		return  this.empId-o.empId ;
//	}
	
	
	
	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
			
	

	}


