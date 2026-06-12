package Branching;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Percentage: ");
        float percentage = sc.nextFloat();

        if (percentage >= 60) {
            System.out.println("First Division");
        }
        else if (percentage >= 45) {
            System.out.println("Second Division");
        }
        else if (percentage >= 33) {
            System.out.println("Third Division");
        }
        else {
            System.out.println("Fail");
        }

        sc.close();
    }
}
