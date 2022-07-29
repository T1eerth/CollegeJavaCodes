
package com.mycompany.first;

import java.util.*;
public class SurfaceArea_volume{
    public static void main(String[] args){
        Scanner obj=new Scanner (System.in);
        System.out.println("Enter the Width");
        float w=obj.nextFloat();
                System.out.println("Enter the Length");
        float l=obj.nextFloat();
                System.out.println("Enter the Height");
        float h=obj.nextFloat();
        float surface_Area=2*((l+w)+(w*h)+(h*l));
        System.out.println("Surface area"+surface_Area);
        System.out.println("The suface area is " +l*w*h);
    
    }
}
