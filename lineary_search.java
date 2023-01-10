import java.util.*;
public class lineary_search {
    public static void main(String arg[]) {
        //int number[]={2,3,4,5,6,7,8,9,};
        String menu[]={"Samosa","Dosa","noddele","veg"};
        String key[]= "Dosa";
        //int key = 8; 
        int index = lineary(String,key);
        if (index==-1) {
            System.out.print("NOT FOUND");
        }
        else {
            System.out.print("The key indexed at="+index);
        }
    }   
    public static int lineary(String[],String key) {
        for(int i=0;i<menu.length;i++) {
        if( menu[i]== key) {
            return i;
        }
    } 
    return -1;
}
}
