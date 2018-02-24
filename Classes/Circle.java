// Circle class

public class Circle
{
private double radius;

public Circle()
{
radius = 0;
}
public Circle(double r)
{
radius = r;
}
public void setRadius(double r)
{
radius = r;
}
public double getRadius()
{
return radius;
}
public double getArea()
{
return Math.PI * radius * radius;
}
public double getPerimeter()
{
return 2 * Math.PI * radius;
}
public String toString()
{
return "Radius: " + radius
+ "\nArea: " + getArea()
+ "\nPerimeter: " + getPerimeter();
}
}