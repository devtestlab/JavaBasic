package JavaBasic;

public class DataTypes {

	// main () method is used to execute your program so it must be available in program
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * PRIMITIVE DATATYPES
		 * int
		 * char
		 * double
		 * boolean
		 */
		
		// Integer Values
		// Each variable should be unique because one variable can't hold two different values in one scope
		int i = 10;
		System.out.println("Value Integer i = " + i);
		int j = 20;
		System.out.println("Value Integer j = " + j);
		int k = 30;
		System.out.println("Value Integer k = " + k);
		
		// Addition
		System.out.println(i + j + k);
		
		// Subtraction
		System.out.println(i - j + k);
		
		// Multiplication
		System.out.println("Multiplication " + i * j * k);
		
		//Division
		System.out.println("Division " + k / i);
	
		// Double Values
		// Double values stores decimal values unlike integer
		double a = 10.21;
		System.out.println("Value Double a = " + a);
		double b = 230.288;
		System.out.println("Value Double b = " + b);
		double c = 104.9;
		System.out.println("Value Double c = " + c);
		double d = 104.1;
		System.out.println("Value Double d = " + d);

		// Addition
		System.out.println(a + b + c + d);
				
		// Subtraction
		System.out.println(a - b - c - d);
				
		// Multiplication
		System.out.println("Multiplication " + a * b * c * d);
				
		//Division
		System.out.println("Division " + (a / b )/ (c / d));
		
		// Char Values
		// Char values are used to store characters values.
		// Char always stores single char values so we can't store values like 'aa'
		char v1 = 'a';
		System.out.println("Value Char v1 = " + v1);
		char v2 = '1';
		System.out.println("Value Char v2 = " + v2);
		char v3 = 'A';
		System.out.println("Value Char v3 = " + v3);
		char v4 = 'f';
		System.out.println("Value Char v4 = " + v4);
		char v5 = '@';
		System.out.println("Value Char v5 = " + v5);
		
		// Boolean
		// Boolean is used to store true of false values
		boolean b1 = true;
		System.out.println("Value Boolean b1 = " + b1);
		boolean b2 = false;
		System.out.println("Value Boolean b2 = " + b2);
		
		// String
		// String is not a data type instead a class
		// It can store a line instead of chars
		String s1 = "Hello Testing";
		System.out.println("Value String s1 = " + s1);
		String s2 = "Selenium Testing";
		System.out.println("Value String s2 = " + s2);
		String s3 = "This is Java Selenium combinaton";
		System.out.println("Value String s3 = " + s3);
		String s4 = "1000";
		System.out.println("Value String s4 = " + s4);
		String s5 = "300.40";
		System.out.println("Value String s5 = " + s5);
		String s6 = "First String case! This is 1000 line code";
		System.out.println("Value String s6 = " + s6);
		
		System.out.println(s1 + " " + 
							s2 +  " " + 
							s3 +  " " + 
							s4 +  " " + 
							s5 +  " " + 
							s6);

	}

}
