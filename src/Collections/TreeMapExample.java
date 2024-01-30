package Collections;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
			TreeMap<Integer, String> tm=new TreeMap<>();
			tm.put(101, "Hello");
			tm.put(102, "Welcome");
			tm.put(103, "Collection");
			tm.put(104, "Framework");
			
			System.out.println(tm);
			System.out.println(tm.ceilingKey(103));
			System.out.println(tm.ceilingEntry(101));

	}

}
