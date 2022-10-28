
// Program will showcase functions which are used in  String class

public class StringTest {

	public static void main(String[] args) {
		
		String str1 = "guru";
		String str2 = "raju";
		
		String thirdString = str1+str2 ;
		
		// Adding/Concatenating  2 strings
		
		System.out.println("adding 2 strings :"+thirdString);
		
		System.out.println("************************");
		
		// checking if both strings are equal 
		
	   boolean result = str1.equals(str2);
	   
	   System.out.println(" the result of str1 equalls to str2 is :"+result);
	   
	   System.out.println("************************");
	   
	   // comparing both strings 
	   
	  int comparingResult= str1.compareToIgnoreCase(str2);
	  
	  System.out.println("str1 compared to str2 :"+comparingResult);
	  
	  System.out.println("************************");
	  
	  
	  // Printing string from and to index
	  
	 String subStringWithIndex= thirdString.substring(0,3);
	 
	 System.out.println("Printing formatted string with index:"+subStringWithIndex);
	 
	 System.out.println("************************");
	  
	 
	 // Checking if string contains a letter or not 
	 
	boolean containsResult= thirdString.contains("z");
	
	System.out.println("Checking if given string contains the char or not :"+containsResult);
	 
	System.out.println("************************");

	}

}
