package com.company;
import java.util.Scanner;
public class Main {
    static int factorial(int n ){
        int mul=1;
        if(n==0 || n==1)
        {
            return 1;
        }
        else
            mul=mul* n*factorial(n-1);

          return mul;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to calculate the factorial");
        int value=sc.nextInt();
        System.out.println(" the factorial of given number is "+factorial(value ));

    }
}
