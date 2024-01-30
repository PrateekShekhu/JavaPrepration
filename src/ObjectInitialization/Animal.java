package ObjectInitialization;

class Animal{
	
	String color;
	int age;
	
	//using method
	void intObject(String c, int a) 
	{
		this.color=c;
		this.age=a;
	}
	
	void display() 
	{
		System.out.println("This output is using methods to intitalize the object-----> "+color +"  " +age);
	}
	
	
	public static void main(String [] args) {
		
		Animal dog = new Animal();
		//This is using reference variable
		dog.color="black";
		dog.age=12;
		System.out.println(dog.color + " " +dog.age);
		
		//This is using method 
		dog.intObject("white", 14);
		dog.display();
		
	}
}
