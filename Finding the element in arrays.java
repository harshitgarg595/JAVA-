import java.util.Scanner;

public class ans2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of  array ");
        int n=sc.nextInt();
        int [] a=new int[n];
        boolean flag=false;
        System.out.println("enter the elements one by one ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter the element which you want to find ");
        int value=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]==value)
            {
                flag = true;
            }
            else
                flag=false;
        }
        if(flag==true)
        {
            System.out.println("in the array ");
        }
        else
            System.out.println("not in array ");
    }
}
