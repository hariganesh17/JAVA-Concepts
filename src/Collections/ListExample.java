package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListExample {
	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();

		list1.add(0, 10);
		list1.add(1, 20);
		list1.add(2, 30);
		list1.add(3, 40);
		list1.add(4, 50);
		list1.add(5, 60);

		//list1.forEach((Integer value) -> System.out.println(value));

		List<Integer> list2 = new ArrayList<>();

		list2.add(0, 70);
		list2.add(1, 80);
		list2.add(2, 90);
		list2.add(3, 100);
		list2.add(4, 110);

		//add all
		list1.addAll(5, list2);
		list1.forEach((Integer val) -> System.out.print(" " +val+" "));
		
		//replace all (unary op)
		list1.replaceAll((Integer val)-> -1 * val);
		System.out.println('\n' + "After replace all");
		list1.forEach((Integer val) -> System.out.print(" " + val + " "));
		
		//list sort
		list1.sort((Integer val1,Integer val2)->val1-val2);
		System.out.println('\n'+"after sorting in reverse..");
		list1.forEach((Integer  val)-> System.out.print(" "+val+" "));
		
		//get
		System.out.println('\n'+ "index value..");
		System.out.print("value at index 3: " + list1.get(3));
		
		//set
		System.out.println('\n' + "replace index 1 value..");
		list1.set(1, -200);
		list1.forEach((Integer val)-> System.out.print(" "+val+" "));
		
		//remove
		System.out.println('\n' + "after removing at index 2..");
		list1.remove(2);
		list1.forEach((Integer val)->System.out.print(" "+ val+ " "));
		
		//index of
		System.out.println('\n' + "index of value -10..");
		System.out.println(list1.indexOf(-10));
		
		//list iterator -backward
		
		ListIterator<Integer> listIterator1 = list1.listIterator(list1.size());
		
		while(listIterator1.hasPrevious()) {
			int preValue = listIterator1.previous();
			System.out.println("Backward iteration:"+ preValue + " nextIndex:"+listIterator1.nextIndex()+ " prevIndex: "+listIterator1.previousIndex());
			
			if(preValue == -110)
				listIterator1.set(-500);
		}
		list1.forEach((Integer val)-> System.out.println("After set: "+val));
		
		//list iterator -forward
		
		ListIterator<Integer> listIterator2 = list1.listIterator();
		
		while(listIterator2.hasNext()) {
			int nextVal = listIterator2.next();
			System.out.println("Forward Iteration:"+ nextVal+" prevIndex:"+listIterator2.previousIndex()+" nextIndex:"+listIterator2.nextIndex());
			
			if(nextVal == -200) {
				listIterator2.add(-100);
			}
		}
		list1.forEach((Integer val)->System.out.println("After addition:"+val));
		
		//sublist
		
		List<Integer> subList = list1.subList(1, 5);
		subList.forEach((Integer val)-> System.out.println('\n'+"sublist.."+val));
		
		subList.add(-999);
		list1.forEach((Integer val)->System.out.println('\n'+"after adding in sublist:"+ val));
		
	}
}