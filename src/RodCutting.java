import java.util.List;


public class RodCutting {

	
	public static int getMaxRevenue(List<Integer> prices, int rodSize){

		int[] revenue = new int[rodSize+1];
		revenue[0] = 0;
		
		for(int i =1; i<=rodSize; i++){
			int maxRevenue = prices.get(i);
			for(int j =1; j<=i; j++){
				maxRevenue = Math.max(maxRevenue, prices.get(j)+revenue[i-j]);
			}
			revenue[i] = maxRevenue;
		}
		
		return revenue[rodSize];
	}
	
	
	
}
