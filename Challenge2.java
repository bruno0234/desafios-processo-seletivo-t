/*
	This source code has two different solutions, namely containsA1() and
	containsA2(), for the first part of the second challenge, and two different solutions, namely
	countLetterA1() and countLetterA2(), for the second part of the second challenge
*/

public class Challenge2 {
	public static void main(String[] args) {

		showFirstPartOfSolution();

		System.out.println();

		showSecondPartOfSolution();
	}

	public static void showFirstPartOfSolution() {
		String[] strs = {"BCDEAAA", "AA", "BCDE", "bcdeaaa", "aa", "bcde", ""};

		System.out.println("First part of the solution:\n");

		System.out.println("Using solution 1:\n");
		for (String str : strs) {
			System.out.printf("Does \"%s\" contain 'a'? %s%n", str, containsA1(str) ? "Yes" : "No");
		}

		System.out.println("\nUsing solution 2:\n");
		for (String str : strs) {
			System.out.printf("Does \"%s\" contain 'a'? %s%n", str, containsA2(str) ? "Yes" : "No");
		}
	}

	public static void showSecondPartOfSolution() {
		String[] strs = {"BCDEAAA", "AA", "BCDE", "bcdeaaa", "aa", "bcde", ""};

		System.out.println("Second part of the solution:\n");

		System.out.println("Using solution 1:\n");
		for (String str : strs) {
			System.out.printf("Number of occurrences of 'a' in \"%s\": %d%n", str, countLetterA1(str));
		}

		System.out.println("\nUsing solution 2:\n");
		for (String str : strs) {
			System.out.printf("Number of occurrences of 'a' in \"%s\": %d%n", str, countLetterA2(str));
		}
	}

	public static boolean containsA1(String str) {
		return str.toLowerCase().contains("a");
	}

	public static boolean containsA2(String str) {
		return str.toLowerCase().indexOf('a') != -1;
	}

	public static int countLetterA1(String str) {
		int count = 0;
		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				count++;
			}
		}
		return count;
	}

	public static long countLetterA2(String str) {
		return str.toLowerCase()
				.chars()
				.filter(ch -> ch == 'a')
				.count();
	}
}
