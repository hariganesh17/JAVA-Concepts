package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
	public static void main(String[] args) {
		
		//Linked Hash map Maintains Insertion order
		Map <Integer,String> map = new LinkedHashMap<>();
		
		map.put(21, "Pranesh");
		map.put(20, "Gowtham");
		map.put(22, "Ganesh");
		map.put(8,"Barath");
		
		map.forEach((Integer key, String value) -> System.out.println(key +": "+ value));
		
		//hash map doesn't  maintain order
		System.out.println(".........................");
		
		Map <Integer,String> map1 = new HashMap<>();
		map1.put(8,"Barath");
		map1.put(21, "Pranesh");
		map1.put(101, "kumar");
		map1.put(20, "Gowtham");
		map1.put(22, "Ganesh");
		
		
		
		for(Map.Entry<Integer,String> entryMap : map1.entrySet()) {
			
			System.out.println(entryMap.getKey() + ":" + entryMap.getValue());
		}
		
		//linked hash map - access order
		System.out.println("..............");
		
		Map <Integer,String> map3 = new LinkedHashMap<>(16,2,true);
		map3.put(8,"Barath");
		map3.put(21, "Pranesh");
		map3.put(20, "Gowtham");
		map3.put(22, "Ganesh");
		
		map3.get(21);
		
		map3.forEach((Integer key,String value)->System.out.println(key+":"+value));
		
	}
}
