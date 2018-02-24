//*****************************************************************************
//
//
//
//
//*****************************************************************************
public class CircleRunner
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle(7);
        System.out.println(c1.getArea());
        c1.setRadius(5.47);
        System.out.println(c1.toString());
        Circle c2 = new Circle();
        System.put.println(c2.toString);
        c2.setRadius(12);
        if(c1.getradius() > c2.getRadius());
        {
            System.out.println("Circle one has a larger radius.");
        }
        else if(c1.getradius() > c2.getRadius());
        {
            System.out.println("Circle two has a larger radius.");
        }
        else 
        {
            System.out.println("Both radii are the same.");
        }
        System.out.println(c2);
    }
}