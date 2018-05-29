public class Main {
	public static int[] sieve(int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = 0;
		}
		int p = 2;
		result[0] = 1;
		result[p - 1] = 2;
		while (p < n) {
			for (int i = 2 * p; i < n; i = i + p) {
				result[i - 1] = 1;
			}
			for (int i = p; i < n; i++) {
				if (result[i] == 0) {
					p = i + 1;
					result[i] = 2;
					break;
				}
				if (i == n - 1) {
					return result;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println("Main");
		int n = 120;
		int[] result = Main.sieve(n);
		boolean value;
		for (int i = 0; i < n; i++) {
			value = result[i] == 2 ? true : false;
			System.out.println(i + ": " + value);
		}

	}
}

