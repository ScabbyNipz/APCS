public class Square extends Shape
{
    private int side;
    
    public Square()
    {
        super("Square", 4);
        side = 1;
    }
    public Square(int s)
    {
        super("Square", 4);
        side = s;
    }
}