package Branching;

import java.util.Scanner;

public class School {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int age = sc.nextInt();

        if (age >= 3) {
            System.out.println("Child can go to school. ");
        }
    else{
        System.out.println("Child can't go to school.");
    }
    sc.close();
    }
    
}
