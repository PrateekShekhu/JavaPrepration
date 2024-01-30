package Collections;

import java.util.ArrayList;

///Add all the elements of 1 collection at the end of another collection
public class ArrayListIntoNewArrayList {

	public static void main(String[] args) {
	ArrayList<Integer> list =new ArrayList<>();
	
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);
	
	ArrayList<Integer> list1=new ArrayList<>();
	list1.add(60);
	list1.add(70);
	list1.add(80);
	list1.add(90);
	
	list.addAll(list1);
	System.out.println(list);
	System.out.println(list1);
	
	
	}

}
