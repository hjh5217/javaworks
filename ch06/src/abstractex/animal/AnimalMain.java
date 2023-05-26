package abstractex.animal;

public class AnimalMain {

	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal dog = new Dog();
		
		cat.breathe();
		cat.sound();
		cat.showInfo();
		
		System.out.println("=====================");
		
		dog.breathe();
		dog.sound();
		dog.showInfo();

		System.out.println("=====================");
		
		animalSound(cat);
		animalSound(dog);
	}
	private static void animalSound(Animal animal) {
		animal.sound();
	}

}
