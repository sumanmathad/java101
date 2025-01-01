package programs.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Stack;

public class LC_0344_ReverseString {

    @Test
    public void reverseStringWithReplace(){
        char[] s = {'h','e','l','l','o'};

        int i=0,j=s.length-1;
        char temp;
        while (i<j){
            temp =s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
        System.out.println(s);
    }

    @Test
    public void reverseStringWithStack(){
        char[] s = {'h','e','l','l','o'};
        System.out.println(s);
        Stack<Character> stk = new Stack<>();
        for(char c: s){
            stk.push(c);
        }

        for(int i=0;i<s.length;i++){
            s[i]=stk.pop();
        }
        System.out.println(s);




    }





}
