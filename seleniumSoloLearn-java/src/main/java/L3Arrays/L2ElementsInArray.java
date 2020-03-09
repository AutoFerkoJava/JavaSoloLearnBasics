package L3Arrays;

public class L2ElementsInArray {

	public static void main(String[] args) {
		/*
		 You can access the length of an array (the number of elements it stores) via its length property.
          Example:
		 */
	    //int[ ] intArr = new int[25];
		 //System.out.println(intArr.length);
		
		
		/*Now that we know how to set and get array elements, 
		 we can calculate the sum of all elements in an array by using loops.
		The for loop is the most used loop when working with arrays,
		as we can use the length of the array to determine how many times to run the loop.		
		*/
		
		/*
		 In the code above, 
		 we declared a variable sum to store the result and assigned it 0.
         Then we used a for loop to iterate through the array, 
         and added each element's value to the variable.
		 */
		
		//The condition of the for loop is x<myArr.length, 
		//as the last element's index is myArr.length-1.
		int [ ] myArr = {6, 42, 3, 7};
        int sum=0;
        for(int x=0; x<myArr.length; x++) {
            sum += myArr[x];
        }
        System.out.println(sum);
	}

}
