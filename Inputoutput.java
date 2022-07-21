
package com.mycompany.first;
import java.util.Scanner;

/**
 *
 * @author Tirth
 */
public class Inputoutput {
    public static void main (String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the age");
        int age=in.nextInt();
        System.out.println("Enter the Name");
        String name=in.next();
        System.out.println("Enter the CGPA");
        float cgpa=in.nextFloat();
        System.out.println("Enter the address");
        in.nextLine();
        String addr=in.nextLine();
        System.out.println("Enter sex");
        char sex=in.next().charAt(0);
        System.out.println("age="+age);
        System.out.println("Name="+name);
        System.out.println("CGPA="+cgpa);
        System.out.println("Address="+addr);
        System.out.println("SEX="+sex);
    }
    
}