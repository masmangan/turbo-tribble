package pucrs.java.maven.cats;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author marco.mangan@pucrs.br
 *
 */
public class PetCatalog {

	/**
	 * 
	 */
	private List<Cat> cats = new ArrayList<Cat>();
	private List<Dog> dogs = new ArrayList<Dog>();

	/**
	 * 
	 * @param cat
	 */
	public void add(Cat cat) {
		cats.add(cat);
	}

	public void add(Dog dog) {
		dogs.add(dog);
	}
	
	
	public void doMeow() {
		for (Cat cat : cats) {
			System.out.println(cat.meow());
		}
	}

	public void doBark() {
		for (Dog dog : dogs) {
			System.out.println(dog.bark());
		}
	}
	
	
}
