package StringsExample;


//covert upper to lowerCase we will add 32 or deduct 32 which will give it ASCII value 


public class UpperToLowerViceVersa {

	public static void main(String[] args) {
	char ch='A';
	char ch1='a';
   
	
	//if have to type cast it because it will give int value if we dont typecaste.
	char c=(char)(ch+32);
	System.out.println(c);
	char b=(char)(ch1-32);
	System.out.println(b);
	}

}
