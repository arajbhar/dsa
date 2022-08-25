package graph;

public class ConflictedArea {

	static char[][] inp = { { 'I', 'I', 'P', 'I', 'I' }, { 'I', 'P', 'P', 'I', 'I' }, { 'I', 'I', 'I', 'I', 'I' },
			{ 'I', 'P', 'I', 'I', 'P' }, { 'I', 'P', 'P', 'I', 'P' }, { 'I', 'I', 'I', 'I', 'P' },
			{ 'I', 'I', 'I', 'P', 'I' } };
	
	static int N=inp.length;
	static int M=inp[0].length;
	
	static int[] row= {-1,0,1,0};
	static int[] col= {0,1,0,-1};
	
	public static void main(String[] args) {
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(inp[0][j]=='P') {
					dfs(0,j);
				}
				if(inp[i][M-1]=='P') {
					dfs(i,M-1);
				}
				if(inp[N-1][j]=='P') {
					dfs(N-1,j);
				}
				if(inp[i][0]=='P') {
					dfs(i,0);
				}
			}
			
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(inp[i][j]=='P') {
					inp[i][j]='I';
				}
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(inp[i][j]=='O') {
					inp[i][j]='P';
				}
				System.out.print(" "+inp[i][j]+" ");
			}
		}
	}
	
	private static void dfs(int i,int j) {
		
		if(i<0 || i>=N || j<0 || j>=M || inp[i][j]=='O' || inp[i][j]=='I') {
			return;
		}
		
		inp[i][j]='O';
		
		for(int k=0;k<4;k++) {
			dfs(i+row[k],j+col[k]);
		}
		
	}

}
