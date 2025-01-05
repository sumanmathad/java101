package programs.tuf.BeginnerPrograms.LanguageBasic;

public class PrintX_NTimes {

    public static void main(String[] args) {
        int X = 7, N = 0;
        printX(X, N);
    }

    public static void printX(int X,int N) {

        for (int i = 1; i <= N; i++) {
            System.out.print(X);
        }
        System.out.println();

    }
}
