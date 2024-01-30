package Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
		List <Integer> list=new ArrayList<Integer>();
		int n=10;	
		System.out.println("Array List" +list);
		for(int i =1;i<=n;i++) 
		{
			list.add(i);
		}
		
		System.out.println("List after appending the elements : " +list);
		
		
		//Use of add(object) add(int index ,object)method
		
		ArrayList<String> list2=new ArrayList<>();
		
		list2.add("java");
		list2.add("PHP");
		list2.add("Python");
		list2.add(".NET");
		
		list2.add(1, "C++");
		System.out.println("output using Add String elements in List :" +list2);
		
		
		//If we wish to change the element, it can be done using the set() method.
		
		list2.set(4, "MERN");
		System.out.println("output using set method in List :" +list2);
		 
		list2.remove(1);
		System.out.println("output using remove method in List :" +list2);
		
	}

}
