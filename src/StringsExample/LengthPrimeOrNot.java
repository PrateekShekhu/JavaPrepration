package StringsExample;

public class LengthPrimeOrNot {

	public static void main(String[] args) {
		int count =0;
		String s="hsaj";
		for(int i=1;i<s.length();i++) 
		{
		if(s.length()%i ==0) 
		{
		count++;	
		}
	}
		
		if(count==2) {
			System.out.println("Prime");
			
		}else {
			System.out.println("not prime");
		}
		

	}

}
