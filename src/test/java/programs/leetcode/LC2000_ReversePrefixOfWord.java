package programs.leetcode;

import java.sql.SQLOutput;
import java.util.Arrays;

public class LC2000_ReversePrefixOfWord {


    public static void main(String[] args) {
        String word = "sumansworld";
        char c='n';
        System.out.println(reversePrefix(word.substring(0,word.indexOf(c)+1)) + word.substring(word.indexOf(c)+1));
    }

    public static String reversePrefix(String reverse) {
        char[] arr = reverse.toCharArray();
        int left=0, right=arr.length-1;

        while(left<right){
            char temp;
            temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        StringBuilder builder = new StringBuilder();
        for (char value : arr) {
            builder.append(value);
        }
        return builder.toString();
    }





}
