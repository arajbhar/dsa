package TwoDimensionalArray;

public class RowWithMax1 {

	static int[][] a = { { 0, 0, 0, 0, 1, 1 }, { 0, 0, 0, 0, 0, 1 }, { 0, 1, 1, 1, 1, 1 }, { 0, 0, 1, 1, 1, 1 } };

	public static void main(String[] args) {
		int ans = 0;
		int N = a.length;
		int M = a[0].length;
		int i = 0;
		int j = M - 1;
		int count=0;

		while (i <= N-1 && j >= 0) {
			if (a[i][j] == 1) {
				j--;
				ans = i;
				count++;
			} else if (a[i][j] == 0) {
				i++;
			}
		}

		System.out.println(ans);
		System.out.println(count);
	}
}
