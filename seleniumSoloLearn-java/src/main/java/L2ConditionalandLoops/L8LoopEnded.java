package L2ConditionalandLoops;

public class L8LoopEnded {

	public static void main(String[] args) {
		// When the expression is tested and the result is false, the loop body is skipped 
		//and the first statement after the while loop is executed
		
		int x = 5;
		while( x < 13 )
		{
		  System.out.println(x);
		  x++;
		}
		System.out.println("Loop ended");
	}

}
//Notice that the last print method is out of the while scope.