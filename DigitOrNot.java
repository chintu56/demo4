//write a java program to check whether a string is owel or not.
import  java.util.*;
class DigitOrnot
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter a number:");
int c=s.nextInt();
if(c==1||c==2||c==3||c==4||c==5||c==6||c==7||c==8||c==9)
{
System.out.println("DIGIT");
}
else
{
System.out.println("ALPHABET");
}
}
}