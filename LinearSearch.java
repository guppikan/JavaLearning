// This program creates  linear search algorithm 


public class LinearSearch {
	
	// method checks for linear with array and traget element to find 

	static int linearSearch(int[] arr, int target) {
		
		// Checking if array length is 0 or not
		if (arr.length==0) {
			return -1;
		}
		// Traversing  across the loop 
		for (int i=0;i<arr.length;i++) {
			
			int element=arr[i];
			
			if(element==target) {
				return i;
			}
			
		}	
		
		
		// -1 is returned if target element is not found
		
		return -1;
	}
	
	
 static int linearSearch2(int[] arr, int target) {
		
		// Checking if array length is 0 or not
		if (arr.length==0) {
			return -1;
		}
		// Traversing  across the loop enhanced for loop 
		
		for(int element:arr) {
			if(element==target) {
				return element;
			}
		}
		return Integer.MAX_VALUE;
			
		}
	// main method 
	
	public static void main(String[] args) {
		
		int[] nums = {10,20,39,45, 67, 86,11};
        
		int traget =86;
		
		// Calling linearSearch() method
		
		int searchResult=linearSearch(nums,traget);
		System.out.println(searchResult);
		
		int searchResult2=linearSearch2(nums,traget);
		System.out.println(searchResult2);

		
	}

}
