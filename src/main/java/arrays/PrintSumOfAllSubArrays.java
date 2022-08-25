package arrays;

public class PrintSumOfAllSubArrays {
	
	static int[] a= {-3,4,-2,5,3,-2,8,2,-1,4};
	
	public static void main(String[] args) {
		
		
		for(int s=0;s<a.length;s++) {
			int sum=0;
			System.out.println("Start idx : "+s);
			for(int e=s;e<a.length;e++) {
				System.out.println("End idx : "+e);
				sum=sum+a[e];
				System.out.println(sum);
			}
		}
	}

}
