package troskovi;

import static org.junit.Assert.assertEquals;

import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sistem.troskovi.Troskovi;

public class TroskoviTest {

	Troskovi t;
	
	@Before
	public void setUp() throws Exception {
		t= new Troskovi();
	}

	@After
	public void tearDown() throws Exception {
		t=null;
	}

	@Test
	public void testSetGetIznos() {
		t.setIznos(600.0);
		assertEquals(600.0, t.getIznos(), 0);
	}

	@Test
	public void testDatum(){
		GregorianCalendar gc = new GregorianCalendar();
		t.setDatum(gc);
		assertEquals(gc, t.getDatum());
	}

}
