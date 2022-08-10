package com.mycompany.first;
import java.util.*;
/**
 *
 * @author Tirth
 */
public class Abcd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a five digit number");
        int A=0,B=0,C=0,D=0,E=0,count=0;
        int n=sc.nextInt();
        int i=n;
        if(i/10000>0 && i/10000<10)
        {
           while (n> 0) {

            
            count ++;
            if (count == 1)
            {
                E = n%10;
            }
    
            else if (count == 2)
            {
                D = n%10;
            }
            else if (count == 3)
            {
                C = n%10;
            }
            else if (count == 4)
            {
                B = n%10;
            }
            else if (count == 5)
            {
                A = n%10;
            }
            n = n / 10;
            
        } 
            
        
        
            if ((A+B+C) == (D+E))
            {
                System.out.println("Lucky Number!!");
            }
            else
            {
                System.out.println("Unlucky Number!!");
            }
        }
        
        else
        {
            System.out.println("Enter a five digit number!!");
        }
}
    
}   
        
        
        

    


