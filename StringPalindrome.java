public class StringPalindrome {

	
	// To check string palindrome
	
	
	public static boolean isPalindrome(String str) {
		
		// Initialize 2 pointer for start and end  of string 
	      
		int i = 0;
		int j =str.length()-1;
		
		// start comparing string by movine pointers
		
		while(i<j) {
			
			// checking for mismatch
			if(str.charAt(i)!=str.charAt(j)) 
				return false;
			
			// increment i and decrement j 
			
			i++;
			j--;
			
		}
		return true;
		
	}
	
	
	public static void main(String[] args) {
	
       String str ="malayalam";
       
       String lowerCase=str.toLowerCase();
       
      boolean result= isPalindrome(lowerCase);
      
      System.out.println("Is given string palindrome ? :"+result);


	}

}
