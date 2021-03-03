package com.company;
import java.util.Scanner;

public class ans4 {
    public static void main(String[] args) {
        System.out.println("enter the number which table you want to print reverse");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=10;i>=1;i--){
            System.out.println(n*i);

        }

    }
}
