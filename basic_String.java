import java.util.*;
public class basic_String {
    public static void name() {
        Scanner sc = new Scanner (System.in);
        String s1= sc.next();
        String s2  = new String("ADITYA");
        if (s1.equals(s2)) {
            System.out.println("EQUAL");
        }
        else{
            System.out.println("not");
        }
        
    }
    public static void other() 
    {
        String ss = "Saad WASIM";
        
        System.out.println(ss.substring(0,6));
    }
    public static void or() 
    {
        String s = "asdg";
        String sa ="sdfg";
        System.out.print(sa.compareTo(s));
    }
    public static void main(String args[]) {
        // other();
        // name();
        or();
    }
}
