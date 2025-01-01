package programs.leetcode;

import org.junit.jupiter.api.Test;

public class LC0485_MaxConsecutiveOnes {

    @Test
    void maxConsecutiveOnes(){
        int[] nums = {1,0,1,1,1,1,1,1,1,0,1,1,1,1};

        int maxCount=0,count =0;

        for (int i =0; i<nums.length;i++){

            if(nums[i]==1){
                count++;
            }
            else {
                    maxCount=Math.max(count,maxCount);
                    count=0;
                }
            }
        System.out.println( Math.max(count,maxCount));
        }

    }



