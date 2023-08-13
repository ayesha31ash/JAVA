import java.io.*;
import java.util.*;
public class Pattern
{
public static void main(String[]args)
{
System.out.println("Pyramid pattern of star");
drawPyramidOfPattern();
System.out.println("Pyramid pattern of numbers");
drawPyramidOfNumbers();
}
public static void drawPyramidOfPattern()
{
for(int i=0;i<5;i++)
{
for(int j=0;j<5-i;j++)
{
System.out.print(" ");
}
for(int k=0;k<=i;k++)
{
System.out.print("* ");
}
System.out.println();
}
}
public static void drawPyramidOfNumbers()
{
for(int i=0;i<5;i++)
{
for(int j=0;j<5-i;j++)
{
System.out.print(" ");
}
for(int k=0;k<=i;k++)
{
System.out.print(k+" ");
}
System.out.println();
}
}
}