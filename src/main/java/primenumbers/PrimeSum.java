package primenumbers;

public class PrimeSum {
	public static int[] primesum(int A) {
		int[] prime = new int[A + 1];
		int[] ans = new int[2];

		prime[0] = 1;
		prime[1] = 1;
		for (int i = 2; i * i <= A; i++) {
			if (prime[i] == 0) {
				for (int j = i * i; j <= A; j = j + i) {
					if (prime[j] == 0) {
						prime[j] = 1;
					}
				}
			}
		}

		for (int i = 2; i <= A; i++) {
			if (prime[i] == 0 && prime[A - i] == 0) {
				ans[0] = i;
				ans[1] = A - i;
				break;
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		int N = 10;
		int[] arr = primesum(N);

		System.out.println("1st elm " + arr[0] + " " + arr[1]);
	}

}
