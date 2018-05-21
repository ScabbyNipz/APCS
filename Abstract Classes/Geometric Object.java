//*****************************************************************
//
//
//
//*****************************************************************
import java.util.Date;
public abstract class GeometricObject
{
    private String name;
    private String color = "blue";
    private Date dateCreated;
    
    public GeometricObject()
    {
        dateCreated = new date();
    }
    public GeometricObject(String n, String c)
    {
        dateCreated = new Date();
        name = n;
        color = c;
    }
    public String getName()
    {
        return name;
    }
    public String getColor()
    {
        return color;
    }
    public Date getDate()
    {
        return dateCreated;
    }
    public String toString()
    {
        return "Name: " + name + "\nColor: " + color;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}