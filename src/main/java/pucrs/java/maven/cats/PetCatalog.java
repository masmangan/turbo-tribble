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
	private List<Pet> pets = new ArrayList<Pet>();

	/**
	 * 
	 * @param cat
	 */
	public void add(Pet pet) {
		pets.add(pet);
	}

	/**
	 * 
	 */
	public void doTalk() {
		for (Pet pet : pets) {
			System.out.println(pet.talk());
		}
	}
	
}
