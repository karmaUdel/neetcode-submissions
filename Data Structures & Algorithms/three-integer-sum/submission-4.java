class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            // if value is positive, so sorted make all right element's sum > 0
            if (nums[i] > 0) break;
            // ignore duplicates 
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            // 2 sum nums[l], nums[r] == nums[i]
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                // positive value is too high
                if (sum > 0) {
                    r--;
                    // negative value is too high
                } else if (sum < 0) {
                    l++;
                } else {
                    // sum == 0
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    
                    // try to find another pair
                    l++;
                    r--;
                    // skip duplicates
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                }
            }
        }
        return res;
    }
}
