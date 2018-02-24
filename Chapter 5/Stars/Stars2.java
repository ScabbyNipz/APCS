//
//
//
//
//
public class Stars2
{
    public static void main(String[] args)
    {
        for (int row = 10; row >= 1; row--)
        {
            for (int stars = row; stars > 0; stars--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}