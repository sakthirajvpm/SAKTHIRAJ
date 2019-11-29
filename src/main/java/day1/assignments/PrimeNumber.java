package day1.assignments;

public class PrimeNumber {
	
	/*
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13
	 * output: 13 is a Prime Number
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */
	
	public static void main(String[] args) {

		// Declare an int Input and assign a value
		int remainder;
		// Declare a boolean input as flag
		boolean isPrime = true;
		int range = 13;
		
		// Iterate from 1 to half of the input
		for (int i = 2; i <=range/2; i++) 
		{
		remainder = range%i;
		System.out.println(range+" Divided by "+ i + " gives a remainder "+remainder);
		if(remainder==0) 
		{
			isPrime=false;
			break;
		}
		} 
		if(isPrime)
			System.out.println(range + "is a prime number");
		else
			System.out.println(range + "is not a prime number");
		
			// Divide the input with each for loop variable and check the remainder
			
				// Set the flag as true when there is no remainder
				
				// break the iterator
				
		// Check the flag (Provide a condition)
		
			// Print 'Prime' when the condition matches
			
			// Print 'Not a Prime' when the condition doesn't match 
			
		

	}
}

