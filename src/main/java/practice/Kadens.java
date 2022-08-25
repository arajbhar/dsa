package practice;

public class Kadens {
	
	public static int findMaxSubArr(int[] A) {
		int N=A.length;
		int currSum=0;
		int maxSum=Integer.MIN_VALUE;
		
		for(int i=0;i<N;i++) {
			currSum+=A[i];
			
			maxSum=Math.max(maxSum, currSum);
			
			if(currSum<0) {
				currSum=0;
			}
		}
		return maxSum;
	}
	
	public static void main(String args[]) {
		int[] A= {-2,1,-3,4,-1,2,1,-5,4};
		
		int a=findMaxSubArr(A);
		
		System.out.println(a);	
		
	}

}
