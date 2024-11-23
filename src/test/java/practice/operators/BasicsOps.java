package practice.operators;

public class BasicsOps {

    public static void main(String[] args) {
        int i=99, j=99, k=99;

        System.out.println(++i);
        System.out.println(j++);
        // System.out.println(++k++);   compile error
        System.out.println("***");
        int a;
        System.out.println(a=9);

        System.out.println("Promotions");
            final int num=99;
            byte b =num;      // not permissible if final is removed in num assignment

    }
}
