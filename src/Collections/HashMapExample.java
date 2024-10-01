package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample{
	public static void main(String[] args) {
		
		Map<Integer,String> student = new HashMap<>();
		student.put(22, "Hari");
		student.put(21, "chevv");
		student.put(23, "Selvi");
		student.put(24, null);
		
		student.putIfAbsent(24, "vacant");
		
		for(Map.Entry<Integer, String> entryMap : student.entrySet()) {
			
		Integer key = entryMap.getKey();
		String value = entryMap.getValue();			
		
		System.out.println("key:"+key+" valaue:"+value);
		}
		
		System.out.println("remove.."+ student.remove(24));
		
		for(Map.Entry<Integer, String> entryMap : student.entrySet()) {
			Integer key = entryMap.getKey();
			String value = entryMap.getValue();
			System.out.println("key:"+key+" value:"+value);
		}
		
	}
}
