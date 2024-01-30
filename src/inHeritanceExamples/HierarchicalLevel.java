package inHeritanceExamples;

public class HierarchicalLevel {
}
	class F{
		void showF() {
			System.out.println("F classs method");
		}
	}
	
class G extends F{
	void showG() {
	System.out.println("G classs method");
	}
}

class H extends F{
	void showH() {
	System.out.println("H classs method");
}
	}
	class Test2{
	public static void main(String[] args) {
		G objG = new G();
		H objH = new H();
		
		objG.showF();
		objG.showG();
		System.out.println("______________________");
		objH.showF();
		objH.showH();
	}

}
