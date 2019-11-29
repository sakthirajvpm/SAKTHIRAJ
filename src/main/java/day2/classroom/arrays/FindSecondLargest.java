package day2.classroom.arrays;

import java.util.Arrays;

public class FindSecondLargest {

	
	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,11,4,6,7};

		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the last but one and print
		 */
		
		
		
		Arrays.sort(data);
				int k =data [data.length-1];
		
		System.out.println("the first largest number is"   + k);
		Arrays.sort(data);
		int L =data [data.length-2];
		System.out.println("the secon largest  number is"   + L);
		
		// Print the second largest number	
		
		
	}

}
