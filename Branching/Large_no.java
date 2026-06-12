package Branching;

import java.util.Scanner;

public class Large_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first number : ");
        int a = sc.nextInt();

        System.out.println("Enter second number : ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("a is largest number ");
            
        }else
            System.out.println(" b is the largest number ");

            sc.close();
    }
    
}
