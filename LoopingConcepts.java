package JavaBasic;

public class LoopingConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * We will study for two loops here:
		 * 1. While Loop
		 * 2. For Loop
		 * 
		 * Loops contains three important parts 
		 * a. Initialization
		 * b. Condition
		 * c. Incremental/Decremental
		 * 
		 * 
		 * WHILE: - In While loops we've three parts in separate lines which increase the line code. It also has dis-advantage that if we miss incremental/decremental part then loop will be turned into infinite loop and program will stuck forever.
		 * 
		 * FOR: - For loop is better than WHILE and in for loop we declare all parts in same line which reduce he line of code
		 * 
		 * Below in program you will notice that incremental/decrementatl values are used in two ways
		 * i.  x = x+1
		 * ii. x++
		 * both ways are correct till time you will use increase variable value by 1. You will have to change value by significant number such as to print even numbers you've to use x=x+2. In that case x++ will not work as it suppose to increase value by 1 only.
		 */
		
		// WHILE LOOP
		// Incremental process
		int a = 1;
		System.out.println("WHILE LOOP FOR INCREMENTAL WAY OF PRINTING");
		while(a <= 10) {
			System.out.println(a);
			a++;
		}

		// Decremental process
		int b = 10;
		System.out.println("WHILE LOOP FOR DECREMENTAL WAY OF PRINTING");
		while(b >= 1) {
			System.out.println(b);
			b--;
		}

		// FOR LOOP
		// Incremental process
		System.out.println("FOR LOOP FOR INCREMENTAL WAY OF PRINTING");
		for(int x =1; x<=10; x=x+1) {
			System.out.println(x);
		}

		// Decremental process
		System.out.println("FOR LOOP FOR DECREMENTAL WAY OF PRINTING");
		for(int x =10; x>=1; x--) {
			System.out.println(x);
		}		
		
		
	}

}
