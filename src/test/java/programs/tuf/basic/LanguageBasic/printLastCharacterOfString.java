package programs.tuf.basic.LanguageBasic;

public class printLastCharacterOfString {

    public static void main(String[] args) {
        String s = "example";

        // Function call to get the last character of the string
        char ans = lastChar(s);
        System.out.println("The last character is: " + ans);
    }

    public static char lastChar(String s){
        return s.charAt(s.length() - 1);

    }





}
