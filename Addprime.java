import java.io.*;
import java.util.*;
public class Addprime
{
public static void main(String[]args)
{
int i=0;
int num=0;sum=0;
System.out.println("prime number form 1 to 100 are:");
for(i=0;i<=100;i++)
{
int counter=0;
for(num=i;num>=1;num--)
{
if(i%num==0)
{
counter=counter+1;
}
}
if(counter==2)
System.out.println(i+" ");
sum=sum+i;
}
}
System.out.println();
System.out.println("the sum of prime number is"+sum);
}
}
