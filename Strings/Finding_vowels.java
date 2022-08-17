
package com.mycompany.first;

import java.util.Scanner;
public class Finding_vowels {
    public static void isCount(String s1) {
        int i;
        char c1;
        int count1 = 0;
        int count2 = 0;
        for(i=0;i<s1.length();i++){
            c1 = s1.charAt(i);
            if(c1 == 'a' ||c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u'  ){
                count1++;
            }
            if(c1=='0' || c1=='1' || c1=='2' || c1=='3' || c1=='4' || c1=='5' || c1=='6' || c1=='7' || c1=='8' || c1=='9'){
                count2++;
            }
        }
        System.out.println(count1);
        System.out.println(count2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:");
        String s1 = sc.nextLine();
        
        isCount(s1);
    }
}
