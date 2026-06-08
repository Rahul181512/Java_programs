package Operator;
import java.util.Scanner;
public class Arithmatic {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("enter first nmber : ");
      int a = sc.nextInt();

      System.out.println("Enter second number : ");
      int b = sc.nextInt();
      int Sum = a + b;
      int Subtract = a-b;
      int Product = a*b;
      int Division = a/b;
      int Remainder = a%b;
      
      System.out.println("Sum of two numbers = " + Sum);
      
      System.out.println("Subtract of two numbers = " + Subtract);

      System.out.println("Product of two numbers = " + Product);
      
      System.out.println("Division of two numbers = " + Division);
      
      
      System.out.println("Remainder of two numbers = " + Remainder);
      

      sc.close();

    }
    
}
