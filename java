import java.io.*;
import java.util.*;
class stringchecking
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
String s1,s2;
System.out.print("enter first string");
s1=sc.nextLine();
System.out.print("enter string");
s2=sc.nextLine();
if(s1.compareTo(s2)>0)
System.out.print("positive");
else if(s1.compareTo(s2)==0)
System.out.print("both are same");
else
System.out.print("negative");
}
}
import java.io.*;
import java.util.*;
class stringsubstring
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
String s1,s2;
System.out.print("enter first string");
s1=sc.nextLine();
System.out.print("enter sub string");
s2=sc.nextLine();
if(s1.contains(s2))
System.out.print("yes");
else
System.out.print("no");
}
}
