package StringsExample;

public class RemoveSpaces {

	//Remove the spaces from the String
	
	public static void main(String[] args) {
		
		String s="hello  java    lets  practice";
		String s1=" ";
		for(int i =0; i<=s.length()-1;i++) {
			
			if(s.charAt(i)!=' ') {
				s1=s1+s.charAt(i);
			}
		}
		System.out.println(s1);
		
	}
	
	

}
