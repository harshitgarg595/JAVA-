package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int rem,rev=0;
        int temp;
        temp=number;
        while(number !=0)
        {
            rem=number%10;
            rev=(rev*10)+rem;
            number=number/10;

        }
        System.out.println(rev);
        if(temp==rev)
        {
            System.out.println("palindrome is ");
        }
        else
            System.out.println("palindrome is not possible");
        
    }
    
}
