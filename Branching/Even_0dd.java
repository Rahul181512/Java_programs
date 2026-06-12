package Branching;

import java.util.Scanner;

public class Even_0dd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int a = sc.nextInt();

        if (a%2 == 0) {
            System.out.println( "Entered number is even.");
        }else {
            System.out.println("Entered number is odd.");
        }
        sc.close();
    }
    
}
