
import java.util.HashMap;

public class CollectionDemo04HashMap {

	public static void main(String[] args) {
		
		/*			ADDITIONAL METHODS
		 * Method			Description
		 * .putIfAbsent		only set a key-value pair if it does not exist
		 * .remove			remove a key-value pair from the map
		 * .replace			replace a value at a given key
		 * .clear			empty the map
		 * .isEmpty			check if the list is empty
		 */

		HashMap<String, String> usernames = new HashMap<>();
		usernames.put("Ryan", "O'Neil");
		System.out.println(usernames); // ?

		// using .putIfAbsent
		System.out.println("\n\tusing .putIfAbsent");
		System.out.println("usernames.putIfAbsent(\"Zach\", \"Smith\"): " + usernames.putIfAbsent("Zach", "Smith")); // ?
		System.out.println(
				"usernames.putIfAbsent(\"Zach\", \"coderdude\"): " + usernames.putIfAbsent("Zach", "coderdude")); // ?
		System.out.println(usernames); // ?

		// using .remove
		System.out.println("\n\tusing .remove");
		System.out.println("usernames.remove(\"Zach\"): " + usernames.remove("Zach"));
		System.out.println(usernames); // ?

		// using .replace
		System.out.println("\n\tusing .replace");
		System.out.println("usernames.replace(\"Ryan\", \"Gosling\"): " + usernames.replace("Ryan", "Gosling"));
		System.out.println(usernames); // ?

		// using .clear and .isEmpty
		System.out.println("\n\tusing .clear and .isEmpty");
		System.out.println("usernames.isEmpty(): " + usernames.isEmpty()); // ?
		usernames.clear();
		System.out.println("usernames.isEmpty(): " + usernames.isEmpty()); // ?

	}

}
