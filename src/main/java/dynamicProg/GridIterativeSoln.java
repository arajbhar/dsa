package dynamicProg;

public class GridIterativeSoln {
	
	static int[][] dp=new int[6][4];
	
	public static void fillGrid(int[][] dp) {
		
		dp[0][0]=0;
		for(int j=1;j<4;j++) {
			dp[0][j]=1;
		}
		
		for(int i=1;i<6;i++) {
			dp[i][0]=1;
		}
		
		for(int i=1;i<6;i++) {
			for(int j=1;j<4;j++) {
				dp[i][j]=dp[i-1][j]+dp[i][j-1];
				System.out.println("Value at indx "+i+"and"+j+" is: "+ dp[i][j] );
			}
		}
	}
			
	public static void main(String[] args) {
		
		GridIterativeSoln.fillGrid(GridIterativeSoln.dp);
	}

}


