package programs.tuf.BeginnerPrograms.BasicStrings;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Stack;
import java.util.Vector;

public class ReverseString {

    public static void main(String[] args) {
    Vector<Character> s = new Vector<>();
        s.add('h');
        s.add('e');
        s.add('l');
        s.add('l');
        s.add('o');
    Vector<Character> revS = reverseString(s);
        for(char c : revS){
            System.out.print(c);
        }

    }

    public static Vector<Character> reverseString(Vector<Character> s) {
        Stack<Character> stk = new Stack();
        for( char c:s){
            stk.push(c);
        }
        for(int i =0; i<s.size();i++){
            s.set(i, stk.pop());
        }

        return s;
    }


}




