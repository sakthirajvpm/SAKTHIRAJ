package day2.classroom.arrays;

public class PrintDuplicates {

	
	public static void main(String[] args) {

		// Here is the input
		int[] data= {1,3,8,3,11,5,6,4,7,6,7};

		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Loop through each array item
		 3) If the consecutive array items are same -> then print as duplicates
		 */
		
		
		System.out.println("Duplicate elements in given array: ");  
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				if (data[i] == data[j]) {
					System.out.println(data[j]);  
					
				}  
			}
			
		}
		
		
		
		
		// Print the second largest number	
		
		
	}

}
