package pucrs.java.maven.cats;

import static org.junit.Assert.*;

import org.junit.Test;

public class PetCatalogTest {

	@Test
	public void testCatCatalogIsAvailable() {
		PetCatalog cats = new PetCatalog();
		assertNotNull(cats);
	}

	@Test
	public void testAddGarfieldIntoCatCatalog() {
		PetCatalog cats = new PetCatalog();
		Cat garfield = new Cat("Garfield");
		cats.add(garfield);
	}	
	
}
