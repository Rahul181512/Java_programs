package Branching;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" enter start of  range : ");
        int start = sc.nextInt();

        System.out.println("enter end of range : ");
        int end = sc.nextInt();

        System.out.println("enter Divisor : ");
        int n = sc.nextInt();

        int count = 0;

        for(int i=start ; i<=end ; i++){
            if(i%n==0){
                count++;
            }
        }

        System.out.println("Number of values divisible by " + n + " is" + "=" + count);
        sc.close();
    
}
}