package arrays;

public class MaxSumSubarray {
	static int[] a= {-3,4,-2,5,3,-2,8,2,-1,4};
	static int k=5;
	
	public static void main(String[] args) {
		
		int sum=0;
		
		//calculate sum of 1st k size window which starts from index 0
		for(int i=0;i<k;i++) {
			sum=sum+a[i];
		}
		
		System.out.println(sum);
		
		int maxSum=sum;
		
		//iterate over all k size window by sliding window and find maxsum
		for(int i=1;i<=a.length-k;i++) {
			int s=i;
			int e=i+k-1;
			sum=sum-a[i-1]+a[i+k-1];
			System.out.println(sum);
			
			if(sum>maxSum) {
				maxSum=sum;
			}
		}
		
		System.out.println("Max sum subArray : "+ maxSum);
	}

}
