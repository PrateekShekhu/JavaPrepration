package StringsExample;

public class StringFunctions {

	public static void main(String[] args) {
		
	String s1= "This is demo";	
	// Replace() method
	//System.out.println(s1.replace("is", "was"));

	//replaceFirst() method
	//System.out.println(s1.replaceFirst("is", "was"));
	
	//replaceAll() method
	
	//System.out.println(s1.replaceAll("is", "was"));
 	
	
	// Yahan pe replaceAll method spaces ko remove kar dega and regex ki trha chlega.
	//System.out.println(s1.replaceAll("is(.)", "was")) ;
	
	
	// Yahan pe replaceAll method first is ko replace krega and baki ki string ko remove he kar dega.
	//System.out.println(s1.replaceAll("is(.*)", "was"));
	
	
	//indexOf() method return integer value
	//System.out.println(s1.indexOf('d'));
	
	//lastIndexOf() return integer value
	//System.out.println(s1.lastIndexOf('m'));
	
	
	//charAt() return String value
	String s="Hello";
	System.out.println(s.charAt(4));
	
	
	//contains() method return boolean value
	System.out.println(s.contains("H"));
	
	int a =10, b=20;
	
	String s3= String.valueOf(a);
	System.out.println(s3);
	
	}

}
