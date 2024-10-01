package OopConcepts;

/*Interface: Defines a contract of methods that classes must implement, 
			 allowing for multiple inheritance of capabilities.
			 
			 It specifies what methods a class must have, but not how these methods should be implemented
*/
interface flyable {
	void fly();
// we can define method in interface
	default void display() {
		System.out.println("Hello interface...");
	}
}

interface swimmable {
	void swim();
}

class Duck implements flyable, swimmable {
	public void fly() {
		System.out.println("Duck is flying..");
	}

	public void swim() {
		System.out.println("Duck is swimming..");
	}
}

public interface InterfaceDemo {
	public static void main(String args[]) {
		Duck bird = new Duck();
		bird.display();
		bird.fly();
		bird.swim();

	}
}