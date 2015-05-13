package troskovi;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
	public void testSetIznos() {
		t.setIznos(600.0);
		assertEquals(600.0, t.getIznos(), 0);
	}


}
