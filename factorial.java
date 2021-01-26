package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        System.out.println("eneter the number to calculate its factorial");
        int number=sc.nextInt();
        int fact=1;
        for(int i=number;i>=1;i--)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
