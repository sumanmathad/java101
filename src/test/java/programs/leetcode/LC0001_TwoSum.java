package programs.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC0001_TwoSum {

    public static void main(String[] args) {
        int [] nums ={2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length;i++){
            int complement=target-nums[i];
            if(map.containsKey(complement)){
                return (new int[]{map.get(complement),i});
            }
            else {
                map.put(nums[i],i);
            }
        }
        return null;

    }

}
