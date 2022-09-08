
// This program checks for palindrome 


class Palindrome{
	public static void main (String[] args){
                // Declaring variables  
		int remainder;
		int sum=0;
		int temp;
		int number = 454;

		temp=number;

		while(number>0){
			remainder=number%10;
                        
			sum=(sum*10)+remainder;
			number=number/10;

		}
		if(temp==sum)
			System.out.println("Palindrome number");
		else{
			System.out.println("Not Palindrome number");
			}
		}
}	
