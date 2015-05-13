package budzet;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sistem.budzet.Budzet;

/**
 * Testiranje klase Budzet
 * @author marcus
 *
 */
public class BudzetTest {

	/**
	 * atribut koji predstavlja objekat klase Budzet
	 */
	Budzet b;
	
	/**
	 * Metoda koja kreira objekat klase Budzet
	 * koji ce se koristiti u svim testovima klase
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		b = new Budzet();
	}

	/**
	 * Metoda koja postavlja vrednost objekta Budzeta na null
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
		b = null;
	}

	/**
	 * Metoda koja testira gettere i settere
	 * postavlja iznos budzeta na odredjenu vrednost
	 * i proverava da li je zaista ta vrednost dodeljena objektu
	 */
	@Test
	public void testSetterGetter() {
		b.setIznos(500.0);
		assertEquals(500.0, b.getIznos(), 0);
	}
}
