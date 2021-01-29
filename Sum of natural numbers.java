package com.company;

public class ans3 {
    static int naurtal(int n) {
        
        if (n == 0 || n == 1)
        {
           return 1;
        }
        else
        {
            return n + naurtal(n - 1);
        }
    }
        public static void main (String[]args){
            float c = naurtal(5);
            System.out.println(c);
        }
    }
