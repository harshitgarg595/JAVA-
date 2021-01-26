//when we can give as mant arguments to the funcation 
package com.company;
import java.util.Scanner;
public class Main {
    static int sum(int...values)
            //int values[];
    {  int sum=0;
        for (int element : values) {
           sum += element;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(" addation of numbers is "+ sum(4));

    }
}



// when one more arguments are compulsory requried to execution 
package com.company;
import java.util.Scanner;
public class Main {
    static int sum(int x,int...values)
            //int values[];
    {  int sum=x;
        for (int element : values) {
           sum += element;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(" addation of numbers is "+ sum(4));

    }
}
