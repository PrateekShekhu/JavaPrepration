package StringsExample;

public class DuplicateChar {

	//Find the duplicate character
	
	
	public static void main(String[] args) {
			String s="prateeek";
			char[] ch=s.toCharArray();
			char c=' ';
			int count=0;
			for(int i=0;i<=s.length()-1;i++) 
			{
			
			
			for(int j=i+1;j<=s.length()-1;j++) 
			{
				if(ch[i] ==ch[j]) 
				{
					count++;
					System.out.println(ch[j]+"    "+ count);
				}
			}
		}
	}

}
