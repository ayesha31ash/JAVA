import java.util.*;
public class AnagramString
{
Static boolean is Anagrams(String str1,String str2)
{
if(str1.length()!=str2.length())
{
return false;
}
Char[] strArray1=str1.toCharArray();
Char[] strArray2=str2.toCharArray();
Arrays.Sort(strArray1);
Arrays.Sort(strArray2);
String SortedStr1=new String(strArray1);
String SortedStr2=new String(strArray2);
if(SortedStr1.equals(SortedStr2))
{
return true;
}
else
{
return false;
}
}
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter String 1:");
String str2=sc.next();
if(is Anagrams(str1,str2))
{
System.out.println("Anagram Strings!!");
}
else
{
System.out.println("String sre not Anagram!!");
}
}
}

