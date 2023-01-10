import java.util.*;
public class largestArray {
    public static int large(int number[]){
        int larger=Integer.MIN_VALUE;// - INFINITY
        int small=Integer.MAX_VALUE;//- +infinity
        for(int i=0;i<number.length;i++) {
        if(number[i]>larger) {
            larger=number[i] ;
        }
        if(number [i]<small) {
            small=number[i] ;
            System.out.println("the smallest number is = "+ small );
        }
    }
    return larger;
}
public static void main (String arg[]) {
    int number[]={1,2,3,6,5,4,6,7} ;
    System.out.print("The largest number is = "+large(number));
    
    }
}

