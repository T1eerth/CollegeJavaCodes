
package com.mycompany.first;

/**
 *
 * @author Tirth
 */
public class Floyds_triangle {
    public static void main(String[] args){
        int n=4;
        int number=1;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
    
}
