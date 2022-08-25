package TwoDimensionalArray;

public class PrintSpiral {

	static int[][] a = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
			{ 21, 22, 23, 24, 25 } };

	public static void main(String[] args) {
		int N = a.length;
		int M = a[0].length;
		int T = 0; // top
		int B = N - 1; // Bottom
		int L = 0; // Left
		int R = M - 1; // Right

		while (T <= N - 1 && B >= 0 && L <= M - 1 && R >= 0) {
			// print top row left to right
			for (int k = L; k <= R; k++) {
				System.out.println(a[T][k]);
			}

			T++;

			// print last column except top right cell
			for (int k = T; k <= B; k++) {
				System.out.println(a[k][R]);
			}

			R--;

			// print last row right to left except bottom right cell
			for (int k = R; k >= L; k--) {
				System.out.println(a[B][k]);
			}

			B--;

			// print first col bottom to up except left bottom cell
			for (int k = B; k >= T; k--) {
				System.out.println(a[k][L]);
			}

			L++;

		}

	}

}
