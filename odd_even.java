//Write a java code to print odd or even using if else statement
package com.mycompany.first;
import java.util.*;
/**
 *
 * @author Tirth
 */
public class odd_even {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=obj.nextInt();
        if (num%2==0){
            System.out.println("The number is even");
        }
            else System.out.println("The number is odd");
                    
        }
        
    }
    
    
}
