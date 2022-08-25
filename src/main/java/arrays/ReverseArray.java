package arrays;

public class ReverseArray {

	static int[] a = { 4, 1, 6, 9, 2, 14, 7, 8, 3 };

	public static void main(String[] args) {
		int[] ans = reverse(a, 0, a.length - 1);
		for (int i = 0; i < a.length; i++) {
			System.out.println(ans[i]);
		}

	}

	private static int[] reverse(int[] a, int s, int e) {
		int temp = 0;
		while (s <= e) {
			temp = a[s];
			a[s] = a[e];
			a[e] = temp;
			s++;
			e--;
		}

		return a;
	}

}
