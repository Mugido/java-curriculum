package week_3.class_activity_17A.class_activity_13B;

public class ReverseStringEx {

   /* public static String reverseString(String input) {
        StringBuffer sb = new StringBuffer(input);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        String result = reverseString("hello");
        System.out.println(result);*/

       public static String reverseString(String input){
           StringBuffer sb = new StringBuffer(input);
           sb.reverse();
           return sb.toString();
    }

    public static void main(String[] args) {
        String result = reverseString("hello");
        System.out.println(result);
    }
}
