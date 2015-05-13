package budzet;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import budzet.Budzet;

public class BudzetTest {

	Budzet b;
	@Before
	public void setUp() throws Exception {
		b = new Budzet();
	}

	@After
	public void tearDown() throws Exception {
		b = null;
	}

	@Test
	public void testSetter() {
		b.setIznos(500.0);
		assertEquals(500.0, b.getIznos(), 0);
	}

}
