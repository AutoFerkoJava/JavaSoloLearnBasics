package L7Casting;

/*
 The code above is casting the value 3.14 to an integer, 
 with 3 as the resulting value.
Another example:
 */
public class L2Casting {
	public static void main(String[] args) {
        double a = 42.571;
        int b = (int) a;
        System.out.println(b);
    }

}
//42
/*Java supports automatic type casting of integers to floating points, 
since there is no loss of precision.
On the other hand, type casting is mandatory when assigning
 floating point values to integer variables.*/