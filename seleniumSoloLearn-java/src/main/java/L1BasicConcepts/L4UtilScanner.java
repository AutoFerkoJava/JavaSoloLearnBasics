package L1BasicConcepts;

import java.util.Scanner;

public class L4UtilScanner {

	public static void main(String[] args) {
		Scanner myVar = new Scanner(System.in);
	    System.out.println(myVar.nextLine()); 
	    
	    //This will wait for the user to input something and print that input.
	}
	public static void main1(String[ ] args) {
	       Scanner sc = new Scanner(System.in);
	      String st = sc.nextLine();
	   }
	}



/*
  Java provides many different methods for getting user input, 
  the Scanner object is the most common, and perhaps the easiest to implement. 
  Import the Scanner class to use the Scanner object, as seen here:
 */

//1.In order to use the Scanner class, 
// create an instance of the class by using the following syntax:
// Scanner myVar = new Scanner(System.in);

/*Here are some methods that are available through the Scanner class:
Read a byte - nextByte()
Read a short - nextShort()
Read an int - nextInt()
Read a long - nextLong()
Read a float - nextFloat()
Read a double - nextDouble()
Read a boolean - nextBoolean()
Read a complete line - nextLine()
Read a word - next()*/