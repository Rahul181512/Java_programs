package Operator;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number a : " );
        int a = sc.nextInt();

        System.out.println("Enter number b : " );
        int b = sc.nextInt();

        int temp =a ;
         a = b;
         b = temp;


        System.out.println("After swapping : ");
        System.out.println(" a is = " + a);
        System.out.println(" b is = " + b);

        sc.close();



    }
    
}
