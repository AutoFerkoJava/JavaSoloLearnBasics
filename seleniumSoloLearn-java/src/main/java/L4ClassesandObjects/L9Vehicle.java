package L4ClassesandObjects;

public class L9Vehicle {

	public static void main(String[] args) {
		int maxSpeed;
	    int wheels;
	    String color;
	    double fuelCapacity;   
	}

	public String color;

	    void horn() {
	        System.out.println("Beep!");
	    }
	}

	class vehicle {
	    public static void main(String[ ] args) {
	        L9Vehicle v1 = new L9Vehicle();
	        L9Vehicle v2 = new L9Vehicle();
	        v1.color = "red";
	        v2.horn();
	    }

		
	}
	
	//Output Beep Not passed
	
	/*
The following choices are available for attributes and methods:
default: A variable or method declared with no access control modifier is available to any other class in the same package.
public: Accessible from any other class.
protected: Provides the same access as the default access modifier, with the addition that subclasses can access protected methods and variables of the superclass (Subclasses and superclasses are covered in upcoming lessons).
private: Accessible only within the declared class itself.

	 * 
	 */
	