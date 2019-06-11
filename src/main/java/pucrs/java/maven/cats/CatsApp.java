package pucrs.java.maven.cats;

/**
 * The class GatosApp is pet clinic system starting point.
 *
 */
public class CatsApp {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Cats!");

		CatCatalog cats = new CatCatalog();
		cats.add(new Cat("Garfield"));
		cats.add(new Cat("Tom"));
		cats.add(new Cat("TopCat"));

		cats.doMeow();
	}
}
