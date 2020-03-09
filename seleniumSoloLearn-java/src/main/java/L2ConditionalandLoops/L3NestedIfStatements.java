package L2ConditionalandLoops;

public class L3NestedIfStatements {

	public static void main(String[] args) {
		// You can use one if-else statement inside another if or else statement.
		//For example:
		int age = 25;
		if(age > 0) {
			if(age > 16) {
				System.out.println("Welcome!");
			} else {
				System.out.println("Too Young");
			}
		} else {
			System.out.println("Error");
		}
		//Outputs "Welcome!"
		//You can nest as many if-else statements as you want.

		int x = 37;
		if (x > 22) {
			if (x > 31) 
			{System.out.println("it works!");
			}
		}
	}

}
