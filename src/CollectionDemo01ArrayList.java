
import java.util.ArrayList;

public class CollectionDemo01ArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
		// what does the angle bracket do?
		// Why don't we use "int" in the brackets
		
		numbers.add(20);    // adding an element
		numbers.add(0, 21); // specifying an index
		numbers.add(22);    // where will this add the 22?
		// what is it called, when there are two versions of add?

		System.out.println("numbers: " + numbers.toString()); // ?
		
		// Compare to an array
		int[] iVals = {1, 2, 3, 4, 5};
		System.out.println("iVals: " + iVals[0]); // What will this print?

		// Using the "size" and "get" methods
		System.out.println("\n\tUsing .size and .get");
		System.out.println("numbers.size(): " + numbers.size()); // ?
		System.out.println("numbers.get(2): " + numbers.get(2)); // ?
        // how do you get the length of a String?

		// Use indexOf Method
		System.out.println("\n\tUsing .indexOf");
		System.out.println("numbers.indexOf(20): " + numbers.indexOf(20));         // ?
		System.out.println("numbers.indexOf(\"cat\"): " + numbers.indexOf("cat")); // ?

	}

}
