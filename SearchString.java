import java.util.Arrays;

public class SearchString {
	
	
	static boolean searchString(String str, char traget) {
		
	     if(str.length()==0) {
	    	 return false;
	     }
	     // using enhanced for loop 
	     
	     for(char ch:str.toCharArray()) {
	    	 if(ch==traget) {
	    	 return true;
	    	 }
	     }
	     
	     // If no char is found in the string 
	     return false;
	}
	
	
	// Search string using normal for loop 
	
	static boolean searchString2(String str, char traget) {
		
	     if(str.length()==0) {
	    	 return false;
	     }
	     // using normal for loop 
	     
	     for(int i=0;i<str.length();i++) {
	    	 if(traget==str.charAt(i)) {
	    	 return true;
	    	 }
	     }
	     
	     // If no char is found in the string 
	     return false;
	}
	

	public static void main(String[] args) {
		String str ="guruprasadraju";
		char target='d';
		char target2='k';
		boolean boo=searchString(str,target);
		
		// Using searchString2() method
		boolean boo2=searchString2(str,target2);
		
		System.out.println(boo);
		System.out.println("***********************");
		System.out.println(boo2);
		System.out.println("************************");
		// converting arrays to toString()
		System.out.println(Arrays.toString(str.toCharArray()));
	}

	
}
