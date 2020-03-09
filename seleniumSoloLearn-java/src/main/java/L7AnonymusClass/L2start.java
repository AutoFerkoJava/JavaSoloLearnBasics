package L7AnonymusClass;

public class L2start {
	
	    public static void main(String[ ] args) {
	        L1Machine m = new L1Machine() {
	            @Override public void start() {
	                System.out.println("Wooooo");
	            }
	        };
	       
	        m.start();
	    }
	}

/*
 After the constructor call, we have opened the curly braces 
 and have overridden the start method's implementation on the fly.

The @Override annotation is used to make your code easier to understand,
 because it makes it more obvious when methods are overridden.
 */
