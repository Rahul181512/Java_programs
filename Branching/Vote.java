package Branching;

import java.util.Scanner;

public class Vote {
   public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a number : ");
        int age = sc.nextInt();

        if (age >=18){
            System.out.println("Person can cast vote.");
        }else{
            System.out.println("person is not eligible.");
        }
        sc.close();
    
}
}