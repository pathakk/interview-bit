
public class EditDistance {

	
	public static int getEditDistance(String m, String n){
		
		int[][] dp = new int[m.length()+1][n.length()+1];
		
		for(int i = 0; i<=m.length();i++){
			dp[i][0] = i;
		}
		for(int j = 0; j<=n.length();j++){
			dp[0][j] = j;
		}
		char[] mArray = m.toCharArray();
		char[] nArray = n.toCharArray();
		
		for(int i = 1; i<=mArray.length; i++){
			for(int j = 1; j<=nArray.length; j++){
				if(mArray[i-1] == nArray[j-1]){
					dp[i][j] = dp[i-1][j-1];
				}else{			
					int min = Math.min(dp[i-1][j-1]/*sub */, dp[i-1][j]/*delete*/);
					min = Math.min(min, dp[i][j-1]/*add*/);
					dp[i][j] = min+1;
				}
			}
		}
		
		return dp[m.length()][n.length()];
	}
	
	
}
