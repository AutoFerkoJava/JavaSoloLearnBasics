package L2ConditionalandLoops;

public class L5LogicalOperators {

	public static void main(String[] args) {

		/*
Logical operators are used to combine multiple conditions.
Let's say you wanted your program to output "Welcome!" 
only when the variable age is greater than 18 and the variable money is greater than 500.
One way to accomplish this is to use nested if statements:*/
		int age = 22;
		int money = 800;

		if (age > 18) {
			if (money > 500) {
				System.out.println("Welcome!");

				//However, using the AND logical operator (&&) is a better way:

			}	
		}

	}
	
}
/* //However, using the AND logical operator (&&) is a better way:
 * public static void main1(String[] args) {
 	int age = 22;
		int money = 800;
		if (age > 18 && money > 500) {
			System.out.println("Welcome2!");
			//If both operands of the AND operator are true, then the condition becomes true.
 */
	