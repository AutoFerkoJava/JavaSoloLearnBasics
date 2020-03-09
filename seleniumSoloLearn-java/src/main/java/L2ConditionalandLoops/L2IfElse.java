package L2ConditionalandLoops;

public class L2IfElse {

	public static void main(String[] args) {
		
		/*
		 * An if statement can be followed by an optional else statement, 
		 * which executes when the condition evaluates to false.
For example:
		 */
		int age = 30;
		if (age < 16) {
			System.out.println("Too Young");
		} else { 
			System.out.println("Welcome!");
			
			//As age equals 30, the condition in the if statement evaluates 
			//to false and the else statement is executed.
		}
	}

}


/*
int x = 10;  int y = 5;
 if
  ( x > y ) {
  System.out.println(x);
}
 else
  {
  System.out.println(y);
}
 */ 
