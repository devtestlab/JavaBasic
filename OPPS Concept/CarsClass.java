package OOPSConcept;

public class CarsClass {

	// Class Variables / Global Variables
	int mod;
	int wheel;
			
			
	public static void main(String[] args) {

		/*
		 * Class is collection of data that can be accessed with objects
		 * 
		 *  Class Objects
		 *  c1, c2 and c3 are object representator or we can say object reference variables
		 *  new CarsClass() is the object of class 
		 */	
		
		CarsClass c1 = new CarsClass();
		CarsClass c2 = new CarsClass();
		CarsClass c3 = new CarsClass();
		
		c1.mod = 2015;
		c1.wheel = 4;
		
		c2.mod = 2017;
		c2.wheel = 4;
		
		c3.mod = 2019;
		c3.wheel = 4;
		
		System.out.println("Values before assigned to references");
		
		System.out.println("c1 Data - " + c1.mod);
		System.out.println("c1 Data - " + c1.wheel);
		
		System.out.println("c2 Data - " + c2.mod);
		System.out.println("c2 Data - " + c2.wheel);
		
		System.out.println("c3 Data - " + c3.mod);
		System.out.println("c3 Data - " + c3.wheel);
		
		System.out.println("Values after assigned to references");
		
		c1 = c2;	// c1 is representing c2 so c1 has removed its reference to its own data and now representing to c2's data
		c2 = c3;	// Similarly c2 is representing c3 so c2 has removed its reference to its own data and now representing to c3's data
		c3 = c1;	// Now interesting part is c3 is representing c1 so c3 has removed its reference to its own data and now representing to c1's data which is now representing c2's data 
					// So the output will be like c2's data will be printed twice and then c3 data.
		
		System.out.println("c1 Data - " + c1.mod);
		System.out.println("c1 Data - " + c1.wheel);
		
		System.out.println("c2 Data - " + c2.mod);
		System.out.println("c2 Data - " + c2.wheel);
		
		System.out.println("c3 Data - " + c3.mod);
		System.out.println("c3 Data - " + c3.wheel);
		
		// Now if we assign new data to these object references then they will show new data instead of old one or shuffuled one
		
		c1.mod = 2020;
		c1.wheel = 6;
		
		c2.mod = 2021;
		c2.wheel = 6;

		c3.mod = 2022;
		c3.wheel = 6;
		
		System.out.println("Values with new assigned to references");

		System.out.println("c1 Data - " + c1.mod);
		System.out.println("c1 Data - " + c1.wheel);
		
		System.out.println("c2 Data - " + c2.mod);
		System.out.println("c2 Data - " + c2.wheel);
		
		System.out.println("c3 Data - " + c3.mod);
		System.out.println("c3 Data - " + c3.wheel);
		
		/*
		 * OUTPUT:
		 
			Values before assigned to references
			c1 Data - 2015
			c1 Data - 4
			c2 Data - 2017
			c2 Data - 4
			c3 Data - 2019
			c3 Data - 4
			
			Values after assigned to references
			c1 Data - 2017
			c1 Data - 4
			c2 Data - 2019
			c2 Data - 4
			c3 Data - 2017
			c3 Data - 4
			
			Values with new assigned to references
			c1 Data - 2022
			c1 Data - 6
			c2 Data - 2021
			c2 Data - 6
			c3 Data - 2022
			c3 Data - 6
			
		 */
		
		
		
		
	}

}
