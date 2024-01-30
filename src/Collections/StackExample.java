package Collections;

import java.util.Stack;

//Add the elements in stack
public class StackExample {

	public static void main(String[] args) {
		
		Stack<Integer> stackofIntergers=new Stack<>();
		stackofIntergers.push(10);
		stackofIntergers.push(20);
		stackofIntergers.push(30);
		stackofIntergers.push(40);
		
		 System.out.println(stackofIntergers);
		 

		 //peek() method to get first element at the top
		 
		 System.out.println("fetching gthe element from top : "+stackofIntergers.peek());
		 
		//For removing the element from stack we need pop() method
		 
		 System.out.println("Removng the element from top : "+stackofIntergers.pop());
		 
		 System.out.println(stackofIntergers);
		 
		 
		 //pop the elements from the stack using the pop() method inside the while loop 
		 while(!stackofIntergers.isEmpty()) {
			 System.out.println(stackofIntergers.pop());
			 
			 
		 }
		 
		 System.out.println(stackofIntergers);
		 
		 
	}

}
