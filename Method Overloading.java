package com.company;

public class Main {
    static void name() {
        System.out.println("harshit");
    }
    static void name(int x)
    {
        System.out.println("harshit "+x);
    }
    static int  add(int x , int y) {
        int z=x+y;
    return z;
    }

    public static void main(String[] args) {
        int a=10 , b=45,c;
        c=add(a,b);
        System.out.println(c);
        name(a=200);
        name();
    }
}
