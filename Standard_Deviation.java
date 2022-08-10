
package com.mycompany.first;
import java.util.Scanner;

public class Standard_Deviation {
    public static void stanDeviation(int[] arr1, int n) {
        int average=0;
        int i;
        double sqr=0;

        for(i=0;i<n;i++){
            average = average + arr1[i];
        }
        double avg = average/n;

        for(i=0;i<n;i++){
            sqr = sqr + Math.pow((arr1[i]-avg), 2);
        }

        double sd = sqr/n;

        double StandardDeviation = Math.sqrt(sd);

        System.out.println(StandardDeviation);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array=");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int i;

        System.out.println("Enter the elements of Array:");
        for(i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }

        stanDeviation(arr1,n);
    }
}
