package JavaDeepDive;

import java.util.HashMap;
import java.util.Map;

import java.util.Map.Entry;;

public class MapDemo {

	public static void main(String[] args) {
		// Creating a hash map to store key-value pairs (String-Int)
		Map<String, Integer> studentScore = new HashMap<>();
		
		//Adding entries to the map
		studentScore.put("Kwazi", 24);
		studentScore.put("Miso", 88);
		studentScore.put("Fanele", 87);
		studentScore.put("Sno", 86);
		
		System.out.println("Kwazi's score: "+ studentScore.get("Kwazi"));
		
		// Iterating through the map and printing all entries
		for (Map.Entry<String, Integer> entry : studentScore.entrySet()) {
		    System.out.println(entry.getKey() + "'s score: " + entry.getValue());
		}

	}

}
