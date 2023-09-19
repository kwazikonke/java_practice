package JavaDeepDive;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		// Create an ArrayList to store integers
		List<Integer> numbers = new ArrayList<>();
		
       numbers.add(1);
       numbers.add(2);
       numbers.add(3);
       
       System.out.println("The Elements in the collection: "+ numbers);
       
       //Removing an element
       numbers.remove(0);
       
       System.out.println("The elements after removing 1 element: " +numbers);
	}

}
