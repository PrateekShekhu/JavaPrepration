package StringsExample;

public class PalindromeString {

	public static void main(String[] args) {
	
		String s1="Maz";
		String pali="";
		for(int i=s1.length()-1; i>=0; i--) {
			
		pali=pali+ s1.charAt(i);	
			
		}
		if(s1.equals(pali)) 
		{
			System.out.println("Its a palindrome");
		}
		
		else {
			System.out.println("Not a palindrome");
		}
		

	}

}
