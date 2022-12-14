import java.util.*;
public class Hollow_Cyclender{
    public static void Hollcyc(int trow,int tclow) {
        for (int i =1; i<=trow;i++) {
            for(int j= 1;j<=tclow;j++) {
                if (i==1||i==trow||j==1||j==tclow) 
                System.out.print("*");
            else{
                System.out.print(" ");
            }
            }
            System.out.println();   
            }
        

            }
            public static void main(String args []) {
                Hollcyc(4, 5);
        }
    }
        
