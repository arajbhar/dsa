package practice;

public class Matrix {

	public int solve(int[][] A, int B) {
		int N = A.length;
		int M = A[0].length;
		int p = 0;
		int q = 0;

		if (N == M && N == 1) {
			if (A[0][0] != B) {
				return -1;
			}
		}

		int i = 0;
		int j = M - 1;

		while (i < N && j >= 0) {
			if (A[i][j] > B) {
				j--;
			} else if (A[i][j] < B) {
				i++;
			} else {
				p = i;
				q = j;
				if (q == 0) {
					return (p + 1) * 1009 + (q + 1);
				}
				break;
			}

		}

		while (A[p][q] == B && q >= 0) {
			q--;
		}

		q = q + 1;

		if (A[p][q] == B) {
			return (p + 1) * 1009 + (q + 1);
		}

		return -1;
	}
}
