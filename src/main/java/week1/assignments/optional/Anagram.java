package week1.assignments.optional;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		       //Declare a String 
				String text1 = "stop";
				//Declare another String
				String text2 = "pots";
				boolean Status = true;
				//build logic to check the given words are anagram or not
				if (text1.length() != text2.length())
				{
					Status = false;
					
				}		
				else 
				{
				char[] Arraytext1 = text1.toLowerCase().toCharArray();  
	            char[] Arraytext2 = text2.toLowerCase().toCharArray();  
				;
				Arrays.sort(Arraytext1);
				Arrays.sort(Arraytext2);
				Status =Arrays.equals(Arraytext1 , Arraytext2);
				} 
				
					 if (Status) {  
				            System.out.println(text1 + " and " + text2 + " are anagrams");  
				        } else {  
				            System.out.println(text1 + " and " + text2 + " are not anagrams");  
				        }  
					
				}
}
				
				
				/*
				 * Pseudo Code
				 * a) Check length of the strings are same then
				 * b) Convert both Strings in to characters
				 * c) Sort Both the arrays
				 * d) Check both the arrays has same value
				 * */
				
				
				
	

	


