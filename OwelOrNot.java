//write a java program to check whether a string is owel or not.
import  java.util.*;
class OwelOrNot
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char c=s.next().charAt(0);
if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
{
System.out.println("entered string is a vowel");
}
else
{
System.out.println("entered string is a consonant");
}
}
}