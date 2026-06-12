package Branching;

import java.util.Scanner;

public class Scon_hms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter seconds : ");
        int t_seconds =sc.nextInt();

       int hours = t_seconds/3600;
       int  remaining = t_seconds%3600;

       int  minutes = remaining/60;
       int seconds = remaining%60;

        System.out.println("hours : " + hours);
        System.out.println("minutes : " + minutes);
        System.out.println("seconds : " + seconds);

        sc.close();

    }
    
}
