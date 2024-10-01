package Collections;

import java.util.ArrayList;
import java.util.List;

public class Comparator{
	public static void main(String[] args){
		List<Student> students = new ArrayList<>();
		students.add(new Student("HARI",25));
		students.add(new Student("BALA",27));

		System.out.println("Sort by name: ");

		students.sort((s1,s2) -> s1.getName().compareTo(s2.getName()));
		for(Student list : students){
			System.out.println(list.getName()+"..."+list.getAge());
		}
		System.out.println("sort by age: ");

		students.sort((s1,s2) -> s2.getAge() - s1.getAge());

		for(Student list : students){
			System.out.println(list.getName()+".."+list.getAge());
		}
	}
}