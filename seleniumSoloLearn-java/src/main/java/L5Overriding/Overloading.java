package L5Overriding;

public class Overloading {
	
	    static double max(double a, double b) {
	        if(a > b) {
	            return a;
	        }
	        else {
	            return b;
	        }
	    }
	    static int max(int a, int b) {
	        if(a > b) {
	            return a;
	        }
	        else {
	            return b;
	        }
	    }

	    public static void main(String[] args) {        
	        System.out.println(max(8, 17));
	        System.out.println(max(3.14, 7.68));
	    }

	}

/*
The method shown above will only work for parameters of type integer.
However, we might want to use it for doubles, as well. 
For that, you need to overload the max method: 

Now, our max method will also work with doubles.
An overloaded method must have a different argument list; 
the parameters should differ in their type, number, or both.
Another name for method overloading is compile-time polymorphism.
 */
