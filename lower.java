import java.util.*;
public class lower {
    public static String low(String str) {
        String s = str.toLowerCase();
        return s.toString();
    }
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(low(str));
    }
}
toLowerCase