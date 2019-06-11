package pucrs.java.maven.pets.framework;

import static org.junit.Assert.*;

import org.junit.Test;

import pucrs.java.maven.pets.framework.Pet;
import pucrs.java.maven.pets.framework.PetCatalog;
import pucrs.java.maven.pets.model.Cat;

public class PetCatalogTest {

	@Test
	public void testCatCatalogIsAvailable() {
		PetCatalog cats = new PetCatalog();
		assertNotNull(cats);
	}

	@Test
	public void testAddGarfieldIntoCatCatalog() {
		PetCatalog cats = new PetCatalog();
		Cat garfield = new Cat("Garfield", Pet.Gender.MALE);
		cats.add(garfield);
	}	
	
}
