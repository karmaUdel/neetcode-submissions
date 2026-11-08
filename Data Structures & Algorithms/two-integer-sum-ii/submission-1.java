class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        int twoSum = 0;
        while(i<j){
            twoSum = numbers[i]+numbers[j];
            if(twoSum == target){
                return new int[] {i+1,j+1};
            }
            if(twoSum > target){
                j--;
            }else{
                i++;
            }
        }
        return new int [2];
    }
}
