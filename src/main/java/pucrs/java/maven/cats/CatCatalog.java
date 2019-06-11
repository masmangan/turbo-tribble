package pucrs.java.maven.cats;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author marco.mangan@pucrs.br
 *
 */
public class CatCatalog {

	/**
	 * 
	 */
	private List<Cat> cats = new ArrayList<Cat>();
	
	/**
	 * 
	 * @param cat
	 */
	public void add(Cat cat) {
		cats.add(cat);
	}

}
