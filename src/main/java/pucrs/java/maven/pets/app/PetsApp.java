package pucrs.java.maven.pets.app;

import pucrs.java.maven.pets.framework.Pet;
import pucrs.java.maven.pets.framework.PetCatalog;
import pucrs.java.maven.pets.framework.Pet.Gender;
import pucrs.java.maven.pets.model.Cat;
import pucrs.java.maven.pets.model.Dog;
import pucrs.java.maven.pets.model.Fish;

/**
 * The class GatosApp is pet clinic system starting point.
 *
 */
public class PetsApp {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Cats!");

		PetCatalog pets = new PetCatalog();
		pets.add(new Cat("Garfield", Pet.Gender.MALE));
		pets.add(new Cat("Tom", Pet.Gender.MALE));
		pets.add(new Cat("Lilly", Pet.Gender.FEMALE));

		pets.add(new Dog("Beethoven", Pet.Gender.MALE));
		pets.add(new Dog("Marley", Pet.Gender.MALE));
		pets.add(new Dog("Lassie", Pet.Gender.FEMALE));
		
		pets.add(new Fish("Dory", Pet.Gender.FEMALE));

		pets.doTalk();

	}
}
