package L7AnonymusClass;

public class L3starting {
	  public static void main(String[ ] args) {
	        L1Machine m1 = new L1Machine() {
	            @Override public void start() {
	                System.out.println("Wooooo");
	            }
	        };
	        L1Machine m2 = new L1Machine();
	        m2.start();
	    }
	}

/*
 The modification is applicable only to the current object, 
 and not the class itself. So if we create another object of that class, 
 the start method's implementation will be the one defined in the class.
 */
