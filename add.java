package Sayan_Github.Demo2;

import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        System.out.println("Addition Result = "+Integer.valueOf(a+b));
    }
}
