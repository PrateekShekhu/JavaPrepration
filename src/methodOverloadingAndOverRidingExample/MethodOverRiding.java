package methodOverloadingAndOverRidingExample;

public class MethodOverRiding {

	void show() 
	{
	System.out.println("1");	
	}
}
class Xyz extends MethodOverRiding{
	
	void show() 
	{
		super.show();
		System.out.println("2");
	}
}	
class test2{	
	public static void main(String[] args) {
		MethodOverRiding overRiding = new MethodOverRiding();
		overRiding.show();
		
		Xyz x= new Xyz();
		x.show();
		
	}

}
