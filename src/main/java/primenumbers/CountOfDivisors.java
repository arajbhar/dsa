package primenumbers;

public class CountOfDivisors {
	
	public static int[] countDivisors(int[] A) {
		int n=A.length;
		int[] O=new int[n];
		int count=0;
		
		for(int i=0;i<n;i++) {
			count=0;
			for(int j=1;j<=A[i];j++) {
				if(A[i]%j==0) {
					count++;
				}
			}
			
			O[i]=count;
		}
		
		return O;
	}
	
	public static void main(String[] args) {
		int[] A= {2,3,4,5};
		int[] D=countDivisors(A);
		
		for(int a: D) {
			System.out.println(a);
		}
		
	}

}
