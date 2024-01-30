package StringsExample;

//Find the maximum repeating character in a string


public class MaxRepChar {

	public static void main(String[] args) {
	String s="aabbbbccccc";
	int[] arr=new int[126];
	int max=-1;
	char c=' ';
	for(int i=0;i<=s.length()-1;i++) {
		arr[s.charAt(i)]= arr[s.charAt(i)]+1;
		
	}
	
	for(int i=0;i<=s.length()-1;i++)
	{
		if(max< arr[s.charAt(i)]) 
		{
			max=arr[s.charAt(i)];
			c=s.charAt(i);
		}
	}
	
	System.out.println(c);
	
	}

}
