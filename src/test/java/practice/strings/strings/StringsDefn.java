package practice.strings.strings;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class StringsDefn {

@Test
    void str1(){
    String justQuotes="";
    System.out.println("Just Quotes isBlank="+justQuotes.isBlank());
    System.out.println("Just Quotes isEmpty "+justQuotes.isEmpty());

    String oneSpace= " ";
    System.out.println("One space is Blank="+oneSpace.isBlank());
    System.out.println("One space isEmpty "+oneSpace.isEmpty());



}

@Test
    void strDefn(){


}



@Test
    void strLater(){
    String line="this is better line";
    System.out.println(Arrays.toString(line.split("\\s")));
    String moreWhitespace ="  this  is      not a good    line. ";
    System.out.println(moreWhitespace);
    System.out.println("Regex of \\s :"+ Arrays.toString(moreWhitespace.split("\\s")));
    System.out.println("Regex of \\s+ :"+Arrays.toString(moreWhitespace.split("\\s+")));
    System.out.println("Regex of \\s+ with strip :"+Arrays.toString(moreWhitespace.strip().split("\\s+")));
    System.out.println("Regex of empty Quotes :"+Arrays.toString(moreWhitespace.split("")));
    System.out.println("Regex of one space Quotes :"+Arrays.toString(moreWhitespace.split(" ")));

    //https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html

    System.out.println(moreWhitespace.replaceAll("^\\s+",""));  //replace in beginning
    System.out.println(moreWhitespace.replaceFirst("\\s+","")); // replace in beginning
    System.out.println(moreWhitespace.replaceAll("\\s+$",""));  // replace in end
    System.out.println(moreWhitespace.replace("\\s+$",""));  // No change as its not a char/ char sequence
}




}
