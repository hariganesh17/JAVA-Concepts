package Collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		// natural ordering (For integer -ascending)
		Map <Integer,String> map = new TreeMap<>();
		
		map.put(21, "Pranesh");
		map.put(20, "Gowtham");
		map.put(22, "Ganesh");
		map.put(8,"Barath");
		
		map.forEach((Integer key,String value)->System.out.println(key+": "+value));
		
		//descending order
		System.out.println("...........");
		
		Map <Integer,String> map1 = new TreeMap<>((Integer key1, Integer key2)->key2-key1);
		
		map1.put(21, "Pranesh");
		map1.put(20, "Gowtham");
		map1.put(8,"Barath");
		map1.put(22, "Ganesh");
		
		map1.forEach((Integer key,String value)->System.out.println(key+": "+value));
		
	}
}
