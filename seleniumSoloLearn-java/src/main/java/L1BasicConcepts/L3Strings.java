package L1BasicConcepts;

public class L3Strings {

	public static void main(String[] args) {
		String var;
		var = "Hello";
		System.out.println(var);
		
		
		/*
		 * The + (plus) operator between strings adds them together to make a new string. 
		 * This process is called concatenation.
           The resulted string is the first string put together with the second string.
           For example:
		 */
		
		String firstName, lastName;
		firstName = "Pinco";
		lastName = "Pallino";

		System.out.println("My name is " + firstName +" "+lastName);
		
		String name;
		name = "John";
		System.out.println(name);

	}

}

/*
 * A String is an object that represents a sequence of characters.
For example, "Hello" is a string of 5 characters.

For example:String s= "SoloLearn"
 */

//You are allowed to define an empty string. For example, String str = "";