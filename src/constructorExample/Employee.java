package constructorExample;



//Example of parameterized constructor
public class Employee {
	String name;
	int age;
	
	Employee(String name,int age)
	{
		this.name=name;
		this.age=age;
	}

	public static void main(String[] args) {
	
		Employee em1=new Employee("Rahul", 12);
		Employee em2=new Employee("Ritvik", 22);
			
		System.out.println(em1.name +"  "+ em1.age);
		System.out.println(em2.name +"  "+ em2.age);
	}

}
