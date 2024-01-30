package StringsExample;

public class DisplaySymbols {

	public static void main(String[] args) {
			String s="@shs#j*sha$ssj%";
			char a=' ';
			for(int i=0; i<=s.length()-1;i++) {
				 a=s.charAt(i);
				
				if(!(a>='a'&&a<='a' ||a>='A'&&a>='Z' ||a>='0' &&a<='9'))
				{
					System.out.print(a);
				}
			}
			

	}

}
