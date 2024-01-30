package inHeritanceExamples;

public class MultiLevel {
}

class C {
 void showC() 
 {
	 System.out.println("C class method");
 }	
}

class D extends C{
	void showD() 
	 {
		System.out.println("D class method");
	 }	
}

class E extends D{
	void showE() 
	 {
		System.out.println("E class method");
	 }
}
class Test1{
	public static void main(String[] args) {
		E objE = new  E();
		objE.showC();
		objE.showD();
		objE.showC();
		
	}

}
