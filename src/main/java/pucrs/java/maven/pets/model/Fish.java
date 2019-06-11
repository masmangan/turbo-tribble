package pucrs.java.maven.pets.model;

import pucrs.java.maven.pets.framework.Pet;
import pucrs.java.maven.pets.framework.Pet.Gender;

public class Fish extends Pet {

	public Fish(String name, Pet.Gender sex) {
		super(name, sex);
	}

	public String glub() {
		return getName() + " " + "Glub!";
	}

	@Override
	public String talk() {
		return glub();
	}

}
