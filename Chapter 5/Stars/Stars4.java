//****************************************************************************
//
//
//
//****************************************************************************
public class Stars4
{
    public static void main(String[] args)
    {
    for (int row = 10; row >= 1; row--)
        {
            for (int space = 10 - row; space >= 0; space--)
            {
                System.out.print(" ");
            }
            for (int stars = row; stars > 0; stars--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}