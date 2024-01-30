package Abstraction;

public interface InterfaceExample {
	void display();
	public static final String name="Prateek";
}

 interface I1{
	void show();
}
class Test4 implements InterfaceExample,I1{

	public void display() {
		System.out.println("1");
	}
	
	public void show() {
		System.out.println("Scnd I1");
	}
	
	public static void main(String [] args) {
	
		Test4 I1=new Test4();
		I1.show();
		I1.display();
		
	}
	
}


