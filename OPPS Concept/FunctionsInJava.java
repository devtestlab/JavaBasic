package OOPSConcept;

public class FunctionsInJava {

	/*
	Functions in Java – Non-Static functions
	Functions and methods are same it’s just a term used in different languages.
	Main method is the important function in the java as programs starts completion from this function.
	
	Classes of Methods:
	a.	Static Method 
	b.	Non-Static Methods
	
	Types of methods:
	a.	No Input No output (void can be used in this case)
	b.	No Input and still some output (Data type must be defined while declaration)
	c.	Pass some input and get some output (Data type must be defined while declaration)
	
	Facts:
	a.	Always starts from main method so it should declare first
	b.	Void – doesn’t return any value
	c.	In case if method is returning any value then the function type should be same type as int, String etc.
	d.	Values can be assigned inside the methods or by-passing values in the arguments
	*/
	// Main method is starting point of execution
	public static void main(String[] args) {
		
		FunctionsInJava obj = new FunctionsInJava();
		// One object will be created, obj is the reference variable as mentioned and referring to this object.
		// Once object of class is created. All non-static methods are created outside main function will be given to this object
		
		obj.NoInNoOut();
		
		int output = obj.NoInButOut();
		System.out.println(output);
		
		String strval = obj.str();
		System.out.println(strval);
		
		int multival = obj.InAnOut(10, 20);
		System.out.println(multival);
		
		/*
		 OUTPUT:
			No Input No Output Method
			No Input But still some Output
			30
			String Method has string retrun type
			Java is great with Selenium
			This method will accept inputs and retruns output based on operation perfromed
			200

		 */
	}
	
	// Non-Static methods
	// No Input No output (void can be used in this case)
	public void NoInNoOut() {
		System.out.println("No Input No Output Method");
	}
			
	// Return Type = int
	// No Input and still some output (Data type must be defined while declaration)
	public int NoInButOut() {
		System.out.println("No Input But still some Output");
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}
	
	// Return Type = String
	// No Input and still some output (Data type must be defined while declaration)
	public String str() {
		System.out.println("String Method has string retrun type");
		String s = "Java is great with Selenium";
		return s;
	}
	
	
	// Return Type = int
	// Pass some input and get some output (Data type must be defined while declaration)
	public int InAnOut(int x, int y) {
		System.out.println("This method will accept inputs and retruns output based on operation perfromed");
		int exe = x * y;
		return exe;
	}
}

