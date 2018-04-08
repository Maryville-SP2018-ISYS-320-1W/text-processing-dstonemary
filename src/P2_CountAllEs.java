import java.util.Scanner;

/*
	ISYS 320
	Name(s): Derek Stone
	Date:    April-08-2018
*/

/* 2. Your pseudocode algorithm in here
 Enter input of string
 for(each character of string)
 	if("e" equals ""+character)
 		increment count of e's letter
 */


public class P2_CountAllEs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in );
		System.out.println("Enter a string? ");
		String str = input.nextLine();
		int eCount = 0;
		System.out.println(str.length());
		for(int i = 0; i < str.length(); i++){
			if("e".equalsIgnoreCase(""+str.charAt(i))){
				eCount++;
			}			
		}
		System.out.println("Total number of e's is "+eCount);
	}

}
