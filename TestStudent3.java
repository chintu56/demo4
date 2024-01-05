class Student2
{
int rollno;
String name;
void insertRecord(int r ,String n)
{
rollno=r;
name=n;
}
void displayInformation()
{
System.out.println(rollno+" "+name);
}
}
class TestStudent3
{
public static void main(String args[])
{
Student2 s1=new Student2();
Student2 s2=new Student2();
s1.insertRecord(14356,"bharath");
s2.insertRecord(14356,"chintu");
s1.displayInformation();
s2.displayInformation();
}
}
