package pucrs.java.maven.cats;

import static org.junit.Assert.*;

import org.junit.Test;

public class CatTest {

	@Test
	public void testCatHasAName() {
		Cat garfield = new Cat("Garfield");
		assertEquals("Garfield", garfield.getName());
	}

	@Test
	public void testCatHasAMeow() {
		Cat garfield = new Cat("Garfield");
		assertEquals("Garfield Meow!", garfield.meow());
	}
}
