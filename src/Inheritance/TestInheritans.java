package Inheritance;

public class TestInheritans {

	public static void main(String[] args) {
		
		var dog = new Dog("Small dog", "Tuk", "Chihuahua");
		dog.bark();
// method overriding
		dog.eat();
		System.out.println("Dog type is" + dog.getType());
		System.out.println("Dog type is" + dog.getName());

		
		
		
		Animal ani = new Dog("Very big dog", "Rex", "Labrador");
		ani.eat();
		((Dog)ani).bark();
		((Dog)ani).getName();

		
		ani = new Cat("Siam");
				ani.eat();

	}

}
