import java.util.*;
import java.io.*;
public class Myadd2
{
public static void main(String[]args)
{
int a,b,c;
Scanner s=new Scanner(System.in);
System.out.println("enter the first number:\n");
a=s.nextInt();
System.out.println("enter the second number:\n");
b=s.nextInt();
c=a+b;
System.out.println("the sum is:\n"+c);
}
}