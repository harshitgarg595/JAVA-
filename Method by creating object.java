package com.company;
import java.util.Scanner;
public class Main {

     int average(int a, int b, int c) {
          int z;
          z=(a+b+c)/3;
        return z;
    }
    public static void main(String[] args) {
        System.out.println("enter the three number for calculating the average ");
        Scanner sc=new Scanner(System.in);
        int value= sc.nextInt();
        int value1=sc.nextInt();
        int value2=sc.nextInt();
        int c;
        Main obj=new Main();
        c=obj.average(value,value1,value2);
        System.out.println(c);

    }
}
