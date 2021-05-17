package JavaBasic;

public class TwoAndThreeDimArray {

	public static void main(String[] args) {
		/*
		 * Two Dimensional array is kind of a matrix that stores values in form of row and column
		 * The Row contains first array index values
		 * And column contains the second index values
		 * String X[] = new String[3][3]
		 * Size of the 2D Array will be multiple of both values mentioned above.
		 * 
		 * Down Below you will also see 3D array as well where we've used rows, columns and height of array and displayed it's values using for loop
		 * Similarly it is possible to use 4D array and so on, but we've to use the matrix values in same way as for 3D except [] count will be for.
		 * Keep that in mind as soon as we increase [] count more complex the array will become and more complexity with take more time and analysis to understand how it works.
		 */
		
		String x[][] = new String[3][5];
		
		System.out.println("TOTAL ROWS= " + x.length);		// This will show total no. of Rows
		System.out.println("TOTAL COLUMNS= " + x[0].length);	// This will show total no. of Columns
		
		// Enter values to 2D Manually
		
		// Entering data in First Row
		x[0][0] = "First";
		x[0][1] = "Second";
		x[0][2] = "Third";
		x[0][3] = "Fourth";
		x[0][4] = "Fifth";
		
		// Entering data in Second Row
		x[1][0] = "Sixth";
		x[1][1] = "Seventh";
		x[1][2] = "Eight";
		x[1][3] = "Ninth";
		x[1][4] = "Tenth";
		
		// Entering data in Third Row
		x[2][0] = "Eleventh";
		x[2][1] = "Twelfth";
		x[2][2] = "Thirteen";
		x[2][3] = "Fourteen";
		x[2][4] = "Fifteen";
		
		System.out.println("This will print all values from 2D array");
		for(int row=0;row<x.length;row++) {			// Checking Rows with a
			for(int col=0;col<x[row].length;col++)		// Checking Columns with b
				System.out.println(x[row][col]);	// Printing values using 2D name that is 'x' and their respective index values that are 'row' and 'col'
		}
		
		// INITIALISATION OF 3D ARRAY WITH 3 INDEXES
		
		int a[][][] = new int[3][3][3];
		
		// Rows
		// Row 1
		a[0][0][0]=1;
		a[0][0][1]=2;
		a[0][0][2]=3;

		// Row 2
		a[0][1][0]=4;
		a[0][1][1]=5;
		a[0][1][2]=6;
		
		// Row 3
		a[0][2][0]=7;
		a[0][2][1]=8;
		a[0][2][2]=9;
		
		// Columns
		// Col 1
		a[1][0][0]=10;
		a[1][0][1]=11;
		a[1][0][2]=12;
		
		// Col 2
		a[1][1][0]=13;
		a[1][1][1]=14;
		a[1][1][2]=15;
		
		// Col 3
		a[1][2][0]=16;
		a[1][2][1]=17;
		a[1][2][2]=18;
		
		// Heights
		// Height 1
		a[2][0][0]=19;
		a[2][0][1]=20;
		a[2][0][2]=21;
		
		// Height 2
		a[2][1][0]=22;
		a[2][1][1]=23;
		a[2][1][2]=24;
		
		// Height 3
		a[2][2][0]=25;
		a[2][2][1]=26;
		a[2][2][2]=27;
		
		System.out.println("PRINTING 3D ARRAY WITH FOR LOOP");
		for(int row=0;row<a.length;row++) {
			for(int col=0;col<a[0][0].length;col++) {
				for(int hig=0;hig<a[0].length;hig++) {
					System.out.println(a[row][col][hig]);
				}
			}
		}
				
		/*
		 * OUTPUT:
			TOTAL ROWS= 3
			TOTAL COLUMNS= 5
			This will print all values from 2D array
			First
			Second
			Third
			Fourth
			Fifth
			Sixth
			Seventh
			Eight
			Ninth
			Tenth
			Eleventh
			Twelfth
			Thirteen
			Fourteen
			Fifteen
			PRINTING 3D ARRAY WITH FOR LOOP
			1
			2
			3
			4
			5
			6
			7
			8
			9
			10
			11
			12
			13
			14
			15
			16
			17
			18
			19
			20
			21
			22
			23
			24
			25
			26
			27

		 */

	}

}
