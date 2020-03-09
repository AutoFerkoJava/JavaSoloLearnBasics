package L4ClassesandObjects;

public class L6CreatingObjects { //Animal = Dog


	/* Let's head over to our main and create a new object of our class.
		L6CreatingObjects.java*/
	void bark() {
		System.out.println("Woof-Woof");
	}
}

class MyClass {
	public static void main(String[ ] args) {
		L6CreatingObjects dog = new L6CreatingObjects();
		dog.bark();
	}
}

/*Now, dog is an object of type Animal. 
 Thus we can call its bark() method, using the name of the object and a dot.
 The dot notation is used to access the object's attributes and methods.*/