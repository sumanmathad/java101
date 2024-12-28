package practice.strings.strings;

import org.junit.jupiter.api.Test;

public class StringConcepts {


    @Test
        void CheckStringPool(){

        String str1= "Hello";
        String str2= "Hello";

        String str3="He";
        String str4= str3+"llo";
        final String str5= "He";
        String str6= str5 +"llo";

        System.out.println("str1 == str2 ?" +(str1==str2));
        System.out.println("str1 == str4 ?" +(str1==str4));
        System.out.println("str1 == str6 ?" +(str1==str6));

        str4=str4.intern();
        System.out.println("str1 == str4 ?" +(str1==str4));

    }


}
