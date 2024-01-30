package Collections;

import java.util.LinkedList;

public class LinkedListExample {

	// Java program to change elements 
	// in a LinkedList
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<>();
		
		list.add("Geeks");
		list.add("Geeks");
		list.add(1, "Hello");
		
		System.out.println(list);
		list.set(1,"geeks");
		System.out.println(list);
		
		list.add(1, "for");
		System.out.println(list);
		
	}

}
