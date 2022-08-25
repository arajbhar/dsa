package TwoDimensionalArray;

public class BuildSpiralMatrix {

	public static void main(String[] args) {
		int N = 5;
		int M = 5;
		int[][] a = new int[N][M];
		int T = 0; // top
		int B = N - 1; // Bottom
		int L = 0; // Left
		int R = M - 1; // Right
		int c = 1;

		while (T <= N - 1 && B >= 0 && L <= M - 1 && R >= 0) {
			// print top row left to right
			for (int k = L; k <= R; k++) {
				a[T][k] = c++;
				System.out.println(a[T][k]);

			}

			T++;

			// print last column except top right cell
			for (int k = T; k <= B; k++) {
				a[k][R] = c++;
				System.out.println(a[k][R]);
			}

			R--;

			// print last row right to left except bottom right cell
			for (int k = R; k >= L; k--) {
				a[B][k] = c++;
				System.out.println(a[B][k]);
			}

			B--;

			// print first col bottom to up except left bottom cell
			for (int k = B; k >= T; k--) {
				a[k][L] = c++;
				System.out.println(a[k][L]);
			}

			L++;

		}
	}
}
