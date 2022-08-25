package TwoDimensionalArray;

public class ExistenceCheck {

	static int[][] a = { { 5, 10, 15, 20 }, { 6, 12, 18, 24 }, { 7, 14, 21, 28 }, { 8, 16, 24, 32 } };

	public static void main(String[] args) {
		int k = 20;
		System.out.println(checkExesitence(k));
	}

	public static boolean checkExesitence(int k) {
		int N=a[0].length;
		int i = 0;
		int j = N - 1;
		
		if(k<a[0][0] || k>a[N-1][N-1]) {
			return false;
		}
		
		while (i < N && j >= 0) {

			if (a[i][j] == k) {
				return true;
			} else if (a[i][j] > k) {
				j--;
			} else if (a[i][j] < k) {
				i++;
			}
		}
		return false;

	}

}
