package OopConcepts;

/*
 * Method Overloading
 * 
 * class Calculater{ public int add(int a,int b) { return a+b; } public int
 * add(int a,int b,int c) { return a+b+c; } } public class Polymorphism { public
 * static void main(String args[]) {
 * 
 * Calculater calulation = new Calculater();
 * 
 * int sum1=calulation.add(3, 4); System.out.println("The sum of 3 and 4 is " +
 * sum1);
 * 
 * int sum2 = calulation.add(2, 3, 4);
 * System.out.println("The sum of 2,3 and 4 is " + sum2);
 * 
 * }
 * 
 * }
 */

//Method overriding

class Animal {
	public void sound() {
		System.out.println("Animal's sound..");
	}
}
class Dog extends Animal {
	public void sound() {
		System.out.println("Dog - Bark");
		}
}
class Cat extends Animal {
	public void sound() {
			System.out.println("cat - Meow");
			}
		}
public class Polymorphism{
	public static void main(String args[]) {
		Animal MyDog = new Dog();
		Animal MyCat = new Cat();
		Animal animal = new Animal();
		
		animal.sound();
		MyDog.sound();
		MyCat.sound();
		
	}
}