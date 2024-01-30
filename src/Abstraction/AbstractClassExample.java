package Abstraction;

abstract class AbstractClassExample {

	abstract void start();
}

 class Vehicle extends AbstractClassExample{
	void start() {		
		System.out.println("Start vehicle");
	}
	
}
 
 class Bike extends AbstractClassExample{
	 void start() {
		 System.out.println("Starts with self");
		 
	 }
	 
 }
	
	class Test3{
	public static void main(String[] args) {
		AbstractClassExample ab= new Vehicle();
		ab.start();
		
		ab=new Bike();
		ab.start();

	}


}