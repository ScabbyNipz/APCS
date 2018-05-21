public class ShapeRunner
{
    public static void main(String[] args)
    {
        Triangle t1 = new Triangle(4,5);
        Circle c1 = new Circle(5);
        System.out.println("Larger Area: " + t1.largerArea(c1));
        System.out.println("Circle Perimeter: " + c1.getPerimeter());
        System.out.println(t1);
        System.out.println(c1);
    }
}