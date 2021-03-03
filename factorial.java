package com.company;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.println("enter the number for factorial");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;

        for(int i=1;i<=n;i++) {
            fact = fact * i;
        }

            System.out.println(fact);
        }
    }

