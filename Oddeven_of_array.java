
package com.mycompany.first;

import java.util.Arrays;
import java.util.Scanner;

public class Oddeven_of_array{

    public static void dispay(int[] original_array,int n) {
        int i;
        int j=0;
        int k=n-1;
        int final_array[] = new int[n];
        
        for(i=0;i<n;i++){
            if(original_array[i]%2==0){
                final_array[k--] = original_array[i];
            }
            else{
                final_array[j++] = original_array[i];
            }
        }
        System.out.println(Arrays.toString(final_array));
    }
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the total number of array=");
        n = sc.nextInt();
        int[] original_array = new int[n];
        int i;
        for(i=0;i<n;i++){
            original_array[i] = sc.nextInt();
        }

        dispay(original_array,n);
    }
}
