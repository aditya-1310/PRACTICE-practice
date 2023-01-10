import java.util.*;
public class Array {
    public static void update(int marks[]) {
        for (int i=0;i<marks.length;i++) {
            marks[i] =marks[i]+1;
        }
    }
    public static void main(String arg[]) {
        int marks[]  = {90,88,95}; 
        update(marks);
        for (int i=0;i<marks.length;i++) {
            System.out.print(marks[i]+" ");
        }
        System.out.println();

        
    }
    
}
