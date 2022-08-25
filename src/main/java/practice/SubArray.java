package practice;

public class SubArray {
	
	public static boolean checkNonDecreasingSubArray(int[] A,int L,int R) {
		
		int N=A.length;
		int[] a=new int[N];
		
		a[0]=0;
		for(int i=1;i<N;i++) {
			if(A[i]>=A[i-1]) {
				a[i]=0;
			}else {
				a[i]=1;
			}
			
			a[i]=a[i-1]+a[i];
			
		}
		
		for(int i=0;i<N;i++) {
			
			System.out.println(a[i]);
		}
		
		
		for(int i=L;i<=R;i++) {
			if((a[R]-a[L])>0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String args[]) {
		
		int[] B= {1,4,4,7,6,8,2,10,20,21};
		
		System.out.println(checkNonDecreasingSubArray(B, 3, 6));
	}

}
