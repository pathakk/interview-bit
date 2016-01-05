import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MaximumStockProfitTest {


	@Test
	public void testMaximumProfitAssortmentOfMinsAndMaxs() {
		
		//Max profit for this array would be buying at 425 and selling at 700
		int[] prices = {500,450,475,600,425,700,450};
		int maxProfit = MaximumStockProfit.maxProfit(prices);
		
		assertEquals(275,maxProfit);
		
	}
	
	@Test
	public void testMaximumProfitNoProfitPossibleReturns0() {
		
		//It's impossible to make a profit here, so we should not buy anything.
		int[] prices = {500,475,460};
		int maxProfit = MaximumStockProfit.maxProfit(prices);
		
		assertEquals(0,maxProfit);
	}

}
