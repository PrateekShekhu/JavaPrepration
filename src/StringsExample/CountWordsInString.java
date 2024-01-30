package StringsExample;


//How to count Count number of words in strng java

public class CountWordsInString {

	public static void main(String[] args) {
		String str="Hello welcome to String logcis";
		int count =1;
		for(int i =0; i<=str.length()-1 ;i++) 
		{
			char words=str.charAt(i);
			
			if(words==' ' && words ==' '+1) {
				count++;	
			}
			
		}
		
		System.out.println(count);

	}

}
