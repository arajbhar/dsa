package primenumbers;

public class CheckIfPrimeB {
	
	public static boolean checkPrime(int N) {
		
		for(int i=2;i*i<=N;i++) {
			if(N%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int A=113;
		boolean a=checkPrime(A);
		
		System.out.println(a);
	}
}
