package L4ClassesandObjects;

public class L3MethodParameters {

	  static void sayHello(String name) { // has a parameter
	        System.out.println("Hello " + name);
	    }

	    public static void main(String[ ] args) {
	        sayHello("David");
	        sayHello("Amy");
	    }

	}

/*
 You can also create a method that takes some data, 
 called parameters, along with it when you call it. 
 Write parameters within the method's parentheses.
For example, we can modify our sayHello() method to take and output a String paramete
*/

/*
 The method above takes a String called name as a parameter, 
 which is used in the method's body. Then, when calling the method, we pass the parameter's value inside the parentheses.
Methods can take multiple, comma-separated parameters.
*/

/*
 The advantages of using methods instead of simple statements include the following:
- code reuse: You can write a method once, and use it multiple times, without having to rewrite the code each time.
- parameters: Based on the parameters passed in, methods can perform various actions.
 */
 
