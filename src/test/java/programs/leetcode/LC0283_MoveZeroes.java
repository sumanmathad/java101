package programs.leetcode;

import java.util.Arrays;

public class LC0283_MoveZeroes {

    public static void main(String[] args) {
        int[]nums={0,1,0,2,3,0,4};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

    }
    public static void moveZeroes(int[] nums) {

        int writer=0;
        for(int reader=0;reader<nums.length;reader++){
            if(!(nums[reader]==0)) {
                nums[writer] = nums[reader];
                writer++;
            }

        }
        for(int i=writer;i<nums.length;i++){
            nums[i]=0;
        }

    }

}
