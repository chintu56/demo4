import  java.util.*;
class IfElseExample
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the value of  i:");
int i=s.nextInt();
System.out.println("enter the value of j:");
int  j=s.nextInt();
if (j==0)
System.out.println("Division Error");
else
System.out.println(i+"divided by"+j+"is "+(i/j));
i=i+j;
}
}

