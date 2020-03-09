package L5Polymorphism;

class Animal {
	
	    public void makeSound() {
	        System.out.println("Grr...");
	    }
	}

/*
 Polymorphism, which refers to the idea of "having many forms", 
 occurs when there is a hierarchy of classes related to each other
 through inheritance.
A call to a member method will cause a different implementation
 to be executed, depending on the type of the object invoking the method.
Here is an example: 
Dog and Cat are classes that inherit from the Animal class. 
Each class has its own implementation of the makeSound() method.
 */

