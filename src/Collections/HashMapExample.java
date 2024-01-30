package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
			HashMap <Integer,String> hm=new HashMap<>();
			hm.put(101, "Java");
			hm.put(102, "Python");
			hm.put(103, "PHP");
			hm.put(104, "MERN");
			hm.put(105, "MEAN");
			
		//First way to iterate the map using set interface	
	      Set set =hm.entrySet();		
			System.out.println(set);
			
		//Second way through Iterator interface
			
		Iterator itr=set.iterator();
		while(itr.hasNext()){
			//System.out.println(itr.next());
			Map.Entry<Integer, String> entry =(Map.Entry) itr.next();
			
			System.out.println(entry.getKey() +"===>"+ entry.getValue());
		}
		
	// Third and latest way to iterate HashMap Using forEach loop
		
	  for(Map.Entry<Integer, String> entry : hm.entrySet())
		  System.out.println(entry.getKey() +"=="+ entry.getValue());
		  
	  {
		  
	  }	 
		

	}

}
