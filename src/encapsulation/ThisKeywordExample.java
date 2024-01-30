package encapsulation;

public class ThisKeywordExample {
	int id;
	String name;
	
	
	public ThisKeywordExample() {
		 this(101,"prateek");
		
	System.out.println("no args const");
	}
	
	public ThisKeywordExample(int id, String name) {
		System.out.println("parameterised");
		this.id=id;
		this.name=name;
	}
	
	public static void main(String[] args) {
		
 ThisKeywordExample key=new ThisKeywordExample();
         System.out.println(key.id);
         System.out.println(key.name);
	}

}
