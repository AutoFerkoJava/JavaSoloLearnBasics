package L2ConditionalandLoops;

public class L10doWhile {

	public static void main(String[] args) {
		// A do...while loop is similar to a while loop, except that a do...while loop 
		//is guaranteed to execute at least one time.
		//Example:
		int x = 1;
		do {
			System.out.println(x);
			x++;
		} while(x < 5); //Output 1 2 3 4 
	}
}
//Notice that in do…while loops, the while is just 
//the condition and doesn't have a body itself.

