package Branching;

import java.util.Scanner;

public class Ifzero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int a = sc.nextInt();

        if(a==0)
        {
            System.out.println("number is zero");
        
        }
        else {
             System.out.println("number is not zero");
        
        }
        sc.close();
    }
    
}
