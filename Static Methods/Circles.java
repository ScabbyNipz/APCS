//
//
//
//
//
public class Circles
{
    private double radius;
    private static int numOfObjects;
    
    public Circles(double r, int n)
    {
        radius = r;
        numOfObjects = n;
    }
    public static int getNumObjects()
    {
        return numOfObjects;
    }
    public static void setNumOfObjects(int n)
    {
        numOfObjects = n;
    }
    public double getTotalArea()
    {
        return (Math.PI * radius * radius * numOfObjects);
    }
    public String toString()
    {
        return "Radius = " + radius + "\nNumber of Circles= " + numOfObjects
            + "\nTotal Area= " + (Math.PI * radius *radius * numOfObjects);
    }
}