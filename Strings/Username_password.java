
package com.mycompany.first;

import java.util.Scanner;
public class Username_password{
    public static void toCheck(String username, String password, String conf_password) {
        if(username.isEmpty()||password.isEmpty()){
            System.out.println("Blank Username or Password.");
        }
        
        if(password.length()<8){
            System.out.println("Password should be minimum of 8 character");
        }
        else{
            System.out.println("Strong Password");
        }

        if(password.equals(username)){
            System.out.println("Password cannot be same as username");
        }

        if(conf_password.equals(password)){
            System.out.println("Confirm Password is same as Password");
        }
        else{
            System.out.println("Confirm password must be same as Password");
        }
    }
    public static void main(String[] args) {
        System.out.println("");
        Scanner sc = new Scanner(System.in);

        System.out.print("Username:");
        String username = sc.nextLine();

        System.out.print("Password:");
        String password = sc.nextLine();

        System.out.print("Confirm Password:");
        String conf_password = sc.nextLine();

        toCheck(username, password, conf_password);
    }
}