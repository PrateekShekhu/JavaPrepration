package Collections.comparableAndComparatorExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CompratorAndComparable {

	public static void main(String[] args) {
		ArrayList<Employee> emp= new ArrayList<>();
		emp.add(new Employee(102, "Jack", 10000));
		emp.add(new Employee(103, "Jhon", 20000));
		emp.add(new Employee(101, "Alex", 30000.23));
		
		//Collections.sort(emp);
		//Sort the multiple type of collections
		ArrayList<Employee> em1=new ArrayList<>(emp);
		
		Collections.sort(em1,new NameComprator());
			System.out.println(em1);

	}

}
