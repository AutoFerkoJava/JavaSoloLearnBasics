package L5Abstraction;

public class Cat extends Animal {
	    public void makeSound() {
	        System.out.println("Meow");
	    }

}

/*
The makeSound method is also abstract, as it has 
no implementation in the superclass.
We can inherit from the Animal class and define the makeSound() 
method for the subclass: 
 */
