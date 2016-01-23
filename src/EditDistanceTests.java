import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class EditDistanceTests {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		
		assertEquals(EditDistance.getEditDistance("kitten", "sitting"),3);
		
		assertEquals(EditDistance.getEditDistance("geek", "gesek"),1);
		
		assertEquals(EditDistance.getEditDistance("cat", "cut"),1);
		assertEquals(EditDistance.getEditDistance("sunday", "saturday"),3);
	}

}
