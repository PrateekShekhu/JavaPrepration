package encapsulation;

public class Employee {
	
	private int employee_Id;
	private String employee_name;
	private double salary;
	private long pan;
	
	public void setEmployeeId(int empId) {
		this.employee_Id=empId;
	}
	
	public int getEmployeeId() {
		return employee_Id;
	}
	
	 public void setEmployeeName(String empName) {
		this.employee_name=empName;
	}
	
	public String getEmployeeName() {
		return employee_name;
	}
	
	public void setEmployeeSalary(double salary) {
		this.salary=salary;
	}
	
	public double getEmployeeSalary() {
		return salary;
	}
	
	
	public void setEmployeePan(long pan) {
		this.pan=pan;
	}
	
	public long getEmployeePan() {
		return pan;
	}
	
	
	public static void main(String[] args) {

		Employee emp= new Employee();
		 emp.setEmployeeId(101);
		 emp.setEmployeeName("Amit");
		 emp.setEmployeeSalary(200000.54);
		 emp.setEmployeePan(292922299);
			System.out.println("Employee id :" + emp.getEmployeeId() + "\n" + "Employee Name :" + emp.getEmployeeName()
					+ "\n" + "Employee Pan :" + emp.getEmployeePan() + "\n" + "Employee Salary :"
					+ emp.getEmployeeSalary());
		
	}

}
