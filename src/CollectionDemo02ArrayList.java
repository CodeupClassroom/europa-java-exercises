
import java.util.ArrayList;

public class CollectionDemo02ArrayList {

	public static void main(String[] args) {

		/*
		 * ADDITIONAL METHODS Method Description 
		 * .contains 	check if a collection contains a given element 
		 * .lastIndexOf find the last index of the given element, -1 if not found 
		 * .isEmpty 	check if the list is empty 
		 * .remove 		remove the first occurrence of an item, or an item at a given index
		 */

		// We'll start by defining an array list and adding some items to it
		ArrayList<String> roasts = new ArrayList<>();
		roasts.add("light");
		roasts.add("medium");
		roasts.add("medium");
		roasts.add("dark");

		System.out.println("roasts: " + roasts); // [light, medium, medium, dark]

		// using .contains
		System.out.println("\n\tusing .contains");
		System.out.println("roasts.contains(\"dark\"): " + roasts.contains("dark")); // ?
		System.out.println("roasts.contains(\"espresso\"): " + roasts.contains("espresso")); // ?

		// using .lastIndexOf
		System.out.println("\n\tusing .lastIndexOf");
		System.out.println("roasts.lastIndexOf(\"medium\"): " + roasts.lastIndexOf("medium")); // ?

		// using .isEmpty
		System.out.println("\n\tusing .isEmpty");
		System.out.println("roasts.isEmpty(): " + roasts.isEmpty()); // false
		ArrayList<String> emptyList = new ArrayList<>();
		System.out.println("emptyList.isEmpty(): " + emptyList.isEmpty()); // true

		// .remove has two variants
		System.out.println("\n\tusing .remove by value");
		System.out.println("roasts.remove(\"espresso\"): " + roasts.remove("espresso")); // ?
		System.out.println("roasts.remove(\"medium\"): " + roasts.remove("medium")); // ?
		System.out.println("roasts: " + roasts); // ?

		// using .remove
		System.out.println("\n\tusing .remove by index");
		System.out.println("roasts.remove(2): " + roasts.remove(2)); // Will it be the same
		System.out.println("roasts: " + roasts); // ?
	}

}
