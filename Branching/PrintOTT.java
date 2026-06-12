package Branching;

import java.util.Scanner;

public class PrintOTT {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num == 1) {
            System.out.println("One");
        }
        else if (num == 2) {
            System.out.println("Two");
        }
        else if (num == 3) {
            System.out.println("Three");
        }
        else if (num == 4) {
            System.out.println("Four");
        }
      
        else {
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}



/*import java.util.Scanner;

public class PrintOTT {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        switch(num) {
            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");
                break;

            case 3:
                System.out.println("Three");
                break;

            case 4:
                System.out.println("Four");
                break;

            case 5:
                System.out.println("Five");
                break;
           
               
            default:
                System.out.println("Invalid Number");
        }

        sc.close();
    }
}*/