package Operator;
import java.util.Scanner;

public class RectanglePA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length a : " );
        int a = sc.nextInt();

        System.out.println("Enter breadth b : " );
        int b = sc.nextInt();

        int Area = a*b;
        int Perameter = 2*(a+b);

        System.out.println(" Rectangle Area is = " + Area);
        System.out.println(" Rectangle Perameter is = " + Perameter);

        sc.close();



    }
    
}
