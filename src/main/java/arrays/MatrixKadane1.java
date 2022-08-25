package arrays;

public class MatrixKadane1 {

	static int[][] a = { { 0, -2, -7, 0 }, { 9, 2, -6, 2 }, { -4, 1, -4, 1 }, { -1, 8, 0, -2 } };

	static int N = a.length;
	static int M = a[0].length;

	static int[][] psum = new int[N][M];

	public static void main(String[] args) {

		// build colprefixsum
		int sum = 0;
		for (int j = 0; j < M; j++) {
			sum = 0;
			for (int i = 0; i < N; i++) {
				sum += a[i][j];
				psum[i][j] = sum;
			}
		}

		// apply kadane's algo on each row of psum
		int ksum = 0;
		int maxSum = Integer.MIN_VALUE;
		for (int e = 0; e < N; e++) {
			ksum=0;
			for (int j = 0; j < M; j++) {
				ksum += psum[e][j];
				maxSum = Math.max(maxSum, ksum);
				if (ksum < 0) {
					ksum = 0;
				}
			}

		}

		System.out.println(maxSum);

	}

}
