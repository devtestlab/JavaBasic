package JavaBasic;

public class IncrementDecrementOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Inn this program we will see how increment and decrement operators works and how may ways/type are there to use them
		 * 1. Post Increment
		 * 2. Pre Increment
		 * 3. Post Decrement
		 * 4. Pre Decrement
		 * 
		 */
		
		int a = 10;
		System.out.println("Before Post Increment= " + a);

		int b = a+1;
		System.out.println("After Post Increment= " + b);
		
		int c = 10;
		System.out.println("Before Pre Increment= " + c);

		int d = ++c;
		System.out.println("After Pre Increment= " + d);
		
		int p = 10;
		System.out.println("Before Post Decrement= " + p);

		int q = p-1;
		System.out.println("After Post Decrement= " + q);
		
		int r = 10;
		System.out.println("Before Pre Decrement= " + r);

		int s = --r;
		System.out.println("After Pre Decrement= " + s);
		
		
	}

}
