import java.util.*;
    public class binary_to_decimal {
      
            public static void binary( int bin) {
                 int dec = 0;
                 int pow = 0;
                 while(bin>0) {
                 int lastdigit = bin%10;
                   dec = dec + (lastdigit* (int)Math.pow(2, pow));
                   pow++;
                   bin=bin/10;
                  
                }
                System.out.print(bin+dec);

            }

        public static void main(String arg[]) {
            binary(111);


        }
            

        }
    
