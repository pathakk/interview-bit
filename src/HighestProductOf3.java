
public class HighestProductOf3 {

	
	
	public static int returnHighestProductOf3(int[] input){
		
		int high = input[0];
		int high1 = input[0];
		int high2 = input[0];
		
		int low = input[0];
		int low1=input[0];
		
		for(int i: input){
			
			if(i<low){
				low1= low;
				low = i;
			}else if(i<low1){
				low1 = i;
			}
			
			if(i>high){
				high2 = high1;
				high1 = high;
				high =i;
			}else if(i>high1){
				high2 = high1;
				high1 = i;
			}else if(i>high2){
				high2 = i;
			}
			
		}
		
		return Math.max(low*low1*high, high*high1*high2);
		
		
		
	}
}
