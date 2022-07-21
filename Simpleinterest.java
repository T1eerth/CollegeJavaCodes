
package com.mycompany.first;
import java.util.Scanner;
/**
 *
 * @author Tirth
 */
public class Simpleinterest {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the principle amount");
        float principle=in.nextFloat();
        System.out.println("Enter the Rate of interest in %");
        int rate_of_interest=in.nextInt();
        System.out.println("Enter the Time period");
        int time=in.nextInt();
        System.out.println("Therefore the simple interest is "+(principle*rate_of_interest*time)/100);
    
    
}

}
