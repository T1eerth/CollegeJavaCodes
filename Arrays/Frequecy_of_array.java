
package com.mycompany.first;

import java.util.Scanner;

public class Frequecy_of_array {
    
    public static void findFrequency(int[] arr, int n) {
        int i,j;
        
        for(i=0;i<n;i++){
            int count=0;
            for(j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            System.out.println(arr[i]+"="+count);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number elements of the Array=");
        int n = sc.nextInt();
        int i;
        int[] arr = new int[n];

        System.out.print("Enter the elements of Array=");
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        findFrequency(arr, n);
    }
}
