package dynamicProg;

public class GridPath {

	//static int[][] grid = new int[2][3];
	static int[][] dp = new int[21][21];

	public static void main(String args[]) {

		for (int i = 0; i < GridPath.dp.length; i++) {
			for (int j = 0; j < GridPath.dp[0].length; j++) {
				GridPath.dp[i][j] = -1;
				
				System.out.println("Value at "+i+""+j+"is : " +GridPath.dp[i][j]);
			}
		}
		

		int p = GridPath.path(20, 20);

		System.out.println("Total no of possible paths : " + p);

	}

	public static int path(int i, int j) {

		if (i < 0 || j < 0) {
			dp[i][j] = 0;
			return 0;
		}
		if (i == 0 || j == 0) {
			dp[i][j] = 1;
		}
		
		if (GridPath.dp[i][j] == -1) {
			
			dp[i][j] = path(i - 1, j) + path(i, j - 1);

		}

		return GridPath.dp[i][j];
	}

}
