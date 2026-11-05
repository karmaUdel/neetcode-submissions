class Solution {
    public int longestConsecutive(int[] nums) {
        // option 1 sort the array and then 2 pointers till you find breakage or end of array (n logn) (1)
        // option 2 set and then iterate over it with 2 pointer (n) (n)
        Map<Integer, Integer> mp = new HashMap<>();
        int res = 0;

        for (int num : nums) {
            if (!mp.containsKey(num)) {
                mp.put(num, mp.getOrDefault(num - 1, 0) + mp.getOrDefault(num + 1, 0) + 1);
                mp.put(num - mp.getOrDefault(num - 1, 0), mp.get(num));
                mp.put(num + mp.getOrDefault(num + 1, 0), mp.get(num));
                res = Math.max(res, mp.get(num));
            }
        }
        return res;
    }
}
