import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class demoTest {
	private demo str;

	@Before
	public void setUp() throws Exception {
		str = new demo();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSmallString() {
		assertEquals("a",str.smallString("A"));		
	}

	@Test
	public void testSmallString1() {
		assertEquals("a",str.smallString("B"));
	}
	@Test
	public void testSmallString2() {
		assertEquals("A",str.smallString("A"));
	}
	@Test
	public void testSmallString3() {
		assertEquals("A",str.smallString("a"));
	}

	@Test
	public void testSmallString4() {
		assertEquals("Aa",str.smallString("AA"));
	}

	@Test
	public void testSmallString5() {
		assertEquals("aa",str.smallString("AA"));
	}

	@Test
	public void testSmallString6() {

		assertEquals("aA",str.smallString("AA"));
	}

	@Test
	public void testSmallString7() {
		assertEquals("aa",str.smallString("Aa"));
	}

	@Test
	public void testSmallString8() {
		assertEquals("abc",str.smallString("ABC"));
	}

	@Test
	public void testSmallString9() {
		assertEquals("abC",str.smallString("ABc"));
	}

	
	}


