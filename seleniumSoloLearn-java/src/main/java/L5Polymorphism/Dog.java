package L5Polymorphism;

public class Dog extends Animal {
		  public void makeSound() {
		    System.out.println("Woof");
		  }
		}

/*
As all Cat and Dog objects are Animal objects, 
we can do the following in main:
public static void main(String[ ] args) {
  Animal a = new Dog();
  Animal b = new Cat();
}

We've created two reference variables of type Animal, 
and pointed them to the Cat and Dog objects.
Now, we can call the makeSound() methods.
a.makeSound();
//Outputs "Woof"

b.makeSound();
//Outputs "Meow"
*/
