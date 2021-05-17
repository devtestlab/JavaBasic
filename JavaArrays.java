package JavaBasic;

public class JavaArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ARRAY: 
		 * Arrays are collection of values of similar data type. 
		 * Values are accessible with help of index values
		 * Lower bound/index value starts with 0
		 * Upper bound/index value ends with n-1 where n is size of array
		 * So far we've seen 1D Array and here we've some advantages
		 * DISADVANTAGE:
		 * 1. Its size is fixed Like static array
		 * Solution : To overcome with this problem we can use Collections, ArrayList, HashTable which is dynamic array
		 * 2. Similar Data Types - It stores similar data types
		 * Solution : To overcome with this problem we can use Object Array
		 */
		
		// 1. int Array
		int a[] = new int[7];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		a[5] = 60;
		a[6] = 70;
		
		System.out.println("First Value from Array= " + a[0]);
		System.out.println("Last Value from Array= " + a[6]);
		System.out.println("Random Value from Array= " + a[2]);
		System.out.println("Random Value from Array= " + a[4]);
		
		System.out.println("****************************************");
		
		// Lets try to print array with for loop
		System.out.println("Printing Integer Array");
		for(int j=0;j<a.length;j++) {
			System.out.println("Array Value= " + a[j]);
		}
		
		System.out.println("****************************************");
		
		// 2. double Array
		double b[] = new double[7];
		b[0] = 10.11;
		b[1] = 20.22;
		b[2] = 30.33;
		b[3] = 40.44;
		b[4] = 50.55;
		b[5] = 60.66;
		b[6] = 70.77;
		
		// Lets try to print array with for loop
		System.out.println("Printing Double Array");
		for(int j=0;j<b.length;j++) {
			System.out.println("Array Value= " + b[j]);
		}
		
		System.out.println("****************************************");

		// 3. Char Array
		char c[] = new char[10];
		c[0] = 'J';
		c[1] = 'A';
		c[2] = 'V';
		c[3] = 'A';
		c[4] = '-';
		c[5] = 'A';
		c[6] = 'R';
		c[7] = 'R';
		c[8] = 'A';
		c[9] = 'Y';
		
		// Lets try to print array with for loop
		System.out.println("Printing Char Array");
		for(int j=0;j<c.length;j++) {
			// Since we are using "System.out.print" it will print in one line
			// But if we use "System.out.println" it will print in next line
			System.out.print(c[j]);
			//System.out.println("Array Value= " + c[j]);
		}
		
		System.out.println("****************************************");
		
		// 4. Boolean Array
		boolean bool[] = new boolean[2];
		bool[0] = true;
		bool[1] = false;
				
		// Lets try to print array with for loop
		System.out.println("Printing Boolean Array");
		for(int j=0;j<bool.length;j++) {
			System.out.println("Boolean Value= " + b[j]);
		}
		
		System.out.println("****************************************");
		
		// 5. String Array
		String str[] = new String[7];
		str[0] = "Hello";
		str[1] = "World";
		str[2] = "Lets Learn Java";
		str[3] = "Then after Selenium";
		str[4] = "Learn Selenium Automation";
		str[5] = "Working on Java";
		str[6] = "Progamming in Java";
				
		// Lets try to print array with for loop
		System.out.println("Printing String Array");
		for(int j=0;j<str.length;j++) {
			System.out.println(str[j]);
		}
		
		System.out.println("****************************************");
		
		
		// 6. Object Array
		Object obj[] = new Object[7];
		obj[0] = 100;
		obj[1] = 200.51;
		obj[2] = "A";
		obj[3] = "Then after Selenium";
		obj[4] = "Special - @#$%^&";
		obj[5] = 399.29;
		obj[6] = true;
						
		// Lets try to print array with for loop
		System.out.println("Printing String Array");
		for(int j=0;j<obj.length;j++) {
			System.out.println(obj[j]);
		}
				
		System.out.println("****************************************");
				
		// Creating exception for array "ArrayIndexOutOfBoundsException"
		// Since array a has max index value is 6 and we are printing 7 means
		// We are trying to print values that doesn't exists in array
		// Commenting the statement to avoid error while compiling
				
		System.out.println("Random Value from Array= " + a[7]);
		
		/*
		 * OUTPUT:
			First Value from Array= 10
			Last Value from Array= 70
			Random Value from Array= 30
			Random Value from Array= 50
			****************************************
			Printing Integer Array
			Array Value= 10
			Array Value= 20
			Array Value= 30
			Array Value= 40
			Array Value= 50
			Array Value= 60
			Array Value= 70
			****************************************
			Printing Double Array
			Array Value= 10.11
			Array Value= 20.22
			Array Value= 30.33
			Array Value= 40.44
			Array Value= 50.55
			Array Value= 60.66
			Array Value= 70.77
			****************************************
			Printing Char Array
			JAVA-ARRAY****************************************
			Printing Boolean Array
			Boolean Value= 10.11
			Boolean Value= 20.22
			****************************************
			Printing String Array
			Hello
			World
			Lets Learn Java
			Then after Selenium
			Learn Selenium Automation
			Working on Java
			Progamming in Java
			****************************************
			Printing String Array
			100
			200.51
			A
			Then after Selenium
			Special - @#$%^&
			399.29
			true
			****************************************
			Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7 at JavaBasic.JavaArrays.main(JavaArrays.java:143)

		 */
		
	}

}
