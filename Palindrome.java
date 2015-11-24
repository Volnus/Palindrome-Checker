import java.util.Scanner;
//------------------------------------------------------------------//
// Scott Hartley
// Palindrome.java
// Progamming 1
// 11/23/2015
// This program determines if something is or is not a Palindrome.
//------------------------------------------------------------------//
public class Palindrome {
	public static void main (String [] args) {
		String input;
		boolean answer = true;
		
		//New Scanner
		Scanner keyboard = new Scanner (System.in);

		// Ask For The Word And Store It
		System.out.println("Please Enter a Word");
		input = keyboard.nextLine(); 
		
		// Call Method Thingy
		answer = getPalindrome(input);
		
		// Close The Scanner
		keyboard.close();
	}
	
	//-------------------------------------------------------//
	// This method does the magic... 
	// The method checks the letter essentially from both sides and says its equal until it reaches the middle letter.
	// @param  String Input, 
	// @return True/False/Statements to match thingys
	//-------------------------------------------------------//
	public static boolean getPalindrome( String input ) {
		int n = input.length();
		for (int i = 0; i < (n/2) + 1; i++){
			if (input.charAt(i) != input.charAt(n - i - 1)){				
				System.out.println("This is not a palindrome");				
				return false;
			}
		}
	System.out.println("This is a palindrome");
	return true;	
	}
}
