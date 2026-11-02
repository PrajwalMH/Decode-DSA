
import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {

        // Store unique numbers in a HashSet
        Set<Integer> num_set = new HashSet<>();

        for (int num : nums) {
            num_set.add(num);
        }

        // Stores the longest sequence length found
        int longestStreak = 0;

        // Check each unique number
        for (int num : num_set) {

            // Only start counting if this number
            // is the beginning of a sequence
            if (!num_set.contains(num - 1)) {

                int currentNum = num;
                int currentStreak = 1;

                // Look for the next consecutive number
                while (num_set.contains(currentNum + 1)) {

                    currentNum += 1;
                    currentStreak += 1;
                }

                // Update the longest sequence
                longestStreak =
                    Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
