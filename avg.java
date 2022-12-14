import java.util.*;
public class avg {
  public static void main (String arg []) {
   Scanner af = new Scanner(System.in) ;
   double a = af.nextInt();
   double b = af.nextInt();
   double c = af.nextInt();
   System.out.println("avg is ="+avg(a,b,c)) ;
  }
  
  public static double avg(double a ,double b ,double c) {
   
   return (a+b+c)/3;
   
  }
  
  }

