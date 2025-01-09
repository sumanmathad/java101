package programs.tuf.basic.BasicMaths;

public class CountDigits {

    public static void main(String[] args) {

        int n = 465;
        System.out.println(countDigitByDivide(n));
        System.out.println(countDigitByFormula(n));

    }

    public static int countDigitByDivide(int n) {
        int count = 0;
        if (n / 10 == 0)
            count = 1;

        else {
            while (n > 0) {
                n=n/10;
                count++;
            }
        }
        return count;
    }

    //mathematical formula: count = log10(N) + 1
    public static int countDigitByFormula(int n){
        if(n/10==0)
            return 1;

        else {
            return (int)Math.log10(n)+1;
        }

    }

}
