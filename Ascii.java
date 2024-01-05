import  java.util.*;
class Ascii
{
public static void main(String args[])
{
Scanner s=new  Scanner(System.in);
System.out.println("enter the character:");
char c=s.nextLine().charAt(0);
int ascii=c;
System.out.println("the ascii valve for " +c+ "is:" +ascii);
}
}
