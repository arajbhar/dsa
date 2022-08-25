package graph;

public class CountIslands {

	static int[][] inp = { { 1, 1, 0, 0, 1 }, { 0, 1, 0, 1, 0 }, { 1, 0, 0, 1, 1 }, { 1, 1, 0, 0, 0 },
			{ 1, 0, 1, 1, 1 } };

	static int N = inp.length;
	static int M = inp[0].length;

	public static void main(String[] args) {
		int countOfIslands = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (inp[i][j] == 1) {
					dfs(inp, i, j);
					countOfIslands++;
				}
			}
		}
		
		System.out.println(countOfIslands);
	}

	private static void dfs(int[][] inp2, int r, int c) {

		if (r < 0 || r >= N || c < 0 || c >= M || inp2[r][c] == 0) {
			return;
		}

		int[] row = { -1, 0, 1, 0 };
		int[] col = { 0, 1, 0, -1 };
		inp2[r][c] = 0;
		for (int k = 0; k < 4; k++) {
			dfs(inp2, r + row[k], c + col[k]);
		}

	}

}
