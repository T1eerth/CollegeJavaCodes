
package com.mycompany.first;

/**
 *
 * @author Tirth
 */
import java.util.Scanner;

public class Month{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("21BCE2058");
        System.out.println("Enter the month");
        String month = sc.nextLine();
        if(month.equalsIgnoreCase("January") || month.equalsIgnoreCase("March" )|| month.equalsIgnoreCase("May" ) ||month.equalsIgnoreCase("July" ) || month.equalsIgnoreCase("August" ) || month.equalsIgnoreCase("October" )|| month.equalsIgnoreCase("December" )){
            System.out.println("31");
        }
        else if(month.equalsIgnoreCase("April" )|| month.equalsIgnoreCase("June" ) || month.equalsIgnoreCase("September" ) || month.equalsIgnoreCase("November" )){
            System.out.println("30");
        }
        else if(month.equalsIgnoreCase("February" )){
            System.out.println("28 or 29 in leap year");
        }
        else{
            System.out.println("Invalid");
        }
    }
}

