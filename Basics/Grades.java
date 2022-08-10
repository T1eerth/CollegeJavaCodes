//Create a java code to print the grade for marks with the follwoing constraints
package com.mycompany.first;
import java.util.Scanner;

/**
 *
 * @author Tirth
 */
public class Grades {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks=obj.nextInt();
        if(marks>=91 & marks<=100)
        {
            System.out.println("O");
        }
        else if(marks>=81 & marks<=90)
        {
            System.out.println("A");
        }
        else if(marks>=81 & marks<=90)
        {
            System.out.println("A");
        }
        else if(marks>=71 & marks<=80)
        {
            System.out.println("B");
        }
        else if(marks>=61 & marks<=70)
        {
            System.out.println("C");
        }
        else if(marks>=50 & marks<=60)
        {
            System.out.println("D");
        }else if(marks<49)
        {
            System.out.println("RA");
        }
        
        
    }
    
}
