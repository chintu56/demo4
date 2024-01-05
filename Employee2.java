class Employee1
{
int eno;
String ename;
String edept;
void insertRecord(int r ,String n ,String d)
{
eno=r;
ename=n;
edept=d;
}
void displayInformation()
{
System.out.println(eno+" "+ename+" "+edept);
}
}
class Employee2
{
public static void main(String args[])
{
Employee1 s1=new Employee1();
Employee1 s2=new Employee1();
s1.insertRecord(14356,"bharath" ,"cse");
s2.insertRecord(14356,"chintu","aids");
s1.displayInformation();
s2.displayInformation();
}
}
