package L7EqualMethods;


/*
 Comparing Objects

Remember that when you create objects, the variables store references to the objects.
So, when you compare objects using the equality testing operator (==), it actually compares the references and not the object values.
Example:
 */
public class Run {
	public static void main(String[ ] args) {
        Animal a1 = new Animal("Robby");
        Animal a2 = new Animal("Robby");
        //System.out.println(a1 == a2);//printing false
        System.out.println(a1.equals(a2));//printing true
    }
} //Printing False

/*
Despite having two objects with the same name, the equality testing 
returns false, because we have two different objects 
(two different references or memory locations).*/

//We can run the test again, using the equals method after generate hashcode and equals