package arrays;

public class FindEquilibriumIndex {
	
	static int[] a= {1,2,3,4,8,10};
	
	public static void main(String[] args) {
		
		//prepare prefix sum array
		int[] ps=new int[a.length];
		
		ps[0]=a[0];
		for(int i=1;i<a.length;i++) {
			ps[i]=ps[i-1]+a[i];
		}
		
		//find equilibrium index
		for(int i=1;i<a.length-1;i++) {
			int sumLeft=ps[i-1];
			System.out.println("sumLeft : "+ sumLeft);
			int sumRight=ps[a.length-1]-ps[i];
			System.out.println("Sum right : "+ sumRight);
			if(sumLeft==sumRight) {
				System.out.println("Equilibrium index is : " + i);
			}
		}
	}

}
