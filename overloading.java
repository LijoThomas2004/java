class overloading 
{
void area(int l,int b)
{
System.out.print("\n The area of rectangle="+(l*b));
}
void area(double b, double h)
{
System.out.print("\n The area of triangle="+(0.5*b*h));
}
void area(double r)
{
 System.out.print("\n The area of circle="+(3.14*r*r));
}
}
public class areaoverloading
{
public static void main(String args[])
{
 overloading obj= new overloading ();
 obj.area(5.5,3.5);
 obj.area(10,20);
 obj.area(4.5);
}
}