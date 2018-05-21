public class Triangle extends Shape
{
    private int base;
    private int height;

    public Triangle()
    {
        super("Triangle", 3);
    }
    public Triangle(b, h)
    {
    super("Triangle", 3);
    base = b;
    height = h;
    }
    public double getArea()
    {
        return .5 * base * height;
    }
}
