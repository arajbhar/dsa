package arrays;

public class RainWaterTapping {
	
	static int[] a = {7,0,4,2,5,0,6,4,0,5};
	static int N=a.length;
	
	public static void main(String[] args) {
		
		//build leftMax array
		int[] lmax=new int[N];
		lmax[0]=a[0];
		for(int i=1;i<N;i++) {
			lmax[i]=Math.max(lmax[i-1], a[i]);
		}
		
		//build rightMax array
		int[] rmax=new int[N];
		rmax[N-1]=a[N-1];
		for(int i=N-2;i>=0;i--) {
			rmax[i]=Math.max(rmax[i+1], a[i]);
		}
		
		int ans=calcTrappedRainWater(lmax, rmax);
		
		System.out.println(ans);
	}
	
	public static int calcTrappedRainWater(int[] lmax,int[] rmax) {
		int heightOfWater=0;
		int tappedVolWater=0;
		
		for(int i=0;i<N;i++) {
			heightOfWater=Math.min(lmax[i], rmax[i])-a[i];
			if(heightOfWater>0) {
				tappedVolWater=tappedVolWater+heightOfWater*1;
			}
		}
		
		return tappedVolWater;
	}

}
