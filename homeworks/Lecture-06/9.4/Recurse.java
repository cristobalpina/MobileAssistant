
public class Recurse {
	/**
	 * Returns the first character of the given String.
	 */
	public static char first(String s) {
		return s.charAt(0);
	}

	/**
	 * Returns all but the first letter of the given String.
	 */
	public static String rest(String s) {
		return s.substring(1);
	}

	/**
	 * Returns all but the first and last letter of the String.
	 */
	public static String middle(String s) {
		return s.substring(1, s.length() - 1);
	}

	/**
	 * Returns the length of the given String.
	 */
	public static int length(String s) {
		return s.length();
	}

	/**
	 * Prints a string char by char in different lines.
	 */
	public static void printString(String s) {
		int n = s.length();
		for (int i = 0; i < n; i++) {
			System.out.println(s.charAt(i));
		}
	}

	/**
	 * Print backwards a string, char by char in different lines.
	 */
	public static void printBackward(String s) {
		int n = s.length();
		for (int i = 0; i < n; i++) {
			System.out.println(s.charAt(n - 1 - i));
		}
	}

	/**
	 * Returns a string backwards.
	 */
	public static String reverseString(String s) {
		int n = s.length();
		String result = "";
		for (int i = 0; i < n; i++) {
			result += s.charAt(n - 1 - i);
		}
		return result;
	}

	/**
	 * Returns a string backwards.
	 */
	public static boolean isPalindrome(String s) {
		int n = s.length();
		if(n <= 1) {
			return true;
		}
		if(s.charAt(0) == s.charAt(n-1)) {
			return isPalindrome(s.substring(1, n-1));
		}
		return false;
	}

	public static void main(String[] args) {
		String hello = "Hello World";

		// Test first
		if ("H".equals(first(hello))) {
			System.out.println("First Pass");
		} else {
			System.out.println("First Error");
		}

		// Test Rest
		if ("ello World".equals(rest(hello))) {
			System.out.println("Rest Pass");
		} else {
			System.out.println("Rest Error");
		}

		// Test Middle
		if ("ello Worl".equals(middle(hello))) {
			System.out.println("Middle Pass");
		} else {
			System.out.println("Middle Error");
		}

		// Test Length
		if (length(hello) == 11) {
			System.out.println("Length Pass");
		} else {
			System.out.println("Length Error");
		}

		printString(hello);
		printBackward(hello);
		String reverse = reverseString(hello);
		System.out.println(reverse);
		boolean palindrome = isPalindrome("heoeh");
		
		System.out.println(palindrome);

	}

}

