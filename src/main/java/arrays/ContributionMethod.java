package arrays;

public class ContributionMethod {
	static int[] a= {3,-2,4,-1,2,6};
	
	public static void main(String[] args) {
		
		int s=0;
		int e=0;
		int sum=0;
		for(int i=0;i<a.length;i++) {
			s=i+1;          //# of subarrays with start idx from 0->i
			e=a.length-i;   //# of subarrays with end idx from i->N-1
			sum=sum+a[i]*s*e;
		}
		
		System.out.println(sum);
	}

}
