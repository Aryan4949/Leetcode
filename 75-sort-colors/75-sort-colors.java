class Solution {
    public void sortColors(int[] nums) {
        int l=0;
        int j=0;
        int k =nums.length;
        
        for(int num:nums){
            if(num==1) l++;
            if (num==2) j++;
        }
for(int i=0; i<k; i++){
    
if(i<k-(l+j))nums[i]=0;
 else if(i<k-j)nums[i]=1;
   else nums[i]=2;
            }
    }
}