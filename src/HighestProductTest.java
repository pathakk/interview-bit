import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class HighestProductTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		
		int[] max21 = {1,3,7,-1,-1};
		
		int[] max300 = {-10,-10,1,3,2};

		int[] max10 ={-1,-5,2,3};
		
		assertEquals(21, HighestProductOf3.returnHighestProductOf3(max21));
		assertEquals(300, HighestProductOf3.returnHighestProductOf3(max300));
		assertEquals(15, HighestProductOf3.returnHighestProductOf3(max10));
		
	}

}
