package Inheritance;

public class TestInheritans {

	public static void main(String[] args) {
		
		var dog = new Dog("Small dog", "Tuk", "Chihuahua");
		dog.bark();
// method overriding
		dog.eat();
		System.out.println("Dog type is" + dog.getType());
		System.out.println("Dog type is" + dog.getName());

		
		
		
		Animal animal = new Dog("Very big dog", "Rex", "Labrador");
		animal.eat();
		((Dog)animal).bark();

	}

}
