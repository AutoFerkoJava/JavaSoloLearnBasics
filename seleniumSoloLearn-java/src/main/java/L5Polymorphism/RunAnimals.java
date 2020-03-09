package L5Polymorphism;

public class RunAnimals {
	
	    public static void main(String args[ ]) {
	        Animal a = new Dog();
	        Animal b = new Cat();
	        
	        a.makeSound();
	        b.makeSound();
	    }
	}

/*We've created two reference variables of type Animal, 
and pointed them to the Cat and Dog objects.
Now, we can call the makeSound() methods.*/