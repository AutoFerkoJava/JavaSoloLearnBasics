package L4ClassesandObjects;

/*
You can call a method as many times as necessary.
When a method runs, the code jumps down to where 
the method is defined, executes the code inside of it, 
then goes back and proceeds to the next line.
Example:
 */

public class L2CallingMethods {
	static void sayHello() {
        System.out.println("Hello World!"); // simply prints"Hello World!"
    }

    public static void main(String[ ] args) {
        sayHello();
        sayHello();
        sayHello();
    }

}
/*
 In cases like the one above, where the same thing is repeated over and over, 
 you can achieve the same result using loops (while or for).
 */
