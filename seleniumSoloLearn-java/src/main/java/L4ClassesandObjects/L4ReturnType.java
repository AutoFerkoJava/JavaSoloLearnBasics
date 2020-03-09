package L4ClassesandObjects;

public class L4ReturnType {

	
/*The return keyword can be used in methods to return a value.
For example, we could define a method named sum that returns the sum of its two parameters.

static int sum(int val1, int val2) {
				   return val1 + val2;
				}

Notice that in the method definition, we defined the return type before we defined the method name. For our sum method, it is int, as it takes two parameters of the type int and returns their sum, which is also an int.
The static keyword will be discussed in a future lesson.*/
	
	//Now, we can use the method in our main.
	static int sum(int val1, int val2) {
		return val1 + val2;
	}

	public static void main(String[ ] args) {
		int x = sum(2, 5);
		System.out.println(x);
	}

}
/*
 As the method returns a value, we can assign it to a variable.
When you do not need to return any value from your method, use the keyword void.
Notice the void keyword in the definition of the main method - 
this means that main does not return anything.
 */

/*
 public static void main1(String[ ] args) {
	int x = 10; //declare an integer, and pass it as a parameter to the test() method.
	test(x);
	}
	static void test(int x) {   
		System.out.println(x);
	}
  */
  
