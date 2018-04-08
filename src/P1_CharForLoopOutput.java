/*
  	ISYS 320
  	Name(s): Derek Stone
  	Date:    April-08-2018
*/

/*
 Your expected results after the input is provided:
 
 1. efg
 2. nopqrs
 3. 
 4. qr
  All predication was correct
 */
public class P1_CharForLoopOutput {

	public static void main(String[] args) {
		printRange('e', 'g');
		printRange('n', 's');
		printRange('z', 'a');
		printRange('q', 'r');

	}
	
	public static void printRange(char startLetter, char endLetter ) {
		for( char letter = startLetter; letter <= endLetter; letter++ ) {
			System.out.print( letter );
		}
		
		System.out.println();
	}

}
