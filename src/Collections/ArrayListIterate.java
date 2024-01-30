package Collections;

import java.util.ArrayList;

//Multiple ways to iterate arrayList
public class ArrayListIterate {

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();

		list.add("Geeks");
		list.add("Geeks");
		list.add(1, "For");
		
		//First ways to iterate using simple loop and using get method
		for(int i=0;i<=list.size()-1;i++) 
		{
		   list.get(i);
		}
		
		System.out.println(list);
		
		for(String s:list)
		{
			System.out.print(s + " ");
		}
		
		
		
		
		
	}

}
