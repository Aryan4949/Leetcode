class Solution {
    public int removeDuplicates(int[] nums) {
        // O(n) O(1)
        int index=0;
        for(int i=1;i<nums.length;i++){
            if(nums[index]!=nums[i])nums[++index]=nums[i];
        }
        return index+1;
    }
}