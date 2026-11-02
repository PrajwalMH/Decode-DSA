
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        // Stores the previous k numbers
        Set<Integer> set = new HashSet<>();

        // Traverse the array
        for (int i = 0; i < nums.length; ++i) {

            // If the current number is already in the set,
            // a duplicate exists within distance k
            if (set.contains(nums[i])) {
                return true;
            }

            // Add the current number to the set
            set.add(nums[i]);

            // Keep the sliding window at size k
            if (set.size() > k) {

                // Remove the oldest element
                set.remove(nums[i - k]);
            }
        }

        // No nearby duplicates found
        return false;
    }
}
