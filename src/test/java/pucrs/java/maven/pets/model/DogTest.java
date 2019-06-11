package pucrs.java.maven.pets.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import pucrs.java.maven.pets.framework.Pet;

public class DogTest {

	private Dog beethoven;

	@Before
	public void setup() {
		beethoven = new Dog("Beethoven");
	}

	@Test
	public void testDogHasAName() {
		assertEquals("Beethoven", beethoven.getName());
	}

	@Test
	public void testDogHasASex() {
		assertEquals(Pet.Gender.MALE, beethoven.getSex());
	}
	
	@Test
	public void testDogHasABark() {
		assertEquals("Beethoven Whoof!", beethoven.bark());
	}


}
