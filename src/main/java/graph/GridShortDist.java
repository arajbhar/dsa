package graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class GridShortDist {
	static int[][] inp = { { 0, 0, 0, 1, 0 }, { 0, 1, 0, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 1, 0, 0, 0 },
			{ 1, 0, 0, 1, 0 } };
	static int N = inp.length;
	static int M = inp[0].length;
	static Queue<GridBox> q = new LinkedList<GridBox>();
	static int[][] visited = new int[N][M];

	public static void main(String[] args) {

		GridBox sBox = new GridBox(1, 0, 0);
		GridBox tBox = new GridBox(3, 4, 0);

		for (int i = 0; i < visited.length; i++) {
			Arrays.fill(visited[i], 0);
		}

		int shortestDist = calcShortDist(sBox, tBox);
		System.out.println(shortestDist);

	}

	static int calcShortDist(GridBox s, GridBox t) {

		q.add(s);
		visited[s.i][s.j] = 1;

		int[] row = { -1, 0, 1, 0 };
		int[] col = { 0, 1, 0, -1 };

		while (!q.isEmpty()) {
			GridBox currNode = q.poll();
			for (int k = 0; k < 4; k++) {
				int i = currNode.i + row[k];
				int j = currNode.j + col[k];

				if (i >= 0 && i < N && j >= 0 && j < M && inp[i][j] != 1 && visited[i][j] != 1) {
					GridBox w = new GridBox(i, j, currNode.dist + 1);
					visited[i][j] = 1;
					if (i == t.i && j == t.j) {
						return w.dist;
					}
					q.add(w);
				}
			}

		}

		return -1;
	}

}

class GridBox {
	int i;
	int j;
	int dist;

	public GridBox(int x, int y, int z) {
		this.i = x;
		this.j = y;
		this.dist = z;
	}
}
