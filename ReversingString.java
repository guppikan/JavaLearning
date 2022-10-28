// Program will print given string as reverse String using String builder 

public class ReversingString {

	public static void main(String[] args) {
		
		// Initializing new String with value  
		String orignalString="guppi";
		
		// newString to hold reversed string 
		String newString= " ";
		
		// ch to capture individual character of reversed string
		char ch;
		
		// Traversing across orignal String
		
		for(int i=0;i<orignalString.length();i++) {
		
		
		ch=	orignalString.charAt(i);
		
		// storing reverse string in new string 
		newString=ch+newString;
		
		}
		
		System.out.println("Printing reversed string :"+newString);

	}

}
