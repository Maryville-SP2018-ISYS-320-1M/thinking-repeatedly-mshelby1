/*
  	ISYS 320
  	Name(s): Matthew Shelby
  	Date: 3/25/2018
*/

public class P11_TableMakerFlip {

	public static void main(String[] args) {
		for( int rowNumber = 1; rowNumber <= 5; rowNumber++) {
			for( int columnNumber = 1; columnNumber <= 10; columnNumber++ ) {
				System.out.print( (rowNumber * columnNumber ) + "\t");
			}
			System.out.println();
		}
	}

}
// I have tried several different things and I can't figure out how to do this one.