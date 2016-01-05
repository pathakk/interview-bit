import java.util.ArrayList;


public class PascalsTriangle {

	public static void printRows(int n){
		
		int[][] rows = new int[n+1][];
		
		int[] rowZero={1};
		int[] rowOne={1,1};
		
		rows[0] = rowZero;
		rows[1] = rowOne;
		
		for(int i = 2; i<=n; i++){
			int[] prev = rows[i-1];
			int[] currRow = new int[i+1];
			currRow[0] = 1;
			for(int j = 1; j<currRow.length-1; j++){
				currRow[j] = prev[j]+prev[j-1];
			}
			currRow[currRow.length-1] = 1;
			rows[i] = currRow;
		}
		
		for(int[] row:rows){
			for(int r: row){
				System.out.print(r+" ");
				
			}
			System.out.println();
		}
		
		
		
	}
	
public static void printRowsArrayList(int n){
		
		ArrayList<ArrayList<Integer>> rows = new ArrayList<>();
		
		ArrayList<Integer> rowZero = new ArrayList<>();
		rowZero.add(1);
		ArrayList<Integer> rowOne = new ArrayList<>();
		rowOne.add(1);
		rowOne.add(1);
		rows.add(rowZero);
		rows.add(rowOne);
		
		
		for(int i = 2; i<=n; i++){

			ArrayList<Integer> prev = rows.get(i-1);
			//int[] currRow = new int[i+1];
			ArrayList<Integer> currRow = new ArrayList<>();
			currRow.add(1);
			for(int j = 1; j<i; j++){
				currRow.add(prev.get(j)+prev.get(j-1));
			}
			currRow.add(1);
			rows.add(currRow);
		}
		
		for(ArrayList<Integer> row:rows){
			for(int r: row){
				System.out.print(r+" ");
				
			}
			System.out.println();
		}
		
		
		
	}
	
	public static void test2d(){
		int[][] test = new int[2][];
		
		int[] zero = {1};
		int[] one = {1,1};
		
		test[0] = zero;
		test[1] = one;
		
		for(int[] row:test){
			for(int r: row){
				System.out.print(r+" ");
				
			}
			System.out.println();
		}
		
	}
	
	
}
