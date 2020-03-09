package L2ConditionalandLoops;

public class L7WhileLoop {

	public static void main(String[] args) {
/*
A loop statement allows to repeatedly execute a statement or group of statements.
A while loop statement repeatedly executes a target statement as long as a given 
condition is true.
Example:*/
		
		int x = 10;
        while(x > 0) {
            System.out.println(x);
            x--;
           
            int z = 12;
            while(z<100) {
            	System.out.println("Java Rocks");
            	z++;
            }
            
        }
    }
}
/*
 The while loops check for the condition x > 0. 
 If it evaluates to true, it executes the statements within its body. 
 Then it checks for the statement again and repeats.
 
 Notice the statement x--. 
 This decrements x each time the loop runs, and makes the loop stop when x reaches 0.
Without the statement, the loop would run forever.
*/