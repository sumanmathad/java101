package programs.leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class LC1941_GoodStrings {

    public static void main(String[] args) {
        String s= "aabb3443deed";
        System.out.println(areOccurrencesEqual(s));

    }
    public static boolean areOccurrencesEqual(String s) {
        char[] arr= s.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
            for(char c : arr){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else  map.put(c,1);
            }
        HashSet<Integer> set = new HashSet<>(map.values());
        return set.size()==1? true: false;
    }



}
