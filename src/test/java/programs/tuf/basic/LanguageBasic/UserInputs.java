package programs.tuf.basic.LanguageBasic;

import java.util.Scanner;

public class UserInputs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();
        sol.printNumber(sc);
    }

}

class Solution{
    public void printNumber(Scanner sc) {
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        System.out.print(num);
    }

}
