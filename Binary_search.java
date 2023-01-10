import java.util.*;
public class Binary_search{
    public static  int binary_src(int number[],int key) 
{
    {
            int start=0,end=number.length-1;
            while(start<=end)
        {
            int mid= (start+end)/2;
            if  (number[mid]>key)
            {
                end=mid-1;
            }
            else 
            {
                start=mid+1;
            }
            if(number[mid]==key)
            {
                return mid;
            }
        
        }
            return -1;
    }
}

    public static void main (String arg[]) {
        int number[]={1,2,3,4,5,6,7};
        int key = 5;
        System.out.println(binary_src(number,key));
}

}