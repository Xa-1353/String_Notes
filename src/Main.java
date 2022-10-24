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
        
    }
}