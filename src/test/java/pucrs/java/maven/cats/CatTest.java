package pucrs.java.maven.cats;

import static org.junit.Assert.*;

import org.junit.Test;

public class CatTest {

	@Test
	public void testCatHasAName() {
		Pet garfield = new Cat("Garfield", Pet.Gender.MALE);
		assertEquals("Garfield", garfield.getName());
	}

	@Test
	public void testCatHasAMeow() {
		Cat garfield = new Cat("Garfield", Pet.Gender.MALE);
		assertEquals("Garfield Meow!", garfield.meow());
	}
}
