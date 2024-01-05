class Rectangle
{
int length;
int width;
int height;
void insert(int l,int w ,int h)
{
length=l;
width=w;
height=h;
}
void calculateArea()
{
System.out.print("Area of Rectangle:");
System.out.println(length*width);
}
void calculatePerimeter()
{
System.out.print("Perimeter of Rectangle:");
System.out.println(2*length*width);
}
void calculateVolume()
{
System.out.print("Volume of Rectangle:");
System.out.println(length*width*height);
}
}
class TestRectangle
{
public static void main(String args[])
{
Rectangle r1=new Rectangle();
Rectangle r2=new Rectangle();
r1.insert(12,34,45);
r2.insert(34,55,45);
r1.calculateArea();
r2.calculateArea();
r1.calculatePerimeter();
r2.calculatePerimeter();
r1.calculateVolume();
r2.calculateVolume();
}
}
