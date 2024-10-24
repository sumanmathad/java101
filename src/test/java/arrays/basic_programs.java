package arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class basic_programs {

    @Test
    void reverseAnArray(){
        int[] numbers = {3,6,9,12,15,18,21};
        int temp;
        for(int i=0,j= numbers.length-1 ;i< numbers.length/2;i++,j--){
            swapElementsInIntArray(numbers,i,j);
        }
        System.out.println(Arrays.toString(numbers));
    }

     void swapElementsInIntArray(int[] nums, int a, int b){
        int temp;
        temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }

    @Test
    void moveZeroesToEnd(){
        
    }






}
