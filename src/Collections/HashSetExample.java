package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList<>();
		
		al.add("asas");
		al.add(19);
		
		
		HashSet hs=new HashSet();
		hs.add(al);
		hs.add("ass");
		hs.add(1);
		hs.add(120);
		hs.add(103);
		hs.add(122);
		hs.add(120);
		System.out.println(hs);
		
		
		Iterator itr=hs.iterator();
		
		
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
	}

}
