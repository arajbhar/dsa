package primenumbers;

public class FindPrimeNumbers {
	
	public static void getPrimeNumbers(int N) {
		
		
		for(int i=2;i<N;i++) {
			
			if(CheckIfPrimeB.checkPrime(i)) {
				System.out.println(i);;
				
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		int N=24;
		
		getPrimeNumbers(N);
	}

}
