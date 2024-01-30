package com.study.oopsExample;

public class Animal {
	
	public void eat() 
	{
		System.out.println("I am eating");
	}
	
	public void run() 
	{
		System.out.println("i am running");
	}

	public static void main(String[] args) {
		
		Animal dog =new Animal();
		dog.eat();
		dog.run();
	}
	

}
