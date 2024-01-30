package Collections.comparableAndComparatorExample;

import java.util.Comparator;

public class NameComprator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		int name=o1.getName().compareTo( o2.getName()); 
		return name;
	}
	
	

}
