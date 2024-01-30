package inHeritanceExamples;

class SingleLevel{
	
}
	class A {
		 
		void showA() {
			System.out.println("A class method");
		}
	 }
		
	 class B extends A{
		 void showB() {
			 System.out.println("B class method");
		 }
	 	
	 
	 
	public static void main(String[] args) {

		B objB = new B();
		objB.showA();
		objB.showB();
		
	}
	 }

