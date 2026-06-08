package Operator;
import java.util.Scanner;
public class Product {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("enter first nmber : ");
      int a = sc.nextInt();

      System.out.println("Enter second number : ");
      int b = sc.nextInt();

      int Product = a*b;

      System.out.println("Product of two numbers = " + Product);
      sc.close();

    }
    
}
