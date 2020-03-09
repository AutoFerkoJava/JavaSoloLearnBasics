package L4ClassesandObjects;

public class L10GetSet {

	public static void main(String[] args) {
	}
}
class A {
	private int x;   
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
}
/*
 Getters and Setters are used to effectively protect your data, particularly when creating classes. 
 For each variable, the get method returns its value, while the set method sets the value.
Getters start with get, followed by the variable name, with the first letter of the variable name capitalized.
Setters start with set, followed by the variable name, with the first letter of the variable name capitalized. 
 */
