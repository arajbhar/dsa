package practice;

public class MatrixPS {
	
	    public static int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {
	        int N=A.length;
	        int M=A[0].length;
	        int rowsum=0;
	        int colsum=0;
	        int sum=0;
	        int b=0;
	        int c=0;
	        int d=0;
	        int e=0;
	        int[] ans=new int[B.length];

	        int[][] ps=new int[N][M];

	        for(int i=0;i<N;i++){
	        	rowsum=0;
	            for(int j=0;j<M;j++){
	                rowsum=rowsum+A[i][j];
	                ps[i][j]=rowsum;
	                System.out.println(rowsum);
	            }
	        }

	        for(int j=0;j<M;j++){
	        	colsum=0;
	            for(int i=0;i<N;i++){
	                colsum=colsum+ps[i][j];
	                ps[i][j]=colsum;
	                System.out.println("*********");
	                System.out.println(colsum);
	            }
	        }

	        for(int i=0;i<B.length;i++){
	            b=B[i]-1;
	            c=C[i]-1;
	            d=D[i]-1;
	            e=E[i]-1;

	            if(b==0 && c==0 && d==0 && e==0){
	                sum=A[0][0];
	            }else if(b==0 && c==0){
	                sum=ps[d][e];
	            }else if(b==0 && c!=0){
	                sum=ps[d][e]-ps[d][c-1];
	            }else if(c==0 && b!=0){
	                sum=ps[d][e]-ps[b-1][e];
	            }else{
	                sum=ps[d][e]-ps[b-1][e]-ps[d][c-1]+ps[b-1][c-1];
	            }
	            
	            System.out.println(sum);
	            ans[i]=sum;
	            
	        }

	        return ans;
	    
	    }
	    
	    public static void main(String[] args) {
	    	
	    	int[] arr=new int[2];
	    	int[][] A= {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
	    	int[] B= {1,2};
	    	int[] C= {1,2};
	    	int[] D= {2,3};
	    	int[] E= {2,3};
	    	
	    	arr=solve(A,B,C,D,E);
	    	
	    	System.out.println("1st" + arr[0]+ "2nd elm " + arr[1]);
	    	
	    }
	}



