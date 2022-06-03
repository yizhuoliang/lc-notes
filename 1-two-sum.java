import java.util.HashMap;

// two-pass hash table

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // calc the needed partner of each number
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(target - nums[i], i);
        }
        
        // traverse the array to look for partners
        for (int i = 0; i < nums.length; i++) {
            // note that we cannot use same element twice
            if (hm.containsKey(nums[i]) && i != hm.get(nums[i])) {
                int[] ans = {i, hm.get(nums[i])};
                return ans;
            }
        }
        return null;
    }
}


// O(n^2) brute force

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int[] ans = new int[2];
//         for (int i = 0; i < nums.length - 1; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (nums[i] + nums[j] == target) {
//                     ans[0] = i;
//                     ans[1] = j;
//                     return ans;
//                 }
//             }
//         }
//         return null;
//     }
// }