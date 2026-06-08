package Operator;

import java.util.Scanner;

public class CirclePA {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
         System.out.print("enter Radius : ");
         double R = sc.nextDouble();
         
         double Area = Math.PI*R*R;
         double Parameter = 2*Math.PI*R;

         System.out.println(" Area of Circle is = " + Area );
         System.out.println(" Parameter of Circle is = " + Parameter );
         
         sc.close();
    
}
}