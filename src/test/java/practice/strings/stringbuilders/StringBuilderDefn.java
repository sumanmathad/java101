package practice.strings.stringbuilders;

public class StringBuilderDefn {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("abc");
        StringBuilder sb2= sb1.append("def");

        sb1.append("ghi");
        System.out.println("sb1="+sb1);
        System.out.println("sb2="+sb2);

        //new is called only once and we have only one object here


        // three ways to construct a StringBuilder
        StringBuilder a1= new StringBuilder();
        System.out.println("a1="+a1);
        System.out.println(a1.length());
        System.out.println(a1.isEmpty());
        System.out.println("a1.capacity="+a1.capacity());



        StringBuilder a2= new StringBuilder("animal");
        System.out.println("a2="+a2);
        System.out.println(a2.length());
        System.out.println("a2.capacity="+a2.capacity());



        StringBuilder a3 = new StringBuilder(15);
        System.out.println("a3="+a3);
        System.out.println(a3.length());
        System.out.println("a3.capacity="+a3.capacity());

    }



}
