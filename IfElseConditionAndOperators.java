package JavaBasic;


public class IfElseConditionAndOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * LIST OF AVAILABLE COMPARISION OPERATORS
		 *	==	equal to
		 *	!=	not equal to
		 *	>	greater than
		 *	>=	greater than or equal to
		 *	< 	less than
		 *	<=	less than or equal to
		 *	&&	And Operator
		 *	||	OR Operator
		 */
		
		// Comparison in two values

		int a = 10;
		int b = 20;
		
		if (b>a)
			System.out.println("B is greater than A");
		else
			System.out.println("A is greater than B");

		// Comparison in two values with all operators

		int c = 10;
		int d = 20;
		
		if (c == d)
			System.out.println("C and D are equal");
		if (c != d)
			System.out.println("C and D are not equal");
		if (c < d)
			System.out.println("C is smaller than D");
		if (c > d)
			System.out.println("D is greater than C");
		if (c <= d)
			System.out.println("C is neither greater nor equal to D");
		if (c >= d)
			System.out.println("D is neither greater nor equal to C");

		
		// Nested IF ELSE condition.

		int i = 100;
		int j = 20;
		int k = 30;
		
		if (i>j & i>k)
			System.out.println("I is greatest");
		else if(j>k)
			System.out.println("J is greatest");
		else
			System.out.println("K is greatest");
		
		// AND and OR Operators
		
		int x = 10;
		int y = 20;
		
		if((x == 10) && (y == 20))
			System.out.println("Value of X and Y are true");
		else if ((x == 10) || (y == 10))
			System.out.println("Value of X and Y are not true");
		
		/*
		 * OUTPUT:
			B is greater than A
			C and D are not equal
			C is smaller than D
			C is neither greater nor equal to D
			I is greatest
			Value of X and Y are true

		 */

	}

}
