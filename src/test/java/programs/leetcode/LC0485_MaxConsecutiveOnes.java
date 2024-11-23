package programs.leetcode;

public class LC0485_MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count=0, maxCount=0, l=nums.length;
        for(int i=0;i<l;i++){
            if (nums[i]==1){
                count++;
            }
            else {
                maxCount = Math.max(count,maxCount);
                count=0;
            }
        }

        return Math.max(count,maxCount);
    }


}

