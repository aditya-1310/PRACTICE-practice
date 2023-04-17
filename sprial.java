import java.util.*;

public class sprial {
    public static void sprialprint(int mat[][]) {
        int srow = 0;
        int scol = 0;
        int erow = mat.length - 1;
        int ecol = mat[0].length - 1;
        while (srow <= erow && scol <= ecol) {
            // for top row
            for (int j = scol; j <= ecol; j++) {
                System.out.print(mat[srow][j] + " ");
            }
            for (int i = srow + 1; i <= erow; i++) {
                System.out.print(mat[i][ecol] + " ");
            }
            for (int j = ecol - 1; j >= scol; j--) {
                if (srow == erow) {
                    break;
                }
                System.out.print(mat[erow][j] + " ");
            }
            for (int i = erow - 1; i >= srow; i--) {
                if (scol == ecol) {
                    break;
                }
                System.out.print(mat[i][scol] + " ");
            }
            srow++;
            scol++;
            erow--;
            ecol--;
        }
        System.out.println();
    }

    public static int diagonal(int mat[][]) {

        int sum = 0;
        //----(TIME COMPLEXCITY N^2)  NOT A OPTIMIZED CODE
        // for (int i = 0; i < mat.length; i++) {
        //     for (int j = 0; j < mat[0].length; j++) {
        //         if (i == j) {
        //             sum = sum + mat[i][j];
        //         } else if (i + j == mat.length - 1) {
        //             sum = sum + mat[i][j];

        //         }
        //     }
        // }
        // System.out.println(sum);
        // return sum;



        //----- THIS IS SUM OF BOTH DIAGONAL ----

        
        for (int i = 0; i < mat.length; i++) {
        sum += mat[i][i];                        
        if (i != mat.length - i - 1) {                    // i + j =n-1;
        sum += mat[i][mat.length - i - 1];                   //j =n-1-i;
        }

        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String args[]) {
        int mat[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16, } };
        // sprialprint(mat );
        diagonal(mat);

    }
}
