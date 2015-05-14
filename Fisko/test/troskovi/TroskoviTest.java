package troskovi;

import static org.junit.Assert.assertEquals;

import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sistem.troskovi.Troskovi;

/**
 * Test klasa za testiranje klase Troskovi
 * @author marcus
 *
 */
public class TroskoviTest {

	/**
	 * objekat klase Troskovi
	 */
	Troskovi t;
	
	/**
	 * metoda za postavljanje vrednosti za testove
	 * inicijalizuje objekat t
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		t= new Troskovi();
	}

	/**
	 * metoda koja brise parametre testiranja
	 * postavlja objekat t na null vrednost
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
		t=null;
	}

	/**
	 * test metoda za set i get metodu troskova
	 */
	@Test
	public void testSetGetIznos() {
		t.setIznos(600.0);
		assertEquals(600.0, t.getIznos(), 0);
	}

	/**
	 * test metoda za datum Troskova
	 */
	@Test
	public void testDatum(){
		GregorianCalendar gc = new GregorianCalendar();
		t.setDatum(gc);
		assertEquals(gc, t.getDatum());
	}

}
