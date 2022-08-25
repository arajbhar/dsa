package arrays;

public class MatrixPrefixSum {

	static int[][] a = { { 7, 1, -6, 3, 12 }, { 10, 5, -2, 0, 9 }, { 6, 4, -3, 8, 11 }, { 13, -8, -5, 12, 4 },
			{ 3, 2, 1, 9, 3 }, { 4, 3, -2, 6, 8 } };
	
	static int N=a.length;
	static int M=a[0].length;
	
	static int[][] psum=new int[N][M];
	
	public static void main(String[] args) {
		int sum=0;
		
		//sum rowwise and store in psum array
		for(int i=0;i<N;i++) {
			sum=0;
			for(int j=0;j<M;j++) {
				sum=sum+a[i][j];
				psum[i][j]=sum;
			}
		}
		
		//sum the psum created above colwise to build final psum
		for(int j=0;j<M;j++) {
			sum=0;
			for(int i=0;i<N;i++) {
				sum=sum+psum[i][j];
				psum[i][j]=sum;
			}
		}
		
		//find sum of sunMatrix(i,j-->p,q)
		int i=2;
		int j=3;
		int p=5;
		int q=4;
		
		int subMsum=psum[p][q]-psum[i-1][q]-psum[p][j-1]+psum[i-1][j-1];
		
		System.out.println(subMsum);
	}
	
	

}
