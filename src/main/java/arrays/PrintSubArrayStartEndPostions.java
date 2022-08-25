package arrays;

public class PrintSubArrayStartEndPostions {
	
	static int[] a= {3,4,2,-1,6,7,8,9,3,2,-1,4};
	static int k=6;
	
	public static void main(String[] args) {
		
		for(int i=0;i<=a.length-k;i++) {
			int start=i;
			int end=i+k-1;
			System.out.println("Start idx : "+start + " "+"End idx : "+ end);
		}
		
	}
	

}
