package Branching;

import java.util.Scanner;

public class Pos_neg {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter a number : ");
        int a = sc.nextInt();

        if (a>0) {
            System.out.println("Entered Number is Posivtive.");
        } else if (a<0){
            System.out.println("Entered Number is Negative.");
        }else {
            System.out.println("Entered Number is Zero.");
        }

            sc.close();
        }

    }
    

