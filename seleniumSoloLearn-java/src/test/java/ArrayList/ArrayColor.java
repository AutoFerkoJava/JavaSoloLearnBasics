package ArrayList;

import java.util.ArrayList;
/*
The ArrayList class provides a number of useful methods 
for manipulating its objects.
The add() method adds new objects to the ArrayList. 
Conversely, the remove() method removes objects from the ArrayList.
Example:
 */
public class ArrayColor {

	    public static void main(String[ ] args) {
	        ArrayList<String> colors = new ArrayList<String>();
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Orange");
	        colors.remove("Green");
	        
	        System.out.println(colors);
	    }
	}



/*
Other useful methods include the following:
- contains(): Returns true if the list contains the specified element
- get(int index): Returns the element at the specified position in the list
- size(): Returns the number of elements in the list
- clear(): Removes all of the elements from the list

Note: As with arrays, the indexing starts with 0.*/