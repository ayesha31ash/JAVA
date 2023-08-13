import java.io.*;
import java.util.*;
public class Calculator
{
public static void main(String[]args)
{
int choice;
int n,r=0,i=0;
Scanner input=new Scanner(System.in);
System.out.println("enter the choice:1.even,2.odd,3.prime:");
choice= input.nextInt();
System.out.println("enter the number:");
n=input.nextInt();
switch(choice)
{
case 1:
System.out.println(n%2==0);
break;
case 2:
System.out.println("odd"); 
break;
case 3:
for(i=2;i<=n;i++)
r=n%i;
if(r==0)
System.out.println(n+"/"+i+"="+r);
break;
default:
System.out.println("no right choice selected");
}
}
}

