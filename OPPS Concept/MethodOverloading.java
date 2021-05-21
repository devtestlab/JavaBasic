package OOPSConcept;

public class MethodOverloading {
	
	/*
	 * 
		Method overloading
		Method overloading is using multiple methods in program but with same name. Function will perform action, but all functions will be differentiated with number of arguments. Below mentioned two points are not possible
		a.	Method inside a method is not possible
		b.	Method with same name or number of arguments of same data type are not possible

		Possible :
		a.	Main method overloading is possible just need to mention different type of data types and number of parameters in
		b.	Same method name with same number of argument/parameter is also possible but data type of parameter needs to be different

	 */

	public static void main(String[] args) {

		// Now let's see how method overloading works in real
		MethodOverloading obj = new MethodOverloading();
		
		// SUM Method overloading with different arguments
		obj.sum();
		obj.sum(10);
		obj.sum(10,5);
		obj.sum(1000.500);
		
		// MAIN Method overloading with different arguments		
		obj.main(100);
		obj.main(100, 20);
	}
	
	public void sum(){
		System.out.println("Sum Method – with 0 Parameter");
	}
	
	public void sum(int i){
		System.out.println("Sum Method – with 1 Parameter");
		System.out.println("Single Value - " + i);
	}
	
	public void sum(double i){
		System.out.println("Sum Method – with 1 Parameter");
		System.out.println("Single Value - " + i);
	}
	
	public void sum(int a, int b){
		System.out.println("Sum Method – with 2 Parameter");
		System.out.println("Multiplication of Two Value - " + a*b);
		System.out.println("Division of Two Value - " + a/b);
		int c = a + b;
		System.out.println("Addition of Two Value - " + c);
	}
	// main method overloading is possible just need to mention different type of data types and number of parameters in
	
	public static void main (int a){
		System.out.println("Main Method – with 1 Parameter");
		System.out.println("Single Value - " + a);
		System.out.println("Multiplication of Single Value - " + a*a);
		int c = a + a;
		System.out.println("Addition of Two Value - " + c);
		System.out.println("Addition of Single Value - " + c);
	}
	
	public static void main (int a, int b){
		System.out.println("Main Method – with 2 Parameter");
		System.out.println("Multiplication of Two Value - " + a*b);
		System.out.println("Division of Two Value - " + a/b);
		int c = a + b;
		System.out.println("Addition of Two Value - " + c);
	}
	
	/*
	 * OUTPUT
		
		Sum Method – with 0 Parameter
		
		Sum Method – with 1 Parameter
		Single Value - 10
		
		Sum Method – with 2 Parameter
		Multiplication of Two Value - 50
		Division of Two Value - 2
		Addition of Two Value - 15
		
		Sum Method – with 1 Parameter
		Single Value - 1000.5
		
		Main Method – with 1 Parameter
		Single Value - 100
		Multiplication of Single Value - 10000
		Addition of Two Value - 200
		Addition of Single Value - 200
		
		Main Method – with 2 Parameter
		Multiplication of Two Value - 2000
		Division of Two Value - 5
		Addition of Two Value - 120

	 */


}
