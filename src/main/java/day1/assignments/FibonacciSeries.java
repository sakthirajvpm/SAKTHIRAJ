package day1.assignments;

public class FibonacciSeries {
	
	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8
	 * output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */
	
	public static void main(String[] args) 
	{
		
		// initialize 3 int variables (Tip: range & firstNum, secNum in the series)
		
				int  SecNum = 1, FirstNum =0 , range =8;
		
		// Iterate from 1 to the range

		System.out.print("First " + range + " terms: ");
			// Print first number 
		
			
			// add first and second number
			for (int i = 1; i <= range ; i++) 
			{
				
			
			
			
			// Assign second number to the first number
				System.out.println(FirstNum );	
				int Sum1 = FirstNum+SecNum;
			// Assign sum to the second number
				FirstNum = SecNum;
				SecNum = Sum1;
		
			}
	
	}
}