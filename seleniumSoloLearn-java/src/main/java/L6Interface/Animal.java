package L6Interface;

interface Animal {
	public void eat();
	  public void makeSound();
	}
class Cat implements Animal {
	  public void makeSound() {
	    System.out.println("Meow");
	  }
	  public void eat() {
	    System.out.println("omnomnom");
	  }
	}