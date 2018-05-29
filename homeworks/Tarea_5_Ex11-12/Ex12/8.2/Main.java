public class Main {

	// Multiply every integer of the given array and returns the result
	public static int banana(int[] a) {
		// Store the result
		int kiwi = 1;
		// counter for the while loop
		int i = 0;
		while (i < a.length) {
			kiwi = kiwi * a[i];
			i++;
		}
		return kiwi;
	}

	// Finds the first element that matches grape and returns it's index, otherwise
	// return -1
	public static int grapefruit(int[] a, int grape) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == grape) {
				return i;
			}
		}
		return -1;
	}

	// Counts how many time a given value is in a given array
	public static int pineapple(int[] a, int apple) {
		// Counter
		int pear = 0;
		for (int pine : a) {
			if (pine == apple) {
				pear++;
			}
		}
		//Result
		return pear;
	}
}

