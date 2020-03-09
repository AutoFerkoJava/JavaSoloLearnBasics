package L4ClassesandObjects;

public class L5MethodWith2Parameters {

	public static void main(String[] args) {
		// Let's create a method that takes two parameters of type int and returns
		//the greater one, then call it in main:
		int res = max(7, 42);
		System.out.println(res);
	}

	static int max(int a, int b) {
		if(a > b) {
			return a;
		}
		else {
			return b;
		}
	}

}
/*
A method can have one type of parameter (or parameters) and return another, different type. 
For example, it can take two doubles and return an int.*/

//Output of this code: 30
/*
 public static void main(String[ ] args) {
  int x = 10;
  int y = myFunc(x);
  System.out.println(y);
}
public static int myFunc(int x) {
  return x*3;
}
 */
