public class TrianglePractice extends GeometricObject implements Colorable
{
    private double side1;
    private double side2;
    private double side3;
    private double area;
    private double perimeter;
    
    public TrianglePractice ()
    {
        side1 = 1;
        side2 = 1;
        side3 = 1;
    }
    public TrianglePractice (double s1, double s2, double s3)
    {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }
    public double getSide1()
    {
        return side1;
    }
    public double getSide2()
    {
        return side2;
    }
    public double getSide3()
    {
        return side3;
    }
    public double getPerimeter()
    {
        perimeter = side1 + side2 + side3;
        return perimeter;
    }
    public double getArea()
    {
        area = Math.sqrt((perimeter*(perimeter-side1))*(perimeter-side2)*(perimeter-side3));
        return area;
    }
    public void howToColor()
    {
        System.out.println("Color all 3 sides.");
    }
    public String toString()
    {
        return super.toString() + "Triangle Side 1: "+ side1 + "\nSide 2: " + side2 + "\nSide3: "
            + side3;
    }
}