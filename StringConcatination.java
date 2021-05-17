package JavaBasic;

public class StringConcatination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * "System.out.print" will be used to print all statements in single line. 
		 * No matter how many lines or statements will be printed with this method, they all will come in same line like a paragraph
		 * 
		 * "System.out.println" will be used to print new lines.
		 * All the time so every statement printed with println will comes in next line
		 * 
		 */
		
		int a = 1000;
		int b = 2000;
		
		String x = "Java";
		String y = "Selenium";
		
		double p = 10.40;
		double q = 100.300;
		
		System.out.println(a + b);
		System.out.println(x + y);
		
		System.out.println(a + b + x + y);
		System.out.println(x + y + a + b);
		
		System.out.println((a+ b)+ x + y);
		System.out.println(a + b + (x + y));
		
		System.out.println(a +  a + b + b + x + y + a + b);
		
		System.out.println(p + q + a + b);
		System.out.println(p + q + x + y);
		
		System.out.println(p + q + a + b + x + y);
		
		System.out.println(p + q + a + a + b + b + x + y + a + b);
		
		System.out.println(p + q + a + b +(x + y));
		System.out.println(p + q + a + b + (x + y));
		
		
		// Now work with statements
		System.out.println("This is value of a " + a);
		System.out.println("This is value of b " + b);
		
		System.out.println(x + " " + a);
		
		System.out.print("This is Single line statement with no new line");
		System.out.println("This is new line will be printed in new line ");
		
		// String
				// String is not a data type instead a class
				// It can store a line instead of chars
		String s1 = "Hello Testing";
		System.out.println("Value String s1 = " + s1);
		String s2 = "Selenium Testing";
		System.out.println("Value String s2 = " + s2);
		String s3 = "This is Java Selenium combination";
		System.out.println("Value String s3 = " + s3);
		String s4 = "1000";
		System.out.println("Value String s4 = " + s4);
		String s5 = "300.40";
		System.out.println("Value String s5 = " + s5);
		String s6 = "First String case! This is 1000 line code";
		System.out.println("Value String s6 = " + s6);
		
		System.out.print(s1 + " " + 
				s2 +  " " +
				s3 +  " " + 
				s4 +  " " + 
				s5 +  " " + 
				s6);
		System.out.println("\n");
		
		System.out.println(s1 + " " + 
				s2 +  " " +
				s3 +  " " + 
				s4 +  " " + 
				s5 +  " " + 
				s6);
		
		/*
		 * OUTPUT:
		 * 3000
		 * JavaSelenium
		 * 3000JavaSelenium
		 * JavaSelenium10002000
		 * 3000JavaSelenium
		 * 3000JavaSelenium6000
		 * JavaSelenium10002000
		 * 3110.7110.7JavaSelenium
		 * 3110.7JavaSelenium
		 * 6110.7JavaSelenium10002000
		 * 3110.7JavaSelenium
		 * 3110.7JavaSelenium
		 * This is value of a 1000
		 * This is value of b 2000
		 * Java 1000
		 * This is Single line statement with no new lineThis is new line will be printed in new line 
		 * Value String s1 = Hello Testing
		 * Value String s2 = Selenium Testing
		 * Value String s3 = This is Java Selenium combination
		 * Value String s4 = 1000
		 * Value String s5 = 300.40
		 * Value String s6 = First String case! This is 1000 line code
		 * Hello Testing Selenium Testing This is Java Selenium combination 1000 300.40 First String case! This is 1000 line code
		 * Hello Testing Selenium Testing This is Java Selenium combination 1000 300.40 First String case! This is 1000 line code
		 * Hello Testing Selenium Testing This is Java Selenium combinaton 1000 300.40 First String case! This is 1000 line code
		 */
				
		
	}

}
