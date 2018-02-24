public class CirclesRunner
{
    public static void main(String[] args)
    {
        Circles c1 = new Circles(2.5, 4);
        System.out.println(c1);
        
        Circles.setNumOfObjects(6);
        
        System.out.println(c1);
        
        Circles c2 = new Circles(4, 3);
        System.out.println(c2);
        System.out.println();
        System.out.println(c1);
    }
}