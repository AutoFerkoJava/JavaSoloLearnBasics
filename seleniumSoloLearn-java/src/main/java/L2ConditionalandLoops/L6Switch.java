package L2ConditionalandLoops;

public class L6Switch {

	public static void main(String[] args) {

		//A switch statement tests a variable for equality against a list of values. 
		//Each value is called a case, and the variable being switched on 
		//is checked for each case.
		//Syntax:

		//The example below tests day against a set of values and 
		//prints a corresponding message.
		int day = 3;
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;

			//You can have any number of case statements within a switch. 
			//Each case is followed by the comparison value and a colon.
		}
		
		/*
The default Statement
A switch statement can have an optional default case.
The default case can be used for performing a task when none of the cases is matched.

For example:
		 */
		class Program{
			public void main1(String[] args2) {
				int day2 = 3;
				switch(day2) {
				case 6:
					System.out.println("Saturday");
					break;
				case 7:
					System.out.println("Sunday");
					break;
				default:
					System.out.println("Weekday");
				}
			}
		}
	}
}
