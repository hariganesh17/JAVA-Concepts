package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public class SetExample {
	public static void main(String[] args) {
		
		//Hash Set
		System.out.println("Hash set........");
		
		ConcurrentHashMap map = new ConcurrentHashMap<>();
		Set<Integer> set = map.newKeySet();
		set.add(20);
		set.add(21);
		set.add(22);
		set.add(23);

		Iterator<Integer> iterator = set.iterator();

		while (iterator.hasNext()) {
			Integer val = iterator.next();

			if (val == 22) {
				set.add(99);
			}
		}
		set.forEach((Integer val) -> System.out.println(val));
	

		//Linked Hash set
		
		System.out.println("linked Hash set.......");
		
			Set<Integer> set1 = new LinkedHashSet<>();
				set1.add(15);
				set1.add(12);
				set1.add(11);
				
			Iterator<Integer> iterator1 = set1.iterator();
			
			while(iterator1.hasNext()) {
				int val1 = iterator1.next();
				System.out.println(val1);
			}
			
		// Tree set
			System.out.println("Tree Set....");
			
			Set<Integer> treeSet = new TreeSet<>((Integer val1,Integer val2)->val2-val1);
			
			treeSet.add(12);
			treeSet.add(98);
			treeSet.add(97);
			treeSet.add(96);
			
			Iterator<Integer> iterator3 =treeSet.iterator();
			
			while(iterator3.hasNext()) {
				int val = iterator3.next();
				
				System.out.println(val);
			}
	}
}
