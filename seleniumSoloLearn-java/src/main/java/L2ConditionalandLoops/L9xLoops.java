package L2ConditionalandLoops;

public class L9xLoops {

	public static void main(String[] args) {
		// A for loop allows you to efficiently write a loop that needs to execute 
		//a specific number of times.
		//Syntax:
			//for (initialization; condition; increment/decrement) {
			   //statement(s)}
		
		//1.Initialization: Expression executes only once during the beginning of loop
		//2.Condition: Is evaluated each time the loop iterates. The loop executes the statement repeatedly, until this condition returns false.
		//3.Increment/Decrement: Executes after each iteration of the loop.

		//4.The following example prints the numbers 1 through 5.		
		
	        for(int x = 1; x <=5; x++) {
	            System.out.println(x);
	                    
	        }
	         //a.This initializes x to the value 1, and repeatedly 
            //b.prints the value of x, until the condition x<=5 becomes false. 
            //c.On each iteration, the statement x++ is executed, incrementing x by one.
	        //d.Notice the semicolon (;) after initialization and condition in the syntax.
	    }
	}
//for(int x=0; x<=10; x=x+2) {
   // System.out.println(x);
//0 2 4 6 8 10   A for loop is best when the starting and ending numbers are known.