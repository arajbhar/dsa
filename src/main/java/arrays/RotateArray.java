package arrays;

public class RotateArray {
	static int[] a = { 4, 1, 6, 9, 2, 14, 7, 8, 3 };
	static int k = 4;

	public static void main(String[] args) {
		int[] ans = rotatebyK(a, k);

		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}

	}

	private static int[] rotatebyK(int[] a, int k) {

		a = reverse(a, 0, a.length - 1);
		a = reverse(a, 0, k - 1);
		a = reverse(a, k, a.length - 1);
		return a;

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
