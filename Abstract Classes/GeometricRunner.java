public class GeometricRunner
{
    public static void main(String[] args)
    {
        Triangle t1 = new Triangle();
        System.out.println(t1);
        
        GeometricObject t2 = new Triangle(2, 4, 6);
        System.out.println(t2);
    }
}