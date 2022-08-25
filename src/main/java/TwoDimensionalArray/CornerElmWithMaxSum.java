package TwoDimensionalArray;

public class CornerElmWithMaxSum {

	static int[] a = { 10, 7, 3, 2, 5, 17, 20 };
	
	public static void main(String[] args) {
		int B=4;
		int N=a.length;
		int sum=0;
		
		for(int i=0;i<B;i++) {
			sum+=a[i];
		}
		
		int maxSum=sum;
		
		for(int i=1;i<=B;i++) {
			sum=sum-a[B-i]+a[N-i];
			
			if(sum>maxSum) {
				maxSum=sum;
			}
		}
		
		System.out.println(maxSum);
	}

}
