package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n=sc.nextInt();
        int a=0, b=1,result;
        System.out.print(a+ " ," +b);
        for(int i=0;i<=n;i++)
        {
            result=a+b;
            System.out.print(" , " +result);
            a=b;
            b=result;
        }

    }
}
