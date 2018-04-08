/*
  	ISYS 320
  	Name(s): Derek Stone
  	Date:    April-08-2018
*/

import java.util.Scanner;

public class P4_LongestInputString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in );
		
		System.out.print("How many words will you enter? ");
		int numOfWords = input.nextInt();
		String longStr = "";
		for(int i = 1; i <= numOfWords; i++){
			System.out.print("Enter word " + i + ": ");
			String word = input.next();
			if(longStr.length() <= word.length())
				longStr = word;
		}
		
		System.out.print("The longest word was "+longStr );
	}
	
}
