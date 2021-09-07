package assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestIncreasingSubsequence {

	public List<Integer> getLongestSubsequence(int[] numbers) {
		Map<Integer, List<Integer>> hashMap = calculateSubSequences(numbers);

		int longestSeqKey = 0;
		int longestSeqSize = hashMap.get(0).size(); // Initializing to the size of 1st list
		List<Integer> longestIncreasingSubsequence;

		// Get the size of each subsequence and check the highest size
		// and store the key of longest increasing subsequence
		for (int i = 1; i < hashMap.size(); i++) {
			if (longestSeqSize < hashMap.get(i).size()) {
				longestSeqKey = i;
			}
		}
		longestIncreasingSubsequence = hashMap.get(longestSeqKey);
		
		return longestIncreasingSubsequence;
	}

	// Get all increasing subsequences and put into HashMap
	private Map<Integer, List<Integer>> calculateSubSequences(int[] numbers) {
		Map<Integer, List<Integer>> hashMap = new HashMap<Integer, List<Integer>>();
		List<Integer> newArr;
		for (int i = 0; i < numbers.length - 1; i++) {
			newArr = new ArrayList<Integer>();
			newArr.add(numbers[i]);
			// If the following number is greater than previous number add to the list
			for (int j = i; j < numbers.length - 2; j++) {
				if (numbers[j + 1] > numbers[j]) {
					newArr.add(numbers[j + 1]);
				}
			}
			hashMap.put(i, newArr);
		}
		return hashMap;
	}

}
