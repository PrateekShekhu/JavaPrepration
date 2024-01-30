package methodOverloadingAndOverRidingExample;

public class MethodOverloading {

	void show(int a) {
		System.out.println("Show first");
	}
	
	void show(String a) {
		System.out.println("Show Second");
	}


	public static void main(String[] args) {
		MethodOverloading overLoading= new MethodOverloading();
		overLoading.show("b");

	}

}
