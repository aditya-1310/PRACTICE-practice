import java.util.*;
public class key_search {
    public static boolean key_s (int mat[][],int key) {
        int row = 0 , col =mat[0].length-1;
        while(row<mat.length && col>=0) {
        if (mat[row][col]== key){
            System.out.println("key found at " + row + ","+col);
            return true;
        }
        else if (mat[row][col]>key){
            col--;
        }
        else  if (mat[row][col]<key){
            row++;
        }
        }
        System.out.println("key not found ");
        return false;
    }    
    public static void main(String args []) {
        int mat[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16, } };
                int key =15;
                key_s(mat,key);
    }
}
