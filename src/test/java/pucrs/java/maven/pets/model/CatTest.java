package pucrs.java.maven.pets.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import pucrs.java.maven.pets.framework.Pet;

public class CatTest {
	Cat garfield; 
	
	@Before
	public void setup() {
		garfield = new Cat("Garfield", Pet.Gender.MALE);
	}

	@Test
	public void testCatHasAName() {
		assertEquals("Garfield", garfield.getName());
	}

	@Test
	public void testCatHasASex() {
		assertEquals(Pet.Gender.MALE, garfield.getSex());
	}
	
	@Test
	public void testCatHasAMeow() {
		assertEquals("Garfield Meow!", garfield.meow());
	}
}
