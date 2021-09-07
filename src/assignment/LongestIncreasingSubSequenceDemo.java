package assignment;

import java.util.List;

public class LongestIncreasingSubSequenceDemo {

	public static void main(String[] args) {

		int[] numbers = { 1, 20, 56, 12, 59, 90, 89 };

		LongestIncreasingSubsequence longIncSubsequences = new LongestIncreasingSubsequence();

		List<Integer> longestIncreasingSequence = longIncSubsequences.getLongestSubsequence(numbers);

		System.out.println("The longest sequence is " + longestIncreasingSequence);
	}
}
