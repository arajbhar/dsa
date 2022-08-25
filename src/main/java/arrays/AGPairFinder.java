package arrays;

public class AGPairFinder {
	
	static String s="acbagkagg";
	
	public static void main(String[] args) {
		
		int countA=0;
		int ans=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a') {
				countA++;
			}
			if(s.charAt(i)=='g') {
				ans=ans+countA;
			}
		}
		
		System.out.println(ans);
		
		
	}
	

}
