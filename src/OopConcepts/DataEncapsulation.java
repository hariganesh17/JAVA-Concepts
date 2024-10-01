package OopConcepts;

/*Defn: it bundles data and the code working on that data in single unit.
 *     
 *     adv: data Hiding - Protects the internal state of an object from outside interference and misuse
 *     
 *     		increase flexibility -Allows the internal implementation of a class to change 
 *     								without affecting the code that uses the class.       
 */
class Person {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class DataEncapsulation {
	public static void main(String argd[]){
		
		Person person = new Person();
		
		person.setName("Hari");
		person.setAge(25);
		
		System.out.println("My name is: " + person.getName());
		System.out.println("My Age is: " + person.getAge());
	}
}
