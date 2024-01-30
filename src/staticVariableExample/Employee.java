package staticVariableExample;

public class Employee {

	String name;
	 double salary;
	int id;
	
	Employee(String name,double salary,int id){
		
		this.name=name;
		this.salary=salary;
		this.id=id;		
	}
	
	void detailsDisplay() {
		System.out.println(name+ "\n"+ salary + "\n" +id);
		
	}
	public static void main(String[] args) {
		Employee e= new Employee("Vicky", 19292, 101);	
		
		e.detailsDisplay();
	}

}
