import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class RodCuttingTests {

	
	@Test
	public void test_rodCutting(){
		
		
	List<Integer> prices = Arrays.asList( new Integer[]{0,1, 5, 8, 9, 10, 17, 17, 20,24,30});
		
	assertEquals(1,RodCutting.getMaxRevenue(prices, 1));
	assertEquals(5,RodCutting.getMaxRevenue(prices, 2));
	assertEquals(8,RodCutting.getMaxRevenue(prices, 3));
	assertEquals(25,RodCutting.getMaxRevenue(prices, 9));
	assertEquals(10,RodCutting.getMaxRevenue(prices, 4));
	assertEquals(13,RodCutting.getMaxRevenue(prices, 5));
	assertEquals(30,RodCutting.getMaxRevenue(prices, 10));
	}
	
}
