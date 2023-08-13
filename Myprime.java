import java.util.*;
import java.io.*;
public class Myprime
{
public static void main(String[]args)
{
int num,i,count=0;
Scanner s=new Scanner(System.in);
System.out.println("enter the number:\n");
num=s.nextInt();
for(i=2;i<num;i++)
{
if(num%i==0)
{
count++;
}
}
if(count==0)
{
System.out.println("this is a prime number");
}
else
{
System.out.println("this is not a prime number");
}
}
}