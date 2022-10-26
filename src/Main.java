public class Main {
    public static void main(String[] args) {
        //Strings
        //      0123456789
        String s = "howdy yall";
        //strings are immutable

        System.out.println(s.charAt(4));
        System.out.println(s.length());
        System.out.println(s.substring(3));     // fromt spot to the end
        System.out.println(s.substring(3,7));   //does not include the 3
        System.out.println(s.indexOf("how"));       //begins at spot 0 bc of h
        System.out.println(s.indexOf("dog"));
        System.out.println(s.lastIndexOf("all"));
        System.out.println(s.indexOf("y"));
        System.out.println(s.lastIndexOf("y"));

        s.toUpperCase();
        System.out.println(s);
        s = s.toUpperCase();

        String s1 = "one";
        String s2 = "two";
        // equals      and     compareTo
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));

        String one = "addyzedarethebest";
        String two = "09876543210";
        String three = "02 13 97 68 45 0";

        System.out.println( one.length() );
        System.out.println( two.length() );
        System.out.println( three.length() );
        System.out.println( one.charAt(2) );
        System.out.println( one.charAt(5) );
        System.out.println( one.charAt(one.length()-1));
        System.out.println( one.charAt(6) );
        System.out.println( one.substring(0,4) );
        System.out.println( one.substring(5) );
        System.out.println( one.substring(9) );
        System.out.println( one.substring(2,7) );
        System.out.println( one.indexOf("abc") );
        System.out.println( one.indexOf("e") );
        System.out.println((one.indexOf("hij")) );
        System.out.println( two.indexOf("54") );
        System.out.println( two.indexOf("24") );
        System.out.println( one.indexOf('y') );
        System.out.println( two.indexOf('b') );
        System.out.println( two.indexOf('s') );
        System.out.println( three.indexOf("45") );

    }
}