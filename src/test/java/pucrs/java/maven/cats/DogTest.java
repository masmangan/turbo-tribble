package pucrs.java.maven.cats;

import static org.junit.Assert.*;

import org.junit.Test;

public class DogTest {

	@Test
	public void testDogHasAName() {
		Dog beethoven = new Dog("Beethoven");
		assertEquals("Beethoven", beethoven.getName());
	}

	@Test
	public void testDogHasABark() {
		Dog beethoven = new Dog("Beethoven");
		assertEquals("Beethoven Whoof!", beethoven.bark());
	}
}
