qimport  java.io.*;
import java.util.Scanner;
class SwitchExample
{
static public void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
System.out.println(SwitchExample.printDay(a));
}
public static String printDay(int dayno)
{
String day;
switch(dayno)
{
case 0:
{
day="SUNDAY";
break;
}
case 1:
{
day="MONDAY";
break;
}
case 2:
{
day="TUESDAY";
break;
}
case 4:
{
day="WEDNESDAY";
break;
}
case 5:
{
day="THURSADY";
break;
}
case 6:
{
day="FRIDAY";
break;
}
case 7:
{
day="SATURDAY";
break;
}
default:day="INVALID";
}
return day;
}
}

