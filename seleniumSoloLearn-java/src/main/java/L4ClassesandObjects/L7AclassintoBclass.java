package L4ClassesandObjects;

public class L7AclassintoBclass {
/*
 Drag and drop from the options below to create an object of the A class 
 in the B class  and call its "test" method.
 */
	public void test() {
	    System.out.println("Hi");
	  }  
	}
	class B {
	  public static void main(String args[ ]) {
		  L7AclassintoBclass obj = new L7AclassintoBclass();
	    obj.test();
	  }
	}

