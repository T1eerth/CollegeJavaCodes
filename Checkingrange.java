
package com.mycompany.first;

/**
 *
 * @author Tirth
 */
import java.util.Scanner;

public class Checkingrange{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.print("Enter any number between 1 to 100 = ");
        
        int n = sc.nextInt();
        
        if(n>1 && n <100){            
            System.out.println("Thank you.....Welcome again");
        }
        else{
            System.out.println("Sorry, "+n+" is not between 1 to 100 ");
        }
    }
}

