package OOPSConcept;

public class GlobalAndLocalVars {
	
	/*
		Local var v/s Global var
			a. Local Var - Local variables are those variables whose scope is limited to function or class.
				We can’t use them outside a function
			b. Global Var – Global variables are defined after class declaration and
				these are accessible to entire program on in same class including all methods
	 */
	
	// GLOBAL VARIABLES
	String name = "Java Selenium";
	int no = 100;
	

	public static void main(String[] args) {
		
		// LOCAL VARIABLES
		int i = 200;
		System.out.println("Here we've Local Variable i = " + i);

		// ACCESS GLOBAL VARIABLES
		System.out.println("Values printed from Main Method");
		GlobalAndLocalVars obj = new GlobalAndLocalVars();
		System.out.println(obj.name);
		System.out.println(obj.no);
		
	}

	public void sum() {
		// LOCAL VARIABLES FOR SUM METHOD
		// It is not possible to use main method's i variable in this method and vice versa
		// Same goes for Global variables as well. They can be accessed only if we create their object reference and access them
		
		int i = 30;
		int j = 20;
		int age = 20;

	}
	
	/*
	 * OUTPUT
		Here we've Local Variable i = 200
		Values printed from Main Method
		Java Selenium
		100
	 */
}
