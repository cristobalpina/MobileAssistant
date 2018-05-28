public class Main {
	public static int maxInRange(int[] array, int lowIndex, int 
highIndex) throws Exception {
		if (lowIndex < 0 || lowIndex >= array.length) {
			throw new Exception("lowIndex out of bounds");
		}
		if (highIndex < 0 || highIndex >= array.length) {
			throw new Exception("highIndex out of bounds");
		}

		if (lowIndex == highIndex)
			return array[lowIndex];

		if (array[lowIndex] > array[highIndex]) {
			return maxInRange(array, lowIndex, highIndex - 
1);
		} else if (array[lowIndex] < array[highIndex]) {
			return maxInRange(array, lowIndex + 1, 
highIndex);
		} else {
			return maxInRange(array, lowIndex + 1, 
highIndex);
		}

	}

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 15, 6, 9, 8, 7, 6, 5, 5 };
		int result;
		try {
			result = maxInRange(numbers, 0, numbers.length - 
1);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}

