import java.util.*;
public class reverse
{
    public static boolean ispalindrome(int n)
    { 
        int reverse = 0;
        int temp=n;
        while(n>0) 
        {
        int lastdigit = n % 10;
        reverse = reverse *10 + lastdigit;
         n = n/10;
        }
        if (temp==reverse)  {
            return true;
        }
        return false;
        
      
    }
        
    public static void main(String arg []) {
        System.out.println(ispalindrome(121));

        }
    }


