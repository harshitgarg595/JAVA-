package com.company;
import java.util.Scanner;
public class Main {
static int  table(int n)
{
    int mul=1;
    for(int i=1;i<=10;i++) {
        mul = n * i;
        System.out.println(mul);
    }
    return mul;
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number for its table");
        int value=sc.nextInt();
        System.out.println("the table of given number is "+table(value));



    }
}
