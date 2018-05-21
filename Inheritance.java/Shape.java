public class Shape
{
    private String name;
    private int numSides;
    private int sideLength;
    private int area;
    
    public class Shape()
    {
        name = "Square";
        numSides = 4;
        sideLength = 1;
    }
    public class Shape(n, s)
    {
        name = n;
        numSides = s;
    }
    public String getName()
    {
        return name;
    }
    public int getNumSides()
    {
        return numSides;
    }
    public double getArea()
    {
        return Math.pow(sideLength, 2);
    }
    public double largerArea(Shape other)
    {
     if(this.getArea() > other.getArea())
        return this.getArea();
     else
        return other.getArea();
    }
    public String toString()
    {
        return "Shape: " + name + "\nNumber of Sides: " + numSides
            + "\nArea: " + this.getArea();
    }
}