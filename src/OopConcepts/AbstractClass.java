package OopConcepts;

/*Abstract class : Provides a common base with shared functionality for related classes, 
 * 				   enforcing specific method implementations
 * 
 */
abstract class University {
	String name;

	abstract void welcomeMessage();
}

class Students extends University {
	void welcomeMessage() {
		System.out.println("Hello Students");
	}
}

class Teachers extends University {
	void welcomeMessage() {
		System.out.println("Hello teachers");
	}
} 

public class AbstractClass {
	public static void main(String args[]) {

		University students = new Students();
		University teachers = new Teachers();

		students.welcomeMessage();
		teachers.welcomeMessage();
		
		/*University [] member = new University[4];
		member[0] = new Students();
		member[1] = new Students();
		member[2] = new Teachers();
		member[3] = new Teachers();
		
		for (University Members :  member ) {
			Members.welcomeMessage();
		}*/
		
	}
}

/*abstract class Animal{
	abstract void makeSound();
} */

/*class Dog extends Animal{
	void makeSound() {
		System.out.println("Dog is barking..");
	}
}*/

/*public class AbstractClass{
	public static void main(String args[]) {
		Animal dog = new Dog();
		dog.makeSound();
	}
}*/


