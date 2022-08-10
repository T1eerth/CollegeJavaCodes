
package com.mycompany.first;
import java.util.Arrays;
import java.util.Scanner;

public class Transpose_of_array {
    
    public static void toTranspose(int[][] mat1,int row, int column) {
        int[][] transpose_matrix = new int[row][column];
        int i,j;

        for(i=0;i<row;i++){
            for(j=0;j<column;j++){
                transpose_matrix[j][i] = mat1[i][j];
            }
        }

        System.out.println("Original Matrix:");
        for(i=0;i<row;i++){
            for(j=0;j<column;j++){
                System.out.print(mat1[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Transpose Matrix:");
        for(i=0;i<row;i++){
            for(j=0;j<column;j++){
                System.out.print(transpose_matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("21BCE0036");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows=");
        int row = sc.nextInt();

        System.out.print("Enter the number of columns=");
        int column = sc.nextInt();

        int[][] mat1 = new int[row][column];
        int i,j;

        System.out.println("Enter the elements of the Array:");
        for(i=0;i<row;i++){
            for(j=0;j<column;j++){
                mat1[i][j] = sc.nextInt();
            }
        }
        toTranspose(mat1, row, column);
    }
}

