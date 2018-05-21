public class Circle extends Shape
{
    private double radius;
    
    public Circle()
    {
        super("Circle", 0);
        radius = 1;
    }
    public Circle(double r)
    {
        super("Circle", 0);
        radius = r;
    }
    //override getArea() from shapes
    public double getArea()
    {
        return Math.PI *Math.pow(radius,2);
    }
    public double getPerimeter()
    {
        String hello = getName() + "HI";
        return 2 * Math.PI * radius;
    }
    
}