package practice;

import java.util.HashMap;

public class GCD1 {
	public static int solve(int[] A, int B) {
		int n = A.length;
		int ans = 0;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {
			A[i] = A[i] % B;
		}

		for (int i = 0; i < n; i++) {
			if (hm.containsKey(A[i])) {
				hm.put(A[i], hm.get(A[i]) + 1);
			} else {
				hm.put(A[i], 1);
			}
		}
		
		//iterate over hashmap
		
		for(Integer a: hm.keySet()) {
			System.out.println("Key :" + a + " Value :" + hm.get(a));
		}

		for (int i = 1; i <= B / 2; i++) {
			if (hm.containsKey(i) && hm.containsKey(B - i)) {
				if ((B - i) != i) {
					ans = ans + (hm.get(i) * hm.get(B - i));
				} else {
					ans = ans + hm.get(i);
				}
			}
		}
		
		System.out.println("Value1 of ans : " + ans);

		if (hm.containsKey(0)) {
			int a = hm.get(0);
			ans = ans + ((a * (a - 1)) / 2);
		}
		
		System.out.println("Value2 of ans : " + ans);

		return ans;
	}

	public static void main(String args[]) {
		int[] A= {818, 63, 386, 563, 876, 855, 731, 933, 97, 935, 710, 27, 383, 975, 582, 188, 843, 569, 742, 834, 859, 938, 894, 554, 31, 506, 679, 153, 191, 816, 716, 698, 352, 688, 586, 206, 228, 418, 543, 996, 918, 55, 666, 133, 468, 494, 667, 596, 251, 189, 853, 15, 571, 794, 560, 835, 439, 923, 933, 789, 203, 527, 106, 401, 623, 97, 661, 53, 1, 17, 773, 835, 191, 887, 568, 987, 667, 620, 52, 253, 334, 373, 427, 891, 455, 186, 742, 375, 855, 288, 574, 67, 590, 628, 926, 260, 376, 110, 548, 40, 365, 398, 704, 328, 340, 927, 755, 356};
	    int B=96;
	    int ans=solve(A, B);
	    System.out.println(ans);
	}
	

}
