package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		// Create a new Map with String keys and List of String values
		Map<String, List<String>> listMap = new HashMap<>();

		// Create a new List of Strings to store in the Map
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");

		// Add the List of Strings to the Map with a String key
		listMap.put("fruits", fruits);

		// Retrieve data using a For Each loop
		for (Map.Entry<String, List<String>> entry : listMap.entrySet()) {
			String key = entry.getKey();
			List<String> value = entry.getValue();
			System.out.println("Key: " + key + ", Value: " + value);
		}

		// Retrieve data using a while loop with an Iterator
		Iterator<Map.Entry<String, List<String>>> iterator = listMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, List<String>> entry = iterator.next();
			String key = entry.getKey();
			List<String> value = entry.getValue();
			System.out.println("Key: " + key + ", Value: " + value);

}

	}

}
