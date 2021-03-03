package com.company;

import java.util.Scanner;

public class ans9 {
    public static void main(String[] args) {
        System.out.println("enter the number to add its table ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=10;i++){
            sum=sum+(n*i);

        }
        System.out.println(sum);
    }
}
