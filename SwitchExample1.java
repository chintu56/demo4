import  java.io.*;
import java.util.Scanner;
class SwitchExample1
{
static public void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
System.out.println(SwitchExample.printMonth(a));
}
public static String printMonth(int monthno)
{
String month;
switch(monthno)
{
case 0:
{
day="JANUARY";
break;
}
case 1:
{
day="FEBRUARY";
break;
}
case 2:
{
day="MARCH";
break;
}
case 4:
{
day="APRIL";
break;
}
case 5:
{
day="MAY";
break;
}
case 6:
{
day="JUNE";
break;
}
case 7:
{
day="JULY";
break;
case 8:
{
day="AUGUST";
break;
case 9:
{
day="SEPTEMBER";
break;
case 10:
{
day="OCTOBER";
break;
case 11:
{
day="NOVEMBER";
break;
case 12:
{
day="DECEMBER";
break;
}
default:day="INVALID";
}
return day;
}
}

