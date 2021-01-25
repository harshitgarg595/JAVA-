Com.Company 
import java.util.Scanner;
public class Main{
public static void main(String[] args){
System.out.println("Enter the year to check")
Scanner sc=new Scanner(System.in);
int value=sc.nextInt();
if(value%400==0)
{
System.out.println(" Given year is leap year ");
}
else if(value%4==0 && value%100 !=0)
{
System.out.println(" Given year is leap year ");
}
else
System.out.println(" Given year is not a leap year ");




}
}
