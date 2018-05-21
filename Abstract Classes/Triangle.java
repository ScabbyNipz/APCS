//***********************************************************************************
//
//
//
//***********************************************************************************
public class Triangle extends GeometricObject
{
    private double side1, side2, side3;
    
    public Triangle()
    {
       super("triangle", "green");
       side1 = 1;
       side2 = 1;
       side3 = 1;
    }
    public Triangle(double s1, double s2, double s3)
    {
        super("triangle", "green");
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }
    public double getPerimeter()
    {
        return side1 + side2 + side3;
    }
    public double getArea()
    {
        double p = getPerimeter()/2;
        return Math.sqrt(p*(p - side1)*(p - side2)*(p - side3));
    }
    public String toString()
    {
        return super.toString() + "\nArea: " + getArea() + "\nPerimeter: "
            + getPerimeter();
    }
}